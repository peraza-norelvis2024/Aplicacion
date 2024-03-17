// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;

import java.sql.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import vistas.CargarNotasProf;
import vistas.DashboardProfesor;
import modelo.Sesion;
import conexion.CConexion;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CCargarNotaProf {
    private CargarNotasProf view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaPeriodos;
    private HashMap<String, Integer> mapaCarreras;
    private HashMap<String, Integer> mapaAsignaturas;
    private HashMap<String, Integer> mapaSecciones;
    
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
   
    public CCargarNotaProf(CargarNotasProf view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.view.getListPeriodos().addItem("Seleccione opción");
        this.mapaPeriodos = new HashMap<>();
        this.mapaCarreras = new HashMap<>();
        this.mapaAsignaturas = new HashMap<>();
        this.mapaSecciones = new HashMap<>();
        
        llenarCbxPeriodoAcademico();
        
        view.getListPeriodos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código de la sección seleccionada
                int codigoPeriodoSeleccionado = obtenerCodigoPeriodoSeleccionado();
                view.getListCarreras().removeAllItems();
                
                if(codigoPeriodoSeleccionado != 0){
                    
                    view.getListCarreras().addItem("Seleccione opción");
                    llenarCbxCarrera(codigoPeriodoSeleccionado);
                    // Realizar acciones con el código de la sección seleccionada
                    System.out.println("Código de periodo seleccionado: " + codigoPeriodoSeleccionado);
                    // Puedes realizar cualquier acción que necesites con este código
                }
            }
        });
        
        view.getListCarreras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código de la sección seleccionada
                int codigoPeriodoSeleccionado = obtenerCodigoPeriodoSeleccionado();
                int codigoCarreraSeleccionado = obtenerCodigoCarreraSeleccionada();
                view.getListAsignatura().removeAllItems();
                
                if(codigoCarreraSeleccionado!=0){
                    view.getListAsignatura().addItem("Seleccione opción");

                    llenarCbxAsignaturas(codigoPeriodoSeleccionado, codigoCarreraSeleccionado);
                    // Realizar acciones con el código de la sección seleccionada
                    System.out.println("Código de carrera seleccionado: " + codigoCarreraSeleccionado);
                    // Puedes realizar cualquier acción que necesites con este código
                }
            }
        });
        
        view.getListAsignatura().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código de la sección seleccionada
                int codigoPeriodoSeleccionado = obtenerCodigoPeriodoSeleccionado();
                int codigoAsignaturaSeleccionado = obtenerCodigoAsignaturaSeleccionada();
                view.getListSeccion().removeAllItems();
                
                if(codigoAsignaturaSeleccionado!=0){
                    view.getListSeccion().addItem("Seleccione opción");

                    llenarCbxSecciones(codigoPeriodoSeleccionado, codigoAsignaturaSeleccionado);
                    // Realizar acciones con el código de la sección seleccionada
                    System.out.println("Código de asignatura seleccionado: " + codigoAsignaturaSeleccionado);
                    // Puedes realizar cualquier acción que necesites con este código
                }
            }
        });
        
        view.getListSeccion().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código de la sección seleccionada
                int codigoPeriodoSeleccionado = obtenerCodigoPeriodoSeleccionado();
                int codigoSeccionSeleccionado = obtenerCodigoSeccionSeleccionado();
                
                if(codigoSeccionSeleccionado!=0){
                    view.getListSeccion().addItem("Seleccione opción");

                    llenarTablaNotas(codigoPeriodoSeleccionado, codigoSeccionSeleccionado);
                    // Realizar acciones con el código de la sección seleccionada
                    System.out.println("Código de seccion seleccionado: " + codigoSeccionSeleccionado);
                    // Puedes realizar cualquier acción que necesites con este código
                }
            }
        });
        
        view.getBontonAtras1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardProfesor frm = new DashboardProfesor();
                CDashboardProfesor controladorDashboardProfesor = new CDashboardProfesor(frm, sesion);
                frm.setVisible(true);
                view.dispose();
            }
        });
        
    }
    
    private void llenarCbxPeriodoAcademico(){
        try{
            // Crear una lista para almacenar los datos del combo
            ArrayList<String> data = new ArrayList<>();
            String sql = "SELECT codigo, nombre FROM periodo_academico WHERE estatus=true;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                
                data.add(nombre);
                mapaPeriodos.put(nombre, codigo);
            }
            for (String periodo : data) {
                view.getListPeriodos().addItem(periodo);
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
    
    private void llenarCbxCarrera(int periodo){
        try{
            // Crear una lista para almacenar los datos del combo
            ArrayList<String> data = new ArrayList<>();
            String sql = "SELECT DISTINCT c.codigo, c.nombre FROM seccion s INNER JOIN asignatura a ON s.asignatura_id = a.codigo INNER JOIN carrera c ON a.carrera_id = c.codigo WHERE s.estatus=true AND s.profesor_id = ? AND s.periodo_id = ?;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, sesion.getCodigo_usuario());
            statement.setInt(2, periodo);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                
                data.add(nombre);
                mapaCarreras.put(nombre, codigo);
            }
            for (String carrera : data) {
                view.getListCarreras().addItem(carrera);
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
    
    private void llenarCbxAsignaturas(int periodo, int carrera){
        try{
            // Crear una lista para almacenar los datos del combo
            ArrayList<String> data = new ArrayList<>();
            String sql = "SELECT DISTINCT a.codigo, a.nombre FROM seccion s INNER JOIN asignatura a ON s.asignatura_id = a.codigo INNER JOIN carrera c ON a.carrera_id = c.codigo WHERE s.estatus=true AND s.profesor_id = ? AND s.periodo_id = ? AND a.carrera_id = ?;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, sesion.getCodigo_usuario());
            statement.setInt(2, periodo);
            statement.setInt(3, carrera);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                
                data.add(nombre);
                mapaAsignaturas.put(nombre, codigo);
            }
            for (String asignatura : data) {
                view.getListAsignatura().addItem(asignatura);
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
    
    
    private void llenarCbxSecciones(int periodo, int asignatura){
        try{
            // Crear una lista para almacenar los datos del combo
            ArrayList<String> data = new ArrayList<>();
            String sql = "SELECT DISTINCT s.codigo, s.numero FROM seccion s INNER JOIN asignatura a ON s.asignatura_id = a.codigo INNER JOIN carrera c ON a.carrera_id = c.codigo WHERE s.estatus=true AND s.profesor_id = ? AND s.periodo_id = ? AND s.asignatura_id = ?;";
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, sesion.getCodigo_usuario());
            statement.setInt(2, periodo);
            statement.setInt(3, asignatura);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("numero");
                
                data.add(nombre);
                mapaSecciones.put(nombre, codigo);
            }
            for (String seccion : data) {
                view.getListSeccion().addItem(seccion);
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
    
    
    private void llenarTablaNotas(int periodo, int seccion){
        
        System.out.println("Usuario logueado: " + sesion.getNombre_usuario());
        int codigo_profesor = sesion.getCodigo_usuario();
        TableModel model = view.getTablaNotas().getModel();
        DefaultTableModel defaultModel = (DefaultTableModel) model;
        defaultModel.setRowCount(0);
        
        String sql = "SELECT e.cedula as cedula, e.nombre as nombre, e.apellido as apellido, COALESCE(n.nota, NULL) AS nota, COALESCE(n.codigo, 0) AS nota_id "
                + "FROM inscripcion i "
                + "INNER JOIN estudiante e ON i.estudiante_id = e.codigo "
                + "LEFT JOIN "
                + "(SELECT estudiante_id, nota, codigo FROM nota WHERE seccion_id = ?) n ON e.codigo = n.estudiante_id "
                + "WHERE i.seccion_id = ? AND i.periodo_academico_id = ? AND i.estatus = true;";
        
        try{
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, seccion);
            statement.setInt(2, seccion);
            statement.setInt(3, periodo);
            
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Float nota = null;
                
                if (resultSet.getObject("nota") != null) {
                    nota = resultSet.getFloat("nota");
                }
                
                Object[] row = {
                    resultSet.getString("cedula"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido"),
                    nota,
                };
                ((DefaultTableModel) model).addRow(row);
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
    
    private int obtenerCodigoPeriodoSeleccionado() {
        int selectedIndex = view.getListPeriodos().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombrePeriodoSeleccionado = (String) view.getListPeriodos().getSelectedItem(); // Obtener nombre de periodo seleccionada
            return mapaPeriodos.get(nombrePeriodoSeleccionado); // Obtener código de periodo a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
    private int obtenerCodigoCarreraSeleccionada() {
        int selectedIndex = view.getListCarreras().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombreCarreraSeleccionado = (String) view.getListCarreras().getSelectedItem(); // Obtener nombre de carrera seleccionada
            return mapaCarreras.get(nombreCarreraSeleccionado); // Obtener código de carrera a partir del nombre en el mapa
        }else{
            return 0;
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
