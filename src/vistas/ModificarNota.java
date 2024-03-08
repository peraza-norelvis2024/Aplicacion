// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class ModificarNota extends javax.swing.JFrame {

    public ModificarNota() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgModificarNota = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        textCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        scrollNota = new javax.swing.JScrollPane();
        tablaNota = new javax.swing.JTable();
        bontonCancelar = new javax.swing.JButton();
        bontonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Nota");
        setResizable(false);

        bgModificarNota.setBackground(new java.awt.Color(41, 144, 159));

        titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("MODIFICAR NOTA");

        textCedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedula.setForeground(new java.awt.Color(255, 255, 255));
        textCedula.setText("Cédula");

        campoCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscar.setText("BUSCAR");

        tablaNota.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollNota.setViewportView(tablaNota);

        bontonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonCancelar.setText("CANCELAR");
        bontonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonCancelar.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonCancelar.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonCancelar.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonCancelarMouseClicked(evt);
            }
        });

        bontonGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonGuardar.setText("GUARDAR");
        bontonGuardar.setToolTipText("");
        bontonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonGuardar.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgModificarNotaLayout = new javax.swing.GroupLayout(bgModificarNota);
        bgModificarNota.setLayout(bgModificarNotaLayout);
        bgModificarNotaLayout.setHorizontalGroup(
            bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgModificarNotaLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgModificarNotaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgModificarNotaLayout.createSequentialGroup()
                        .addComponent(bontonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgModificarNotaLayout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(textCedula)
                            .addGap(29, 29, 29)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(botonBuscar))
                        .addComponent(scrollNota, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        bgModificarNotaLayout.setVerticalGroup(
            bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgModificarNotaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addGap(55, 55, 55)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(scrollNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgModificarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgModificarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonGuardarMouseClicked

    }//GEN-LAST:event_bontonGuardarMouseClicked

    private void bontonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonCancelarMouseClicked
        //Preguntar si esta seguro de cerrar sesión
        int confirmado = JOptionPane.showConfirmDialog(null, "Está Seguro de Cancelar Modificación");
        if (JOptionPane.OK_OPTION==confirmado) {
            //Abrir ventana
            CargarNotas frm = new CargarNotas();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        }
    }//GEN-LAST:event_bontonCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(ModificarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgModificarNota;
    private javax.swing.JButton bontonCancelar;
    private javax.swing.JButton bontonGuardar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JScrollPane scrollNota;
    private javax.swing.JTable tablaNota;
    private javax.swing.JLabel textCedula;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
