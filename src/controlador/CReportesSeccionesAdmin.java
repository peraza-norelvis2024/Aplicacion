// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.ReportesSeccionesAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;


import conexion.CConexion;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.*;
import modelo.MAsignatura;
import modelo.MEstudiante;
import modelo.MCarrera;
import modelo.MSemestre;
import modelo.MDecanato;
import modelo.MSeccion;
import modelo.MProfesor;

public class CReportesSeccionesAdmin {
    private ReportesSeccionesAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaAsignatura;
    private HashMap<String, Integer> mapaEstudiante;
    private MAsignatura asignatura;
    private MEstudiante estudiante;
    private HashMap<String, Integer> mapaCarrera;
    private HashMap<String, Integer> mapaSemestre;
    private MCarrera carrera;
    private MSemestre semestre;
    private HashMap<String, Integer> mapaDecanato;
    private HashMap<String, Integer> mapaSeccion;
    private MDecanato decanato;
    private MSeccion seccion;
    private HashMap<String, Integer> mapaProfesor;
    private MDecanato profesor;
    private List<MSeccion> arraySecciones;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CReportesSeccionesAdmin(ReportesSeccionesAdmin view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.view.getComboSeccionesRet().addItem("Seleccione opción");
        this.view.getComboSeccionesRet().addItem("Reporte general");
        this.view.getComboSeccionesRet().addItem("Reporte por sección");
        this.view.getComboSeccionRet().addItem("Seleccione opción");
        this.llenarCbxSecciones();
        
        //Accion de boton atras
        this.view.getBontonAtrasSeccionRet().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardAdministrador frm = new DashboardAdministrador();
                CDashboardAdministrador controladorDashboardAdmin = new CDashboardAdministrador(frm, sesion);
                frm.setVisible(true);
                view.dispose();
            }
        });
        
        this.view.getComboSeccionesRet().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = view.getComboSeccionesRet().getSelectedIndex();
                if(index == 0){
                    view.getComboSeccionRet().setEnabled(false);
                }
                
                else if(index == 1){
                    reporteGeneral();
                    view.getComboSeccionRet().setEnabled(false);
                }
                
                else if(index == 2){
                    view.getComboSeccionRet().setEnabled(true);
                }
            }
        });
        
        this.view.getComboSeccionRet().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = view.getComboSeccionRet().getSelectedIndex();
                if (index > 0) {
                    DefaultTableModel model = (DefaultTableModel) view.getTableSec().getModel();
                    model.setRowCount(0);
                    String nombreSeccion = (String) view.getComboSeccionRet().getSelectedItem();
                    int codigoSeccion = mapaSeccion.get(nombreSeccion);
                    mostrarDatosSeccion(codigoSeccion);
                }
            }
        });
    }
    
    private void reporteGeneral(){
        String sql = ""
                + "SELECT s.numero AS nombre_seccion, "
                + "AVG(n.nota) AS promedio_notas, "
                + "COUNT(CASE WHEN n.nota >= 48 THEN 1 ELSE NULL END) AS estudiantes_aprobados, "
                + "COUNT(CASE WHEN n.nota < 48 THEN 1 ELSE NULL END) AS estudiantes_reprobados, "
                + "c.nombre as nombre_carrera, "
                + "d.nombre as nombre_decanato, "
                + "a.nombre as nombre_asignatura, "
                + "p.nombre as nombre_profesor, "
                + "p.apellido as apellido_profesor "
                + "FROM seccion s "
                + "INNER JOIN nota n ON s.codigo = n.seccion_id "
                + "INNER JOIN asignatura a ON s.asignatura_id = a.codigo "
                + "INNER JOIN profesor p ON s.profesor_id = p.codigo "
                + "INNER JOIN carrera c ON a.carrera_id = c.codigo "
                + "INNER JOIN decanato d ON c.decanato_id = d.codigo "
                + "INNER JOIN periodo_academico pa ON s.periodo_id = pa.codigo "
                + "WHERE s.estatus = true AND pa.estatus = true AND pa.activo = true "
                + "GROUP BY s.codigo, s.numero, c.nombre, d.nombre, p.nombre, p.apellido, a.nombre;";
        try{
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            DefaultTableModel newModel = new DefaultTableModel();
            newModel.addColumn("Decanato");
            newModel.addColumn("Carrera");
            newModel.addColumn("Asignatura");
            newModel.addColumn("Sección");
            newModel.addColumn("Profesor");
            newModel.addColumn("Promedio De La Sección");
            newModel.addColumn("Estudiantes Aprobados");
            newModel.addColumn("Estudiantes Reprobados");

            boolean encontro = false;
            while (resultSet.next()) {
                encontro = true;
                Object[] row = {
                    resultSet.getString("nombre_decanato"),
                    resultSet.getString("nombre_carrera"),
                    resultSet.getString("nombre_asignatura"),
                    resultSet.getString("nombre_seccion"),
                    resultSet.getString("nombre_profesor") + " " + resultSet.getString("apellido_profesor"),
                    resultSet.getFloat("promedio_notas"),
                    resultSet.getInt("estudiantes_aprobados"),
                    resultSet.getInt("estudiantes_reprobados")
                };

                ((DefaultTableModel) newModel).addRow(row);
            }
            if(encontro){
                this.view.getTableSec().setModel(newModel);
            } else {
                JOptionPane.showMessageDialog(view,"No se encontraron registros", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión, el statement y el resultSet
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void llenarCbxSecciones() {
        try {
            // Inicializar el mapaSeccion
            mapaSeccion = new HashMap<>();

            // Limpiar el combo de secciones antes de llenarlo
            view.getComboSeccionRet().removeAllItems();
            view.getComboSeccionRet().addItem("Seleccione opción");

            // Consulta SQL para obtener las secciones junto con el nombre de la asignatura a la que pertenecen
            String sql = "SELECT s.codigo AS codigo, s.numero AS nombre, s.estatus AS estatus, a.nombre AS nombre_asignatura " +
                         "FROM seccion s " +
                         "INNER JOIN asignatura a ON s.asignatura_id = a.codigo " +
                         "WHERE s.estatus = true;";

            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            // Iterar sobre los resultados y agregarlos al combo de secciones
            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombreSeccion = resultSet.getString("nombre");
                String nombreAsignatura = resultSet.getString("nombre_asignatura");
                boolean estatus = resultSet.getBoolean("estatus");

                // Construir el texto a mostrar en el combo, que incluye el nombre de la asignatura y el número de la sección
                String textoCombo = nombreAsignatura + " - Sección " + nombreSeccion;

                // Agregar el nombre de la sección al combo
                view.getComboSeccionRet().addItem(textoCombo);

                // Almacenar el código de la sección en el mapaSeccion
                mapaSeccion.put(textoCombo, codigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión, el statement y el resultSet
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private void mostrarDatosSeccion(int codigoSeccion) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Decanato");
        model.addColumn("Carrera");
        model.addColumn("Asignatura");
        model.addColumn("Sección");
        model.addColumn("Profesor");
        model.addColumn("Estudiante");
        model.addColumn("Nota");
        model.addColumn("Promedio de la Sección"); // Nueva columna para el promedio de la sección

        double promedioSeccion = obtenerPromedioSeccion(codigoSeccion); // Obtener el promedio de la sección

        try {
            String sql = "SELECT d.nombre AS decanato, c.nombre AS carrera, a.nombre AS asignatura, s.numero AS seccion, CONCAT(p.nombre, ' ', p.apellido) AS profesor " +
                         "FROM seccion s " +
                         "INNER JOIN asignatura a ON s.asignatura_id = a.codigo " +
                         "INNER JOIN carrera c ON a.carrera_id = c.codigo " +
                         "INNER JOIN decanato d ON c.decanato_id = d.codigo " +
                         "INNER JOIN profesor p ON s.profesor_id = p.codigo " +
                         "WHERE s.codigo = ?;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, codigoSeccion);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String decanato = resultSet.getString("decanato");
                String carrera = resultSet.getString("carrera");
                String asignatura = resultSet.getString("asignatura");
                String seccion = resultSet.getString("seccion");
                String profesor = resultSet.getString("profesor");

                model.addRow(new Object[]{decanato, carrera, asignatura, seccion, profesor, "", "", promedioSeccion}); // Añadir el promedio de la sección a cada fila
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        obtenerEstudiantesPorEncimaPromedio(codigoSeccion, model);
        obtenerEstudiantesPorDebajoPromedio(codigoSeccion, model);

        view.getTableSec().setModel(model);
    }

    private double obtenerPromedioSeccion(int codigoSeccion) {
        double promedio = 0.0;
        try {
            String sql = "SELECT AVG(nota) AS promedio " +
                         "FROM nota " +
                         "WHERE seccion_id = ?;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, codigoSeccion);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                promedio = resultSet.getDouble("promedio");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return promedio;
    }


    private void obtenerEstudiantesPorEncimaPromedio(int codigoSeccion, DefaultTableModel model) {
        try {
            String sql = "SELECT e.nombre AS nombre_estudiante, n.nota " +
                         "FROM estudiante e " +
                         "INNER JOIN nota n ON e.codigo = n.estudiante_id " +
                         "WHERE n.seccion_id = ? AND n.nota > (SELECT AVG(nota) FROM nota WHERE seccion_id = ?);";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, codigoSeccion);
            statement.setInt(2, codigoSeccion);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nombreEstudiante = resultSet.getString("nombre_estudiante");
                double nota = resultSet.getDouble("nota");

                model.addRow(new Object[]{"", "", "", "", "", nombreEstudiante, nota, "Por Encima"});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void obtenerEstudiantesPorDebajoPromedio(int codigoSeccion, DefaultTableModel model) {
        try {
            String sql = "SELECT e.nombre AS nombre_estudiante, n.nota " +
                         "FROM estudiante e " +
                         "INNER JOIN nota n ON e.codigo = n.estudiante_id " +
                         "WHERE n.seccion_id = ? AND n.nota < (SELECT AVG(nota) FROM nota WHERE seccion_id = ?);";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, codigoSeccion);
            statement.setInt(2, codigoSeccion);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nombreEstudiante = resultSet.getString("nombre_estudiante");
                double nota = resultSet.getDouble("nota");

                model.addRow(new Object[]{"", "", "", "", "", nombreEstudiante, nota, "Por Debajo"});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}