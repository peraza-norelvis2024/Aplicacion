// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.EstudianteAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

import conexion.CConexion;
import java.util.*;
import modelo.MEstudiante;
import modelo.MCarrera;

public class CEstudianteAdmin {
    private EstudianteAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaEstudiante;
    private HashMap<String, Integer> mapaCarrera; 
    private MEstudiante estudiante;
    private MCarrera carrera;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CEstudianteAdmin(EstudianteAdmin view, Sesion sesion){
        
    }
}
