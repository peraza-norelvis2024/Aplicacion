//Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.ReportesEstudiantesAdmin;
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
import modelo.MEstudiante;
import modelo.MCarrera;
import modelo.MSemestre;
import modelo.MDecanato;
import modelo.MSeccion;

public class CReportesEstudiantesAdmin {
    private ReportesEstudiantesAdmin view;
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

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CReportesEstudiantesAdmin(ReportesEstudiantesAdmin view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        this.mapaAsignatura = new HashMap<>();
        this.asignatura = null;
        this.mapaEstudiante = new HashMap<>();
        this.estudiante = null;
        this.mapaCarrera = new HashMap<>();
        this.carrera = null;
        this.mapaSemestre = new HashMap<>();
        this.semestre = null;
        this.mapaDecanato = new HashMap<>();
        this.decanato = null;
        this.mapaSeccion = new HashMap<>();
        this.seccion = null;
        
        //Accion de boton atras
        this.view.getBontonAtrasEstudianteRet().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardAdministrador frm = new DashboardAdministrador();
                CDashboardAdministrador controladorDashboardAdmin = new CDashboardAdministrador(frm, sesion);
                frm.setVisible(true);
                view.dispose();
            }
        });
    }
}
