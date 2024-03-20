// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import java.sql.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import vistas.ModificarNotaProf;
import vistas.DashboardProfesor;
import modelo.Sesion;
import conexion.CConexion;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.MCarrera;
import modelo.MEstudiante;
import modelo.MNota;
import modelo.MSeccion;


public class CModificarNotasProf {
    private ModificarNotaProf view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private MEstudiante estudiante;
    private HashMap<String, Integer> mapaAsignaturas;
    private HashMap<String, Integer> mapaSecciones;
    private List<MNota> arrayNotas;
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    
    public CModificarNotasProf(ModificarNotaProf view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.estudiante = null;
        this.mapaAsignaturas = new HashMap<>();
        this.mapaSecciones = new HashMap<>();
        this.arrayNotas = new ArrayList<MNota>();
        
        DefaultTableModel tabla = (DefaultTableModel) view.getTablaNota().getModel();
        tabla.setRowCount(0);
        
        this.view.getBotonBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = view.getCampoCedula().getText();
                if(!cedula.isEmpty()){
                    buscarCedula(cedula);
                }else{
                    JOptionPane.showMessageDialog(view,"Debe seleccionar una asignatura", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private void buscarCedula(String cedula){
        try{
            String sql = "SELECT e.codigo as codigo, e.nombre as nombre, e.apellido as apellido, e.direccion as direccion, e.telefono as telefono, e.correo as correo, e.estatus as estatus, c.codigo as codigo_carrera, c.nombre as nombre_carrera "
                    + "FROM estudiante e "
                    + "INNER JOIN carrera c ON e.carrera_id = c.codigo "
                    + "WHERE e.cedula = ? AND e.estatus = true LIMIT 1;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setString(1, cedula);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            if (resultSet.next()) {
                MCarrera carrera = new MCarrera();
                carrera.setCodigo(resultSet.getInt("codigo_carrera"));
                carrera.setNombre(resultSet.getString("nombre_carrera"));
                
                this.estudiante = new MEstudiante(
                    resultSet.getInt("codigo"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido"),
                    cedula,
                    resultSet.getString("direccion"),
                    resultSet.getString("correo"),
                    resultSet.getString("telefono"),
                    carrera,
                    resultSet.getBoolean("estatus")
                );

                cargarAsignaturas(estudiante);
                
            }else{
                JOptionPane.showMessageDialog(view,"No se encontro la cédula ingresada", "Error", JOptionPane.ERROR_MESSAGE);
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
    
    private void cargarAsignaturas(MEstudiante estudiante){
        try{
            view.getListAsignatura().removeAllItems();
            ArrayList<String> data = new ArrayList<>();
            String sql = "SELECT a.codigo as codigo, a.nombre as nombre "
                    + "FROM nota n "
                    + "INNER JOIN estudiante e ON n.estudiante_id = e.codigo "
                    + "INNER JOIN seccion s ON n.seccion_id = s.codigo "
                    + "INNER JOIN asignatura a ON s.asignatura_id = a.codigo "
                    + "WHERE n.estudiante_id = ? AND n.estatus = true;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, estudiante.getCodigo());
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            boolean encontro = false;
            view.getListAsignatura().addItem("Seleccione una opción");
            
            while (resultSet.next()) {
                encontro = true;
                    int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                
                data.add(nombre);
                mapaAsignaturas.put(nombre, codigo);
            }
            for (String asignatura : data) {
                view.getListAsignatura().addItem(asignatura);
            }
            
            if(!encontro){
                JOptionPane.showMessageDialog(view,"No se encontraron notas", "Error", JOptionPane.ERROR_MESSAGE);
            
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
    
    
    private int obtenerCodigoAsignaturaSeleccionada() {
        int selectedIndex = view.getListAsignatura().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombreAsignaturaSeleccionado = (String) view.getListAsignatura().getSelectedItem(); // Obtener nombre de asignatura seleccionada
            return mapaAsignaturas.get(nombreAsignaturaSeleccionado); // Obtener código de asignatura a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
    
    private int obtenerCodigoSeccionSeleccionado() {
        int selectedIndex = view.getListSeccion().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombreSeccionSeleccionado = (String) view.getListSeccion().getSelectedItem(); // Obtener nombre de seccion seleccionada
            return mapaSecciones.get(nombreSeccionSeleccionado); // Obtener código de seccion a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
    
    
}
