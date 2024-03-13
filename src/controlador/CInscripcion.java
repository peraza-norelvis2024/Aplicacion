// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;

import java.sql.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import conexion.CConexion;
import modelo.MCarrera;
import modelo.MEstudiante;

import modelo.Sesion;
import modelo.MPeriodoAcademico;

import vistas.DashboardAdministrador;
import vistas.InscripcionAdmin;

public class CInscripcion {
    private InscripcionAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaPeriodos; 
    private HashMap<String, Integer> mapaAsignatura;
    private HashMap<String, Integer> mapaSecciones;
    private MEstudiante estudiante;
    private MCarrera carrera;
    
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
   
    public CInscripcion(InscripcionAdmin view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.mapaPeriodos = new HashMap<>();
        llenarCbxPeriodoAcademico();
        
        this.view.getBotonBuscar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = view.getCampoCedula().getText();
                int index = view.getCampoPeriodoAcademico().getSelectedIndex();
                
                if(cedula != "" && cedula != null && index > 0){
                    int periodo = obtenerCodigoPeriodoSeleccionado();
                    buscarEstudiante(cedula, periodo);
                }else{
                    JOptionPane.showMessageDialog(view,"Debe ingresar una cédula y seleccionar un periodo académico", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        
        this.view.getCampoAsignatura().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int periodo = obtenerCodigoPeriodoSeleccionado();
                int asignatura = obtenerCodigoAsignaturaSeleccionada();
                if(asignatura > 0){
                    llenarCbxSecciones(periodo, asignatura);
                }
            }
        });
        
        this.view.getCampoSecciones().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int seccion = obtenerCodigoSeccionSeleccionado();
                if(seccion > 0){
                    view.getBotonAgregar().setEnabled(true);
                }
            }

        });
        
    }
    
    private void llenarCbxPeriodoAcademico(){
        try{
            // Crear una lista para almacenar los datos del combo
            ArrayList<String> data = new ArrayList<>();
            this.view.getCampoPeriodoAcademico().addItem("Seleccione opción");
        
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
                view.getCampoPeriodoAcademico().addItem(periodo);
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
    
    private void llenarCbxAsignatura(int carrera_id, int periodo_id){
        try{
            // Crear una lista para almacenar los datos del combo
            this.mapaAsignatura = new HashMap<>();
            ArrayList<String> data = new ArrayList<>();
            this.view.getCampoAsignatura().addItem("Seleccione opción");
        
            //String sql = "SELECT codigo, nombre FROM asigantura WHERE estatus=true AND carrera_id = ?;";
            String sql = "SELECT codigo, nombre "
                    + "FROM asignatura "
                    + "WHERE codigo NOT IN ("
                        + "SELECT DISTINCT s.asignatura_id "
                        + "FROM inscripcion i "
                        + "INNER JOIN seccion s ON i.seccion_id = s.codigo "
                        + "WHERE i.estudiante_id = ? AND i.periodo_academico_id = ? AND i.estatus = true"
                    + ")"
                    + "AND carrera_id = ? AND estatus = true;";
            
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, estudiante.getCodigo());
            statement.setInt(2, periodo_id);
            statement.setInt(3, carrera_id);
            
            resultSet = statement.executeQuery();
            
            boolean encontro = false;
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                encontro = true;
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                
                data.add(nombre);
                mapaAsignatura.put(nombre, codigo);
            }
            
            for (String asignatura : data) {
                view.getCampoAsignatura().addItem(asignatura);
            }
            
            view.getCampoAsignatura().setEnabled(encontro);
            
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
            this.mapaSecciones = new HashMap<>();
            ArrayList<String> data = new ArrayList<>();
            this.view.getCampoSecciones().addItem("Seleccione opción");
            int estudiante_id = estudiante.getCodigo();
            
            String sql = "SELECT codigo, numero "
                    + "FROM seccion "
                    + "WHERE codigo NOT IN ("
                        + "SELECT DISTINCT s.asignatura_id "
                        + "FROM inscripcion i "
                        + "INNER JOIN seccion s ON i.seccion_id = s.codigo "
                        + "WHERE i.estudiante_id = ? AND i.periodo_academico_id = ? AND i.estatus = true"
                    + ")"
                    + "AND asignatura_id = ? AND estatus = true;";
            
            
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, estudiante_id);
            statement.setInt(2, periodo);
            statement.setInt(3, asignatura);
            
            resultSet = statement.executeQuery();
            boolean encontro = false;
            // Iterar sobre los resultados y agregarlos a la lista
            while (resultSet.next()) {
                encontro = true;
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("numero");
                
                data.add(nombre);
                mapaSecciones.put(nombre, codigo);
            }
            for (String seccion : data) {
                view.getCampoSecciones().addItem(seccion);
            }
            
            view.getCampoSecciones().setEnabled(encontro);
            

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
    
    private void buscarEstudiante(String cedula, int periodo){
        // Crear una lista para almacenar los datos del combo
        ArrayList<String> data = new ArrayList<>();
        String sql = "SELECT e.codigo as estudiante_id, e.nombre as nombre, e.apellido as apellido, c.nombre as carrera, c.codigo as carrera_id "
                + "FROM estudiante e "
                + "INNER JOIN carrera c ON e.carrera_id = c.codigo "
                + "WHERE e.cedula = ? AND e.estatus = true LIMIT 1;";
        try {
            
            connection = cconexion.establecerConexion();
            statement = connection.prepareStatement(sql);
            statement.setString(1, cedula);
            
            resultSet = statement.executeQuery();
            // Iterar sobre los resultados y agregarlos a la lista
            if (resultSet.next()) {
                int codigo = resultSet.getInt("estudiante_id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String carrera_nombre = resultSet.getString("carrera");
                int carrera_id = resultSet.getInt("carrera_id");
                
                
                estudiante = new MEstudiante();
                estudiante.setCodigo(codigo);
                estudiante.setCedula(cedula);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                
                carrera = new MCarrera();
                carrera.setCodigo(carrera_id);
                carrera.setNombre(carrera_nombre);
                
                estudiante.setCarrera_id(carrera);
                
                view.getCampoNombres().setText(estudiante.getNombre());
                view.getCampoApellidos().setText(estudiante.getApellido());
                view.getCampoCarrera1().setText(estudiante.getCarrera_id().getNombre());
                llenarCbxAsignatura(carrera_id, periodo);
                
                
            }else{
                JOptionPane.showMessageDialog(view,"No se encontro al estudiante", "Error", JOptionPane.ERROR_MESSAGE);
                
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
        int selectedIndex = view.getCampoPeriodoAcademico().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombrePeriodoSeleccionado = (String) view.getCampoPeriodoAcademico().getSelectedItem(); // Obtener nombre de periodo seleccionada
            return mapaPeriodos.get(nombrePeriodoSeleccionado); // Obtener código de periodo a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
    
    private int obtenerCodigoAsignaturaSeleccionada() {
        int selectedIndex = view.getCampoAsignatura().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombreAsignaturaSeleccionado = (String) view.getCampoAsignatura().getSelectedItem(); // Obtener nombre de asignatura seleccionada
            return mapaAsignatura.get(nombreAsignaturaSeleccionado); // Obtener código de asignatura a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
    
    private int obtenerCodigoSeccionSeleccionado() {
        int selectedIndex = view.getCampoSecciones().getSelectedIndex();

        // Verificar si se seleccionó alguna opción
        if (selectedIndex != -1 && selectedIndex > 0) { 
            String nombreSeccionSeleccionado = (String) view.getCampoSecciones().getSelectedItem(); // Obtener nombre de seccion seleccionada
            return mapaSecciones.get(nombreSeccionSeleccionado); // Obtener código de seccion a partir del nombre en el mapa
        }else{
            return 0;
        }
    }
}
