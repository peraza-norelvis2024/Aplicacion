// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class DecanatoAdmin extends javax.swing.JFrame {

    public DecanatoAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDecanato = new javax.swing.JPanel();
        titulo1Dec = new javax.swing.JLabel();
        textNomBusDec = new javax.swing.JLabel();
        campoNomBusDec = new javax.swing.JTextField();
        botonBuscarDec = new javax.swing.JButton();
        scrollDec = new javax.swing.JScrollPane();
        tablaDec = new javax.swing.JTable();
        bontonAtrasDec = new javax.swing.JButton();
        botonEliminarDec = new javax.swing.JButton();
        botonModificarDec = new javax.swing.JButton();
        botonGuardarDec = new javax.swing.JButton();
        titulo2Dec = new javax.swing.JLabel();
        textCodAgrDec = new javax.swing.JLabel();
        campoCodAgrDec = new javax.swing.JTextField();
        textNomAgrDec = new javax.swing.JLabel();
        campoNomAgrDec = new javax.swing.JTextField();
        textDesAgrDec = new javax.swing.JLabel();
        campoDesAgrDec = new javax.swing.JTextField();
        textUniAgrDec = new javax.swing.JLabel();
        comboUniAgrDec = new javax.swing.JComboBox<>();
        textStaAgrDec = new javax.swing.JLabel();
        comboStaAgrDec = new javax.swing.JComboBox<>();
        botonAgregarDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decanato");
        setResizable(false);

        bgDecanato.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Dec.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Dec.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Dec.setText("BUSCAR DECANATO");

        textNomBusDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomBusDec.setForeground(new java.awt.Color(255, 255, 255));
        textNomBusDec.setText("Nombre");

        campoNomBusDec.setEditable(false);
        campoNomBusDec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarDec.setText("BUSCAR");
        botonBuscarDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaDec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Descripción", "Universidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollDec.setViewportView(tablaDec);

        bontonAtrasDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasDec.setText("ATRAS");
        bontonAtrasDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasDec.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasDec.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasDec.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasDecMouseClicked(evt);
            }
        });
        bontonAtrasDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasDecActionPerformed(evt);
            }
        });

        botonEliminarDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarDec.setText("ELIMINAR");
        botonEliminarDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarDec.setEnabled(false);

        botonModificarDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarDec.setText("MODIFICAR");
        botonModificarDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarDec.setEnabled(false);

        botonGuardarDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarDec.setText("GUARDAR");
        botonGuardarDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarDec.setEnabled(false);

        titulo2Dec.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Dec.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Dec.setText("AGREGAR DECANATO");

        textCodAgrDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrDec.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrDec.setText("Código");

        campoCodAgrDec.setEditable(false);
        campoCodAgrDec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrDec.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrDec.setText("Nombre");

        campoNomAgrDec.setEditable(false);
        campoNomAgrDec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDesAgrDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDesAgrDec.setForeground(new java.awt.Color(255, 255, 255));
        textDesAgrDec.setText("Descripción");

        campoDesAgrDec.setEditable(false);
        campoDesAgrDec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textUniAgrDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textUniAgrDec.setForeground(new java.awt.Color(255, 255, 255));
        textUniAgrDec.setText("Universidad");

        textStaAgrDec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrDec.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrDec.setText("Estado");

        botonAgregarDec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarDec.setText("AGREGAR");
        botonAgregarDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgDecanatoLayout = new javax.swing.GroupLayout(bgDecanato);
        bgDecanato.setLayout(bgDecanatoLayout);
        bgDecanatoLayout.setHorizontalGroup(
            bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDecanatoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgDecanatoLayout.createSequentialGroup()
                            .addComponent(bontonAtrasDec, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonEliminarDec)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificarDec)
                            .addGap(18, 18, 18)
                            .addComponent(botonGuardarDec))
                        .addComponent(scrollDec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgDecanatoLayout.createSequentialGroup()
                            .addComponent(textNomBusDec)
                            .addGap(29, 29, 29)
                            .addComponent(campoNomBusDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(botonBuscarDec)))
                    .addGroup(bgDecanatoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodAgrDec)
                            .addComponent(textDesAgrDec)
                            .addComponent(textStaAgrDec))
                        .addGap(26, 26, 26)
                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDecanatoLayout.createSequentialGroup()
                                .addComponent(titulo2Dec)
                                .addGap(41, 41, 41))
                            .addGroup(bgDecanatoLayout.createSequentialGroup()
                                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboStaAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgDecanatoLayout.createSequentialGroup()
                                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoDesAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoCodAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textNomAgrDec)
                                            .addComponent(textUniAgrDec))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboUniAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoNomAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonAgregarDec))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDecanatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1Dec)
                .addGap(363, 363, 363))
        );
        bgDecanatoLayout.setVerticalGroup(
            bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDecanatoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo1Dec)
                .addGap(39, 39, 39)
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomBusDec)
                    .addComponent(campoNomBusDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollDec, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgDecanatoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bontonAtrasDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgDecanatoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo2Dec)
                        .addGap(32, 32, 32)))
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomAgrDec)
                    .addComponent(campoNomAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCodAgrDec))
                .addGap(37, 37, 37)
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDesAgrDec)
                    .addComponent(campoDesAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUniAgrDec)
                    .addComponent(comboUniAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(bgDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStaAgrDec)
                    .addComponent(comboStaAgrDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDecanato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDecanato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasDecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasDecMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasDecMouseClicked

    private void bontonAtrasDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasDecActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecanatoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDecanato;
    private javax.swing.JButton bontonAtrasDec;
    private javax.swing.JButton botonAgregarDec;
    private javax.swing.JButton botonBuscarDec;
    private javax.swing.JButton botonEliminarDec;
    private javax.swing.JButton botonGuardarDec;
    private javax.swing.JButton botonModificarDec;
    private javax.swing.JTextField campoCodAgrDec;
    private javax.swing.JTextField campoDesAgrDec;
    private javax.swing.JTextField campoNomAgrDec;
    private javax.swing.JTextField campoNomBusDec;
    private javax.swing.JComboBox<String> comboStaAgrDec;
    private javax.swing.JComboBox<String> comboUniAgrDec;
    private javax.swing.JScrollPane scrollDec;
    private javax.swing.JTable tablaDec;
    private javax.swing.JLabel textCodAgrDec;
    private javax.swing.JLabel textDesAgrDec;
    private javax.swing.JLabel textNomAgrDec;
    private javax.swing.JLabel textNomBusDec;
    private javax.swing.JLabel textStaAgrDec;
    private javax.swing.JLabel textUniAgrDec;
    private javax.swing.JLabel titulo1Dec;
    private javax.swing.JLabel titulo2Dec;
    // End of variables declaration//GEN-END:variables
}
