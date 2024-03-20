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
    
        //Llenamos el combo de secciones registradas
        this.view.getComboSecciones().addItem("Seleccione opción");
        this.llenarCbxSecciones();
        this.view.getComboAsigBusSec().addItem("Seleccione opción");
        this.llenarCbxAsignaturas();
        this.view.getComboPerAcaBusSec().addItem("Seleccione opción");
        this.llenarCbxPeriodos();
        this.view.getComboStaSec().addItem("Seleccione opción");
        this.view.getComboStaSec().addItem("Activo");
        this.view.getComboStaSec().addItem("Inactivo");
        
        //Accion de boton atras
        this.view.getBontonAtrasSeccion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardAdministrador frm = new DashboardAdministrador();
                CDashboardAdministrador controladorDashboardAdmin = new CDashboardAdministrador(frm, sesion);
                frm.setVisible(true);
                view.dispose();
            }
        });
        
        //Accion de boton Buscar
        this.view.getBotonBuscarSeccion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex1 = view.getComboPerAcaBusSec().getSelectedIndex();
                int selectedIndex2 = view.getComboAsigBusSec().getSelectedIndex();

                // Verificar si se seleccionó alguna opción
                if (selectedIndex1 != -1 && selectedIndex1 > 0 && selectedIndex2 != -1 && selectedIndex2 > 0) { 
                    buscarSeccion();
                }else{
                    JOptionPane.showMessageDialog(view,"Debe seleccionar las opciones", "Error", JOptionPane.ERROR_MESSAGE);

                }
                
                
            }
        });
        
        //Accion boton modificar
        this.view.getBotonModificarSeccion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(seccion != null){
                    habilitarCampos();
                    view.getBotonModificarSeccion().setEnabled(false);
                    view.getComboStaSec().setEnabled(false);
                }
            }
        });
        
        //Accion boton cancelar
        this.view.getBontonCancelarSeccion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de cancelar?");
                if (JOptionPane.OK_OPTION==confirmado) {
                        limpiarCampos();
                        view.getComboPerAcaBusSec().setEnabled(true);
                        view.getComboAsigBusSec().setEnabled(true);
                }
            }
        });
        
        this.view.getBotonGuardarSeccion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarCampos()){
                    if(seccion != null){
                        seccion.setNombre(view.getComboPerAcaBusSec().getText());
                        editarSeccion(seccion);
                    }else{
                        registrarSeccion();
                    }
                }else{
                    JOptionPane.showMessageDialog(view,"Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        //Accion boton eliminar
        this.view.getBotonEliminarSem().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el semestre?");
                if (JOptionPane.OK_OPTION==confirmado) {
                
                    if(semestre != null){
                        eliminarSemestre(semestre);
                    }
                }
            }
        });
        
        //Accion boton agregar
        this.view.getBotonAgregarSem().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
                habilitarCampos();   
            }
        });
    }
}
