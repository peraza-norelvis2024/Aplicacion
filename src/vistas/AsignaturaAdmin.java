// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class AsignaturaAdmin extends javax.swing.JFrame {

    public AsignaturaAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsignatura = new javax.swing.JPanel();
        titulo1Asig = new javax.swing.JLabel();
        textNomBusAsig = new javax.swing.JLabel();
        campoNomBusAsig = new javax.swing.JTextField();
        botonBuscarAsig = new javax.swing.JButton();
        scrollAsig = new javax.swing.JScrollPane();
        tablaAsig = new javax.swing.JTable();
        bontonAtrasAsig = new javax.swing.JButton();
        botonEliminarAsig = new javax.swing.JButton();
        botonModificarAsig = new javax.swing.JButton();
        botonGuardarAsig = new javax.swing.JButton();
        titulo2Asig = new javax.swing.JLabel();
        textCodAgrAsig = new javax.swing.JLabel();
        campoCodAgrAsig = new javax.swing.JTextField();
        textNomAgrAsig = new javax.swing.JLabel();
        campoNomAgrAsig = new javax.swing.JTextField();
        textDesAgrAsig = new javax.swing.JLabel();
        campoDesAgrAsig = new javax.swing.JTextField();
        textSemAgrAsig = new javax.swing.JLabel();
        comboSemAgrAsig = new javax.swing.JComboBox<>();
        textCarAgrAsig = new javax.swing.JLabel();
        comboCarAgrAsig = new javax.swing.JComboBox<>();
        textStaAgrAsig = new javax.swing.JLabel();
        comboStaAgrAsig = new javax.swing.JComboBox<>();
        botonAgregarAsig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asignatura");
        setResizable(false);

        bgAsignatura.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Asig.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Asig.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Asig.setText("BUSCAR ASIGNACIÓN");

        textNomBusAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomBusAsig.setForeground(new java.awt.Color(255, 255, 255));
        textNomBusAsig.setText("Nombre");

        campoNomBusAsig.setEditable(false);
        campoNomBusAsig.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarAsig.setText("BUSCAR");
        botonBuscarAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaAsig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Descripción", "Semestre", "Carrera", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollAsig.setViewportView(tablaAsig);

        bontonAtrasAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasAsig.setText("ATRAS");
        bontonAtrasAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasAsig.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasAsig.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasAsig.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasAsig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasAsigMouseClicked(evt);
            }
        });
        bontonAtrasAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasAsigActionPerformed(evt);
            }
        });

        botonEliminarAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarAsig.setText("ELIMINAR");
        botonEliminarAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarAsig.setEnabled(false);

        botonModificarAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarAsig.setText("MODIFICAR");
        botonModificarAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarAsig.setEnabled(false);

        botonGuardarAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarAsig.setText("GUARDAR");
        botonGuardarAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarAsig.setEnabled(false);

        titulo2Asig.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Asig.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Asig.setText("AGREGAR ASIGNACIÓN");

        textCodAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrAsig.setText("Código");

        campoCodAgrAsig.setEditable(false);
        campoCodAgrAsig.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrAsig.setText("Nombre");

        campoNomAgrAsig.setEditable(false);
        campoNomAgrAsig.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDesAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDesAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textDesAgrAsig.setText("Descripción");

        campoDesAgrAsig.setEditable(false);
        campoDesAgrAsig.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textSemAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textSemAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textSemAgrAsig.setText("Semestre");

        textCarAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCarAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textCarAgrAsig.setText("Carrera");

        textStaAgrAsig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrAsig.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrAsig.setText("Estado");

        botonAgregarAsig.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarAsig.setText("AGREGAR");
        botonAgregarAsig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgAsignaturaLayout = new javax.swing.GroupLayout(bgAsignatura);
        bgAsignatura.setLayout(bgAsignaturaLayout);
        bgAsignaturaLayout.setHorizontalGroup(
            bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAsignaturaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgAsignaturaLayout.createSequentialGroup()
                            .addComponent(bontonAtrasAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonEliminarAsig)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificarAsig)
                            .addGap(18, 18, 18)
                            .addComponent(botonGuardarAsig))
                        .addComponent(scrollAsig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgAsignaturaLayout.createSequentialGroup()
                            .addComponent(textNomBusAsig)
                            .addGap(29, 29, 29)
                            .addComponent(campoNomBusAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(botonBuscarAsig)))
                    .addGroup(bgAsignaturaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregarAsig)
                            .addGroup(bgAsignaturaLayout.createSequentialGroup()
                                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCodAgrAsig)
                                    .addComponent(textDesAgrAsig)
                                    .addComponent(textCarAgrAsig))
                                .addGap(26, 26, 26)
                                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDesAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCarAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSemAgrAsig)
                                    .addComponent(textNomAgrAsig)
                                    .addComponent(textStaAgrAsig))
                                .addGap(33, 33, 33)
                                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSemAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNomAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboStaAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(bgAsignaturaLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(titulo2Asig)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAsignaturaLayout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(titulo1Asig)
                    .addGap(341, 341, 341)))
        );
        bgAsignaturaLayout.setVerticalGroup(
            bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAsignaturaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomBusAsig)
                    .addComponent(campoNomBusAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonAtrasAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2Asig)
                .addGap(18, 18, 18)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textCodAgrAsig)
                    .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoCodAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNomAgrAsig)
                        .addComponent(campoNomAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDesAgrAsig)
                    .addComponent(campoDesAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSemAgrAsig)
                    .addComponent(comboSemAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCarAgrAsig)
                    .addComponent(comboCarAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStaAgrAsig)
                    .addComponent(comboStaAgrAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAgregarAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(bgAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgAsignaturaLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(titulo1Asig)
                    .addContainerGap(932, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasAsigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasAsigMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasAsigMouseClicked

    private void bontonAtrasAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasAsigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasAsigActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignaturaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAsignatura;
    private javax.swing.JButton bontonAtrasAsig;
    private javax.swing.JButton botonAgregarAsig;
    private javax.swing.JButton botonBuscarAsig;
    private javax.swing.JButton botonEliminarAsig;
    private javax.swing.JButton botonGuardarAsig;
    private javax.swing.JButton botonModificarAsig;
    private javax.swing.JTextField campoCodAgrAsig;
    private javax.swing.JTextField campoDesAgrAsig;
    private javax.swing.JTextField campoNomAgrAsig;
    private javax.swing.JTextField campoNomBusAsig;
    private javax.swing.JComboBox<String> comboCarAgrAsig;
    private javax.swing.JComboBox<String> comboSemAgrAsig;
    private javax.swing.JComboBox<String> comboStaAgrAsig;
    private javax.swing.JScrollPane scrollAsig;
    private javax.swing.JTable tablaAsig;
    private javax.swing.JLabel textCarAgrAsig;
    private javax.swing.JLabel textCodAgrAsig;
    private javax.swing.JLabel textDesAgrAsig;
    private javax.swing.JLabel textNomAgrAsig;
    private javax.swing.JLabel textNomBusAsig;
    private javax.swing.JLabel textSemAgrAsig;
    private javax.swing.JLabel textStaAgrAsig;
    private javax.swing.JLabel titulo1Asig;
    private javax.swing.JLabel titulo2Asig;
    // End of variables declaration//GEN-END:variables
}
