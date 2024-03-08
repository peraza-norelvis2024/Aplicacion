// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package modelo;

public class Sesion {

    private static Sesion instance;
    public String codigo_usuario;
    public String nombre_usuario;
    public String cedula_usuario;
    
    private Sesion() {
        // Constructor privado para evitar instanciación directa
    }
    
    public static Sesion getInstance() {
        if (instance == null) {
            instance = new Sesion();
        }
        return instance;
    }
    public void iniciarSesion(String codigo, String nombre, String cedula) {
        this.codigo_usuario = codigo;
        this.nombre_usuario = nombre;
        this.cedula_usuario = cedula;
    }
    /**
     * @return the codigo_usuario
     */
    public String getCodigo_usuario() {
        return codigo_usuario;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @return the cedula_usuario
     */
    public String getCedula_usuario() {
        return cedula_usuario;
    }
    
    public boolean estaLogueado() {
        return codigo_usuario != null;
    }
}
