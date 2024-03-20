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
import java.util.*;
import conexion.CConexion;
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

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    public CReportesSeccionesAdmin(ReportesSeccionesAdmin view, Sesion sesion){
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
        this.mapaProfesor = new HashMap<>();
        this.profesor = null;
        
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
    }
}
