//Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class DashboardAdministrador extends javax.swing.JFrame {

    public javax.swing.JMenu getAsignatura() {
        return asignatura;
    }

    public javax.swing.JMenu getCarrera() {
        return carrera;
    }

    public javax.swing.JMenu getDecanato() {
        return decanato;
    }

    public javax.swing.JMenu getEstudiante() {
        return estudiante;
    }

    public javax.swing.JMenu getInscripcion() {
        return inscripcion;
    }

    public javax.swing.JMenu getPeriodAcadem() {
        return periodAcadem;
    }

    public javax.swing.JMenu getProfesor() {
        return profesor;
    }

    public javax.swing.JMenu getReportes() {
        return reportes;
    }

    public javax.swing.JMenuItem getSalir() {
        return salir;
    }

    public javax.swing.JMenu getSecciones() {
        return secciones;
    }

    public javax.swing.JMenu getSemestre() {
        return semestre;
    }
    
    public javax.swing.JMenuItem getInscribir() {
        return inscribir;
    }
    
    public DashboardAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        bgDashAdmin = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imgIzq = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        decanato = new javax.swing.JMenu();
        carrera = new javax.swing.JMenu();
        semestre = new javax.swing.JMenu();
        asignatura = new javax.swing.JMenu();
        periodAcadem = new javax.swing.JMenu();
        secciones = new javax.swing.JMenu();
        profesor = new javax.swing.JMenu();
        estudiante = new javax.swing.JMenu();
        inscripcion = new javax.swing.JMenu();
        inscribir = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        cerrar = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard Aministrador");
        setResizable(false);

        bgDashAdmin.setBackground(new java.awt.Color(255, 255, 255));
        bgDashAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoDash.png"))); // NOI18N
        bgDashAdmin.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        titulo1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titulo1.setText("¡GRACIAS POR FORMAR PARTE");
        bgDashAdmin.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        titulo2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2.setText(" DE NUESTRO EQUIPO!");
        bgDashAdmin.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        imgIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDashAdmin.png"))); // NOI18N
        bgDashAdmin.add(imgIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 290, 470));

        decanato.setText("Decanato");
        decanato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decanato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(decanato);

        carrera.setText("Carrera");
        carrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(carrera);

        semestre.setText("Semestre");
        semestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        semestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(semestre);

        asignatura.setText("Asignatura");
        asignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(asignatura);

        periodAcadem.setText("Periodo Académico");
        periodAcadem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        periodAcadem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(periodAcadem);

        secciones.setText("Sección");
        secciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(secciones);

        profesor.setText("Profresor");
        profesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profesor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(profesor);

        estudiante.setText("Estudiante");
        estudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(estudiante);

        inscripcion.setText("Inscripción");
        inscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcionActionPerformed(evt);
            }
        });

        inscribir.setText("Inscribir estudiante");
        inscripcion.add(inscribir);

        menu.add(inscripcion);

        reportes.setText("Reportes");
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.add(reportes);

        cerrar.setText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        cerrar.add(salir);

        menu.add(cerrar);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDashAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDashAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Preguntar si esta seguro de cerrar sesión
        /*int confirmado = JOptionPane.showConfirmDialog(null, "Está Seguro de Salir");
        if (JOptionPane.OK_OPTION==confirmado) {
            //Abrir ventana
            Login frm = new Login();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        }*/
    }//GEN-LAST:event_salirActionPerformed

    private void inscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripcionActionPerformed
        //Abrir ventana
        InscripcionAdmin frm = new InscripcionAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_inscripcionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu asignatura;
    private javax.swing.JPanel bgDashAdmin;
    private javax.swing.JMenu carrera;
    private javax.swing.JMenu cerrar;
    private javax.swing.JMenu decanato;
    private javax.swing.JMenu estudiante;
    private javax.swing.JLabel imgIzq;
    private javax.swing.JMenuItem inscribir;
    private javax.swing.JMenu inscripcion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu periodAcadem;
    private javax.swing.JMenu profesor;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu secciones;
    private javax.swing.JMenu semestre;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables

    
}
