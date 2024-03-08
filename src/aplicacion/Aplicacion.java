// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package aplicacion;
import vistas.Login;
import controlador.CUsuario;

public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login view = new Login();
        CUsuario controlador = new CUsuario(view);
        view.setVisible(true);
    }
}
