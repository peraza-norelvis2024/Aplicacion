// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.SeccionAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

import conexion.CConexion;
import java.util.*;
import modelo.MSeccion;
import modelo.MPeriodoAcademico;
import modelo.MAsignatura;
import modelo.MProfesor;

public class CSeccionesAdmin {
    private SeccionAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaSeccion;
    private HashMap<String, Integer> mapaPeriodoAcademico;
    private HashMap<String, Integer> mapaAsignatura;
    private HashMap<String, Integer> mapaProfesor;
    private MSeccion seccion;
    private MPeriodoAcademico periodoAcademico;
    private MAsignatura asignatura;
    private MProfesor profesor;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CSeccionesAdmin(SeccionAdmin view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.mapaSeccion = new HashMap<>();
        this.seccion = null;
        this.mapaPeriodoAcademico = new HashMap<>();
        this.periodoAcademico = null;
        this.mapaAsignatura = new HashMap<>();
        this.asignatura = null;
        this.mapaProfesor = new HashMap<>();
        this.profesor = null;
        
    }
}
