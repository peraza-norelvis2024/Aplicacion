//Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class DashboardAdministrador extends javax.swing.JFrame {

    /**
     * @return the asignatura
     */
    public javax.swing.JMenuItem getAsignatura() {
        return asignatura;
    }

    /**
     * @return the carrera
     */
    public javax.swing.JMenuItem getCarrera() {
        return carrera;
    }

    /**
     * @return the decanato
     */
    public javax.swing.JMenuItem getDecanato() {
        return decanato;
    }

    /**
     * @return the estudiante
     */
    public javax.swing.JMenuItem getEstudiante() {
        return estudiante;
    }

    /**
     * @return the inscripcionEstudiante
     */
    public javax.swing.JMenuItem getInscripcionEstudiante() {
        return inscripcionEstudiante;
    }

    /**
     * @return the periodoAcademico
     */
    public javax.swing.JMenuItem getPeriodoAcademico() {
        return periodoAcademico;
    }

    /**
     * @return the profesor
     */
    public javax.swing.JMenuItem getProfesor() {
        return profesor;
    }

    /**
     * @return the resportesConsultar
     */
    public javax.swing.JMenuItem getResportesConsultar() {
        return resportesConsultar;
    }

    /**
     * @return the salir
     */
    public javax.swing.JMenuItem getSalir() {
        return salir;
    }

    /**
     * @return the seccion
     */
    public javax.swing.JMenuItem getSeccion() {
        return seccion;
    }

    /**
     * @return the semestre
     */
    public javax.swing.JMenuItem getSemestre() {
        return semestre;
    }
    
    public DashboardAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDashAdmin = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imgIzq = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        modulos = new javax.swing.JMenu();
        decanato = new javax.swing.JMenuItem();
        carrera = new javax.swing.JMenuItem();
        semestre = new javax.swing.JMenuItem();
        asignatura = new javax.swing.JMenuItem();
        seccion = new javax.swing.JMenuItem();
        periodoAcademico = new javax.swing.JMenuItem();
        profesor = new javax.swing.JMenuItem();
        estudiante = new javax.swing.JMenuItem();
        inscripcion = new javax.swing.JMenu();
        inscripcionEstudiante = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        resportesConsultar = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dashboard Administrador");
        setResizable(false);

        bgDashAdmin.setBackground(new java.awt.Color(255, 255, 255));
        bgDashAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoDash.png"))); // NOI18N
        bgDashAdmin.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        titulo1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titulo1.setText("¡GRACIAS POR FORMAR PARTE");
        bgDashAdmin.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        titulo2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2.setText(" DE NUESTRO EQUIPO!");
        bgDashAdmin.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        imgIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDashAdmin.png"))); // NOI18N
        bgDashAdmin.add(imgIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 470));

        modulos.setText("Modulos");
        modulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modulos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        decanato.setText("Decanato");
        decanato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decanatoActionPerformed(evt);
            }
        });
        modulos.add(decanato);

        carrera.setText("Carrera");
        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });
        modulos.add(carrera);

        semestre.setText("Semestre");
        semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestreActionPerformed(evt);
            }
        });
        modulos.add(semestre);

        asignatura.setText("Asignatura");
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        modulos.add(asignatura);

        seccion.setText("Sección");
        seccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionActionPerformed(evt);
            }
        });
        modulos.add(seccion);

        periodoAcademico.setText("Periodo Académico");
        periodoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoAcademicoActionPerformed(evt);
            }
        });
        modulos.add(periodoAcademico);

        profesor.setText("Profesor");
        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });
        modulos.add(profesor);

        estudiante.setText("Estudiante");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        modulos.add(estudiante);

        menu.add(modulos);

        inscripcion.setText("Inscripción");
        inscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripcionActionPerformed(evt);
            }
        });

        inscripcionEstudiante.setText("Inscribir Estudiante");
        inscripcion.add(inscripcionEstudiante);

        menu.add(inscripcion);

        reportes.setText("Reportes");
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        resportesConsultar.setText("Consultar");
        resportesConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resportesConsultarActionPerformed(evt);
            }
        });
        reportes.add(resportesConsultar);

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

    private void periodoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoAcademicoActionPerformed
        //Abrir ventana
        PeriodoAcademicoAdmin frm = new PeriodoAcademicoAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_periodoAcademicoActionPerformed

    private void decanatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decanatoActionPerformed
        //Abrir ventana
        DecanatoAdmin frm = new DecanatoAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_decanatoActionPerformed

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        //Abrir ventana
        CarreraAdmin frm = new CarreraAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_carreraActionPerformed

    private void semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestreActionPerformed
        //Abrir ventana
        SemestreAdmin frm = new SemestreAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_semestreActionPerformed

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        //Abrir ventana
        AsignaturaAdmin frm = new AsignaturaAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_asignaturaActionPerformed

    private void seccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionActionPerformed
        //Abrir ventana
        SeccionAdmin frm = new SeccionAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_seccionActionPerformed

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed
        //Abrir ventana
        ProfesorAdmin frm = new ProfesorAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_profesorActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        //Abrir ventana
        EstudianteAdmin frm = new EstudianteAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_estudianteActionPerformed

    private void resportesConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resportesConsultarActionPerformed
        //Abrir ventana
        ReportesAdmin frm = new ReportesAdmin();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_resportesConsultarActionPerformed

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
    private javax.swing.JMenuItem asignatura;
    private javax.swing.JPanel bgDashAdmin;
    private javax.swing.JMenuItem carrera;
    private javax.swing.JMenu cerrar;
    private javax.swing.JMenuItem decanato;
    private javax.swing.JMenuItem estudiante;
    private javax.swing.JLabel imgIzq;
    private javax.swing.JMenu inscripcion;
    private javax.swing.JMenuItem inscripcionEstudiante;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu modulos;
    private javax.swing.JMenuItem periodoAcademico;
    private javax.swing.JMenuItem profesor;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenuItem resportesConsultar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seccion;
    private javax.swing.JMenuItem semestre;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables

    
}
