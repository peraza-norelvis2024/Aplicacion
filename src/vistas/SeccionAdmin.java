// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class SeccionAdmin extends javax.swing.JFrame {

    /**
     * @return the bontonAtrasSeccion
     */
    public javax.swing.JButton getBontonAtrasSeccion() {
        return bontonAtrasSeccion;
    }

    /**
     * @return the bontonCancelarSeccion
     */
    public javax.swing.JButton getBontonCancelarSeccion() {
        return bontonCancelarSeccion;
    }

    /**
     * @return the botonAgregarSeccion
     */
    public javax.swing.JButton getBotonAgregarSeccion() {
        return botonAgregarSeccion;
    }

    /**
     * @return the botonBuscarSeccion
     */
    public javax.swing.JButton getBotonBuscarSeccion() {
        return botonBuscarSeccion;
    }

    /**
     * @return the botonEliminarSeccion
     */
    public javax.swing.JButton getBotonEliminarSeccion() {
        return botonEliminarSeccion;
    }

    /**
     * @return the botonGuardarSeccion
     */
    public javax.swing.JButton getBotonGuardarSeccion() {
        return botonGuardarSeccion;
    }

    /**
     * @return the botonModificarSeccion
     */
    public javax.swing.JButton getBotonModificarSeccion() {
        return botonModificarSeccion;
    }

    /**
     * @return the campoMaxEstSec
     */
    public javax.swing.JTextField getCampoMaxEstSec() {
        return campoMaxEstSec;
    }

    /**
     * @return the campoNumSec
     */
    public javax.swing.JTextField getCampoNumSec() {
        return campoNumSec;
    }

    /**
     * @return the comboAsigSec
     */
    public javax.swing.JComboBox<String> getComboAsigSec() {
        return comboAsigSec;
    }

    /**
     * @return the comboNomBusSec
     */
    public javax.swing.JComboBox<String> getComboNomBusSec() {
        return comboNomBusSec;
    }

    /**
     * @return the comboPerAcaSec
     */
    public javax.swing.JComboBox<String> getComboPerAcaSec() {
        return comboPerAcaSec;
    }

    /**
     * @return the comboProfSec
     */
    public javax.swing.JComboBox<String> getComboProfSec() {
        return comboProfSec;
    }

    /**
     * @return the comboStaSec
     */
    public javax.swing.JComboBox<String> getComboStaSec() {
        return comboStaSec;
    }

    public SeccionAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSeccion = new javax.swing.JPanel();
        tituloSec = new javax.swing.JLabel();
        textNomBusSec = new javax.swing.JLabel();
        comboNomBusSec = new javax.swing.JComboBox<>();
        botonBuscarSeccion = new javax.swing.JButton();
        botonAgregarSeccion = new javax.swing.JButton();
        textNumSec = new javax.swing.JLabel();
        campoNumSec = new javax.swing.JTextField();
        textPerAcaSec = new javax.swing.JLabel();
        comboPerAcaSec = new javax.swing.JComboBox<>();
        textAsigSec = new javax.swing.JLabel();
        comboAsigSec = new javax.swing.JComboBox<>();
        textProfSec = new javax.swing.JLabel();
        comboProfSec = new javax.swing.JComboBox<>();
        textMaxEstSec = new javax.swing.JLabel();
        campoMaxEstSec = new javax.swing.JTextField();
        textStaSec = new javax.swing.JLabel();
        comboStaSec = new javax.swing.JComboBox<>();
        bontonAtrasSeccion = new javax.swing.JButton();
        bontonCancelarSeccion = new javax.swing.JButton();
        botonEliminarSeccion = new javax.swing.JButton();
        botonModificarSeccion = new javax.swing.JButton();
        botonGuardarSeccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sección");
        setResizable(false);

        bgSeccion.setBackground(new java.awt.Color(41, 144, 159));

        tituloSec.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        tituloSec.setForeground(new java.awt.Color(255, 255, 255));
        tituloSec.setText("GESTIONAR SECCIÓN");

        textNomBusSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomBusSec.setForeground(new java.awt.Color(255, 255, 255));
        textNomBusSec.setText("Nombre");

        comboNomBusSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNomBusSecActionPerformed(evt);
            }
        });

        botonBuscarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarSeccion.setText("BUSCAR");
        botonBuscarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonAgregarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarSeccion.setText("AGREGAR");
        botonAgregarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textNumSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNumSec.setForeground(new java.awt.Color(255, 255, 255));
        textNumSec.setText("Número");

        campoNumSec.setEditable(false);
        campoNumSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textPerAcaSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textPerAcaSec.setForeground(new java.awt.Color(255, 255, 255));
        textPerAcaSec.setText("Periodo Académico");

        textAsigSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textAsigSec.setForeground(new java.awt.Color(255, 255, 255));
        textAsigSec.setText("Asignatura");

        comboAsigSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAsigSecActionPerformed(evt);
            }
        });

        textProfSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textProfSec.setForeground(new java.awt.Color(255, 255, 255));
        textProfSec.setText("Profesor");

        textMaxEstSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textMaxEstSec.setForeground(new java.awt.Color(255, 255, 255));
        textMaxEstSec.setText("Máximo de Estudiante");

        campoMaxEstSec.setEditable(false);
        campoMaxEstSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMaxEstSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMaxEstSecActionPerformed(evt);
            }
        });

        textStaSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaSec.setForeground(new java.awt.Color(255, 255, 255));
        textStaSec.setText("Estatus");

        bontonAtrasSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasSeccion.setText("ATRAS");
        bontonAtrasSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasSeccion.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasSeccion.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasSeccion.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasSeccionMouseClicked(evt);
            }
        });
        bontonAtrasSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasSeccionActionPerformed(evt);
            }
        });

        bontonCancelarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonCancelarSeccion.setText("CANCELAR");
        bontonCancelarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonCancelarSeccion.setEnabled(false);
        bontonCancelarSeccion.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonCancelarSeccion.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonCancelarSeccion.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonCancelarSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonCancelarSeccionMouseClicked(evt);
            }
        });
        bontonCancelarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonCancelarSeccionActionPerformed(evt);
            }
        });

        botonEliminarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarSeccion.setText("ELIMINAR");
        botonEliminarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarSeccion.setEnabled(false);

        botonModificarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarSeccion.setText("MODIFICAR");
        botonModificarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarSeccion.setEnabled(false);

        botonGuardarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarSeccion.setText("GUARDAR");
        botonGuardarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarSeccion.setEnabled(false);

        javax.swing.GroupLayout bgSeccionLayout = new javax.swing.GroupLayout(bgSeccion);
        bgSeccion.setLayout(bgSeccionLayout);
        bgSeccionLayout.setHorizontalGroup(
            bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSeccionLayout.createSequentialGroup()
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSeccionLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgSeccionLayout.createSequentialGroup()
                                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgSeccionLayout.createSequentialGroup()
                                        .addComponent(textNomBusSec)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboNomBusSec, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(botonBuscarSeccion))
                                    .addComponent(textAsigSec))
                                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgSeccionLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(bgSeccionLayout.createSequentialGroup()
                                                .addComponent(botonEliminarSeccion)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonModificarSeccion)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonGuardarSeccion))
                                            .addGroup(bgSeccionLayout.createSequentialGroup()
                                                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textProfSec)
                                                    .addComponent(textPerAcaSec)
                                                    .addComponent(textStaSec))
                                                .addGap(21, 21, 21)
                                                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboStaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboPerAcaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboProfSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(bgSeccionLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(botonAgregarSeccion))))
                            .addGroup(bgSeccionLayout.createSequentialGroup()
                                .addComponent(bontonAtrasSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bontonCancelarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgSeccionLayout.createSequentialGroup()
                                    .addComponent(textNumSec)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNumSec, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboAsigSec, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgSeccionLayout.createSequentialGroup()
                                        .addComponent(textMaxEstSec)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoMaxEstSec, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(bgSeccionLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(tituloSec)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bgSeccionLayout.setVerticalGroup(
            bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSeccionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloSec)
                .addGap(28, 28, 28)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomBusSec)
                    .addComponent(botonBuscarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNomBusSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNumSec)
                    .addComponent(campoNumSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPerAcaSec)
                    .addComponent(comboPerAcaSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAsigSec)
                    .addComponent(comboAsigSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProfSec)
                    .addComponent(comboProfSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMaxEstSec)
                    .addComponent(campoMaxEstSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStaSec)
                    .addComponent(comboStaSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonGuardarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonModificarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEliminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bontonAtrasSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bontonCancelarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasSeccionMouseClicked

    }//GEN-LAST:event_bontonAtrasSeccionMouseClicked

    private void bontonAtrasSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasSeccionActionPerformed

    private void comboAsigSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAsigSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAsigSecActionPerformed

    private void comboNomBusSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNomBusSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNomBusSecActionPerformed

    private void bontonCancelarSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonCancelarSeccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonCancelarSeccionMouseClicked

    private void bontonCancelarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonCancelarSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonCancelarSeccionActionPerformed

    private void campoMaxEstSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMaxEstSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMaxEstSecActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgSeccion;
    private javax.swing.JButton bontonAtrasSeccion;
    private javax.swing.JButton bontonCancelarSeccion;
    private javax.swing.JButton botonAgregarSeccion;
    private javax.swing.JButton botonBuscarSeccion;
    private javax.swing.JButton botonEliminarSeccion;
    private javax.swing.JButton botonGuardarSeccion;
    private javax.swing.JButton botonModificarSeccion;
    private javax.swing.JTextField campoMaxEstSec;
    private javax.swing.JTextField campoNumSec;
    private javax.swing.JComboBox<String> comboAsigSec;
    private javax.swing.JComboBox<String> comboNomBusSec;
    private javax.swing.JComboBox<String> comboPerAcaSec;
    private javax.swing.JComboBox<String> comboProfSec;
    private javax.swing.JComboBox<String> comboStaSec;
    private javax.swing.JLabel textAsigSec;
    private javax.swing.JLabel textMaxEstSec;
    private javax.swing.JLabel textNomBusSec;
    private javax.swing.JLabel textNumSec;
    private javax.swing.JLabel textPerAcaSec;
    private javax.swing.JLabel textProfSec;
    private javax.swing.JLabel textStaSec;
    private javax.swing.JLabel tituloSec;
    // End of variables declaration//GEN-END:variables
}
