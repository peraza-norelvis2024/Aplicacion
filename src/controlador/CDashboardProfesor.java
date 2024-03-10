// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.DashboardProfesor;
import vistas.Login;
import vistas.ConsultarSeccionesProf;
import modelo.Sesion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CDashboardProfesor {
    private DashboardProfesor view;
    private Sesion sesion;
    
    public CDashboardProfesor(DashboardProfesor view, Sesion sesion){
        this.view = view;
        this.sesion = sesion;
        
        this.view.getSalir().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                int confirmado = JOptionPane.showConfirmDialog(null, "Está Seguro de Salir");
                if (JOptionPane.OK_OPTION==confirmado) {
                    sesion.cerrarSesion();
                    Login login = new Login();
                    CUsuario controladorLogin = new CUsuario(login);
                    login.setVisible(true);

                    view.dispose();
                }
            }
        });
        
        this.view.getConsultar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ConsultarSeccionesProf secciones = new ConsultarSeccionesProf();
                CConsultarSeccionesAsignadas controladorSecciones = new CConsultarSeccionesAsignadas(secciones, sesion);
                secciones.setVisible(true);
                view.dispose();
            }
        });
    }
    
    
    
}
