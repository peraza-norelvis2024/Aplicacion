// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.CarreraAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

import conexion.CConexion;
import java.util.*;
import modelo.MCarrera;
import modelo.MDecanato;

public class CCarreraAdmin {
    private CarreraAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaCarrera;
    private HashMap<String, Integer> mapaDecanato; 
    private MCarrera carrera;
    private MDecanato decanato;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CCarreraAdmin(CarreraAdmin view, Sesion sesion){
        
    }
}
