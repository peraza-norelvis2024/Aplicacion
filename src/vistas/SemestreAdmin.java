// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class SemestreAdmin extends javax.swing.JFrame {

    public SemestreAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSemestre = new javax.swing.JPanel();
        titulo1Sem = new javax.swing.JLabel();
        textCodBusSem = new javax.swing.JLabel();
        campoCodBusSem = new javax.swing.JTextField();
        botonBuscarSem = new javax.swing.JButton();
        scrollSem = new javax.swing.JScrollPane();
        tablaSem = new javax.swing.JTable();
        bontonAtrasSem = new javax.swing.JButton();
        botonEliminarSem = new javax.swing.JButton();
        botonModificarSem = new javax.swing.JButton();
        botonGuardarSem = new javax.swing.JButton();
        titulo2Sem = new javax.swing.JLabel();
        textCodAgrSem = new javax.swing.JLabel();
        campoCodAgrSem = new javax.swing.JTextField();
        textNomAgrSem = new javax.swing.JLabel();
        campoNomAgrSem = new javax.swing.JTextField();
        textStaAgrSem = new javax.swing.JLabel();
        comboStaAgrSem = new javax.swing.JComboBox<>();
        botonAgregarSem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Semestre");
        setResizable(false);

        bgSemestre.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Sem.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Sem.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Sem.setText("BUSCAR SEMESTRE");

        textCodBusSem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodBusSem.setForeground(new java.awt.Color(255, 255, 255));
        textCodBusSem.setText("Código");

        campoCodBusSem.setEditable(false);
        campoCodBusSem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarSem.setText("BUSCAR");
        botonBuscarSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaSem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollSem.setViewportView(tablaSem);

        bontonAtrasSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasSem.setText("ATRAS");
        bontonAtrasSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasSem.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasSem.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasSem.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasSem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasSemMouseClicked(evt);
            }
        });
        bontonAtrasSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasSemActionPerformed(evt);
            }
        });

        botonEliminarSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarSem.setText("ELIMINAR");
        botonEliminarSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarSem.setEnabled(false);

        botonModificarSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarSem.setText("MODIFICAR");
        botonModificarSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarSem.setEnabled(false);

        botonGuardarSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarSem.setText("GUARDAR");
        botonGuardarSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarSem.setEnabled(false);

        titulo2Sem.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Sem.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Sem.setText("AGREGAR SEMESTRE");

        textCodAgrSem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrSem.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrSem.setText("Código");

        campoCodAgrSem.setEditable(false);
        campoCodAgrSem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrSem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrSem.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrSem.setText("Nombre");

        campoNomAgrSem.setEditable(false);
        campoNomAgrSem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textStaAgrSem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrSem.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrSem.setText("Estado");

        botonAgregarSem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarSem.setText("AGREGAR");
        botonAgregarSem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgSemestreLayout = new javax.swing.GroupLayout(bgSemestre);
        bgSemestre.setLayout(bgSemestreLayout);
        bgSemestreLayout.setHorizontalGroup(
            bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSemestreLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgSemestreLayout.createSequentialGroup()
                            .addComponent(bontonAtrasSem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonEliminarSem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificarSem)
                            .addGap(18, 18, 18)
                            .addComponent(botonGuardarSem))
                        .addComponent(scrollSem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgSemestreLayout.createSequentialGroup()
                            .addComponent(textCodBusSem)
                            .addGap(29, 29, 29)
                            .addComponent(campoCodBusSem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(botonBuscarSem)))
                    .addGroup(bgSemestreLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodAgrSem)
                            .addComponent(textStaAgrSem))
                        .addGap(41, 41, 41)
                        .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgSemestreLayout.createSequentialGroup()
                                .addComponent(campoCodAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(textNomAgrSem)
                                .addGap(28, 28, 28)
                                .addComponent(campoNomAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgSemestreLayout.createSequentialGroup()
                                .addComponent(comboStaAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAgregarSem)))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSemestreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSemestreLayout.createSequentialGroup()
                        .addComponent(titulo1Sem)
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSemestreLayout.createSequentialGroup()
                        .addComponent(titulo2Sem)
                        .addGap(340, 340, 340))))
        );
        bgSemestreLayout.setVerticalGroup(
            bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSemestreLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo1Sem)
                .addGap(39, 39, 39)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodBusSem)
                    .addComponent(campoCodBusSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollSem, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonAtrasSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titulo2Sem)
                .addGap(23, 23, 23)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodAgrSem)
                    .addComponent(campoCodAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomAgrSem)
                    .addComponent(campoNomAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSemestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboStaAgrSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAgregarSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textStaAgrSem))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasSemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasSemMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasSemMouseClicked

    private void bontonAtrasSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasSemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemestreAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgSemestre;
    private javax.swing.JButton bontonAtrasSem;
    private javax.swing.JButton botonAgregarSem;
    private javax.swing.JButton botonBuscarSem;
    private javax.swing.JButton botonEliminarSem;
    private javax.swing.JButton botonGuardarSem;
    private javax.swing.JButton botonModificarSem;
    private javax.swing.JTextField campoCodAgrSem;
    private javax.swing.JTextField campoCodBusSem;
    private javax.swing.JTextField campoNomAgrSem;
    private javax.swing.JComboBox<String> comboStaAgrSem;
    private javax.swing.JScrollPane scrollSem;
    private javax.swing.JTable tablaSem;
    private javax.swing.JLabel textCodAgrSem;
    private javax.swing.JLabel textCodBusSem;
    private javax.swing.JLabel textNomAgrSem;
    private javax.swing.JLabel textStaAgrSem;
    private javax.swing.JLabel titulo1Sem;
    private javax.swing.JLabel titulo2Sem;
    // End of variables declaration//GEN-END:variables
}
