// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.PeriodoAcademicoAdmin;
import vistas.DashboardAdministrador;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

import conexion.CConexion;
import java.util.*;
import modelo.MPeriodoAcademico;

public class CPeriodoAcademicoAdmin {
    private PeriodoAcademicoAdmin view;
    private Sesion sesion;
    private CConexion cconexion = new CConexion();
    private HashMap<String, Integer> mapaPeriodoAcademico; 
    private MPeriodoAcademico periodoAcademico;

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CPeriodoAcademicoAdmin(PeriodoAcademicoAdmin view, Sesion sesion){
        
    }
}
