// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package controlador;
import vistas.Login;
import vistas.InscripcionAdmin;
import vistas.DashboardAdministrador;

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
        
        this.view.getInscribir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                InscripcionAdmin inscripcion = new InscripcionAdmin();
                CInscripcion controlador_inscripcion = new CInscripcion(inscripcion, sesion);
                inscripcion.setVisible(true);
                view.dispose();
            }
        });

    }
    
}
