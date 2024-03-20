// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.RetiroAsigAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

import conexion.CConexion;
import java.util.*;
import modelo.MAsignatura;
import modelo.MSeccion;
import modelo.MEstudiante;
import modelo.MInscripcion;

public class CRetiroAsigAdmin {
    private RetiroAsigAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaAsignatura;
    private HashMap<String, Integer> mapaSeccion;
    private HashMap<String, Integer> mapaEstudiante;
    private HashMap<String, Integer> mapaInscripcion;
    private MAsignatura asignatura;
    private MSeccion seccion;
    private MEstudiante estudiante;
    private MInscripcion inscripcion;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CRetiroAsigAdmin(RetiroAsigAdmin view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.mapaAsignatura = new HashMap<>();
        this.asignatura = null;
        this.mapaSeccion = new HashMap<>();
        this.seccion = null;
        this.mapaEstudiante = new HashMap<>();
        this.estudiante = null;
        this.mapaInscripcion = new HashMap<>();
        this.inscripcion = null;
        
    }
}
