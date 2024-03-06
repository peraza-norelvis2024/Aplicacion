// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.*;
import java.awt.Color;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logoIzq = new javax.swing.JLabel();
        textIzq = new javax.swing.JLabel();
        fondoIzq = new javax.swing.JLabel();
        logoDer = new javax.swing.JLabel();
        textDer = new javax.swing.JLabel();
        textUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        textPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        separadorPassword = new javax.swing.JSeparator();
        botonAcceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio De Sesión");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoIzq.png"))); // NOI18N
        background.add(logoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 310, -1));

        textIzq.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textIzq.setForeground(new java.awt.Color(40, 143, 158));
        textIzq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textIzq.setText("\"UNIVERSIDAD CENTRAL DE LARA\"");
        background.add(textIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 310, -1));

        fondoIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoIzq.jpeg"))); // NOI18N
        background.add(fondoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 500));

        logoDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoDer.png"))); // NOI18N
        background.add(logoDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        textDer.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        textDer.setText("INICIAR SESION");
        background.add(textDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        textUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textUsuario.setText("USUARIO");
        background.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        campoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Ingrese Usuario");
        campoUsuario.setBorder(null);
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoUsuarioMousePressed(evt);
            }
        });
        background.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 410, 20));

        separadorUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(separadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 410, 30));

        textPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textPassword.setText("CONTRASEÑA");
        background.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        campoPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campoPassword.setForeground(new java.awt.Color(204, 204, 204));
        campoPassword.setText("**********");
        campoPassword.setBorder(null);
        campoPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoPasswordMousePressed(evt);
            }
        });
        background.add(campoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 410, 20));

        separadorPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(separadorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 410, 20));

        botonAcceder.setBackground(new java.awt.Color(91, 193, 208));
        botonAcceder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder.setText("ACCEDER");
        botonAcceder.setBorder(null);
        botonAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAccederMouseClicked(evt);
            }
        });
        background.add(botonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMousePressed
        if (campoUsuario.getText().equals("Ingrese Usuario")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(campoPassword.getPassword()).isEmpty()) {
            campoPassword.setText("**********");
            campoPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUsuarioMousePressed

    private void campoPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPasswordMousePressed
        if (String.valueOf(campoPassword.getPassword()).equals("**********")) {
            campoPassword.setText("");
            campoPassword.setForeground(Color.black);
        }
        if (campoUsuario.getText().isEmpty()) {
            campoUsuario.setText("Ingrese Usuario");
            campoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoPasswordMousePressed

    private void botonAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAccederMouseClicked
        String usuario = campoUsuario.getText();
        String contrasena = new String (campoPassword.getPassword());
        
        if (usuario.equals("Administrador") && contrasena.equals("Admin")) {
            JOptionPane.showMessageDialog(this,"Bienvenido Administrador");
            //Abrir la otra ventana si el usuario y contraseña son correctos
            DashboardAdministrador frm = new DashboardAdministrador();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        } else if (usuario.equals("Profesor") && contrasena.equals("profesor")) {
            JOptionPane.showMessageDialog(this,"Bienvenido Profesor");
            //Abrir la otra ventana si el usuario y contraseña son correctos
            DashboardProfesor frm = new DashboardProfesor();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,"Credenciales Incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAccederMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAcceder;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel fondoIzq;
    private javax.swing.JLabel logoDer;
    private javax.swing.JLabel logoIzq;
    private javax.swing.JSeparator separadorPassword;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JLabel textDer;
    private javax.swing.JLabel textIzq;
    private javax.swing.JLabel textPassword;
    private javax.swing.JLabel textUsuario;
    // End of variables declaration//GEN-END:variables
}
