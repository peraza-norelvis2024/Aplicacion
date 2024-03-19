// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.DashboardAdministrador;
import vistas.DecanatoAdmin;
import vistas.CarreraAdmin;
import vistas.SemestreAdmin;
import vistas.AsignaturaAdmin;
import vistas.SeccionAdmin;
import vistas.PeriodoAcademicoAdmin;
import vistas.ProfesorAdmin;
import vistas.EstudianteAdmin;
import vistas.InscripcionAdmin;
import vistas.ReportesAdmin;
import vistas.Login;

import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CDashboardAdministrador {
    private DashboardAdministrador view;
    private Sesion sesion;
    
    public CDashboardAdministrador(DashboardAdministrador view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        
        this.view.getDecanato().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                DecanatoAdmin decanato = new DecanatoAdmin();
                CDecanatoAdmin controlador_decanato = new CDecanatoAdmin(decanato, sesion);
                decanato.setVisible(true);
                view.dispose();
            }
        });
        
        this.view.getAsignatura().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AsignaturaAdmin asignatura = new AsignaturaAdmin();
                CAsignaturaAdmin controlador_asignatura = new CAsignaturaAdmin(asignatura, sesion);
                asignatura.setVisible(true);
                view.dispose();
            }
        });
        
        this.view.getInscripcionEstudiante().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                InscripcionAdmin inscripcion = new InscripcionAdmin();
                CInscripcionAdmin controlador_inscripcion = new CInscripcionAdmin(inscripcion, sesion);
                inscripcion.setVisible(true);
                view.dispose();
            }
        });
        
        this.view.getProfesor().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ProfesorAdmin profesor = new ProfesorAdmin();
                CProfesorAdmin controlador_profesor = new CProfesorAdmin(profesor, sesion);
                profesor.setVisible(true);
                view.dispose();
            }
        });
        
        this.view.getSalir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int confirmado = JOptionPane.showConfirmDialog(null, "Está Seguro de Salir");
                if (JOptionPane.OK_OPTION==confirmado) {
                    sesion.cerrarSesion();
                    Login login = new Login();
                    CLogin controladorLogin = new CLogin(login);
                    login.setVisible(true);
                    view.dispose();
                }
            }
        });

    }
    
}
