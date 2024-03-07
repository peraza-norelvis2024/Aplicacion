//Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class DashboardProfesor extends javax.swing.JFrame {

    public DashboardProfesor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDashProfe = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imgIzq = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        secciones = new javax.swing.JMenu();
        consultar = new javax.swing.JMenuItem();
        notas = new javax.swing.JMenu();
        cargar = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard Profesor");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        bgDashProfe.setBackground(new java.awt.Color(255, 255, 255));
        bgDashProfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoDash.png"))); // NOI18N
        bgDashProfe.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        titulo1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titulo1.setText("¡GRACIAS POR FORMAR PARTE");
        bgDashProfe.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        titulo2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2.setText(" DE NUESTRO EQUIPO!");
        bgDashProfe.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        imgIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoDashProfe.png"))); // NOI18N
        bgDashProfe.add(imgIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 470));

        menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        secciones.setText("Secciones");
        secciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        secciones.add(consultar);

        menu.add(secciones);
        secciones.getAccessibleContext().setAccessibleDescription("");

        notas.setText("Notas");
        notas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        notas.add(cargar);

        menu.add(notas);

        cerrar.setText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
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
            .addComponent(bgDashProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDashProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked

    }//GEN-LAST:event_salirMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       //Preguntar si esta seguro de cerrar sesión
        int confirmado = JOptionPane.showConfirmDialog(null, "Está Seguro de Salir");
        if (JOptionPane.OK_OPTION==confirmado) {
            //Abrir ventana
            Login frm = new Login();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        }
    }//GEN-LAST:event_salirActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        //Abrir ventana
        CargarNotas frm = new CargarNotas();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_cargarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        //Abrir ventana
        ConsultarSeccionesProf frm = new ConsultarSeccionesProf();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_consultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDashProfe;
    private javax.swing.JMenuItem cargar;
    private javax.swing.JMenu cerrar;
    private javax.swing.JMenuItem consultar;
    private javax.swing.JLabel imgIzq;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu notas;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu secciones;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
