// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class SeccionAdmin extends javax.swing.JFrame {

    public SeccionAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSeccion = new javax.swing.JPanel();
        titulo1Sec = new javax.swing.JLabel();
        textCodBusSec = new javax.swing.JLabel();
        campoCodBusSec = new javax.swing.JTextField();
        botonBuscarSeccion = new javax.swing.JButton();
        scrollSec = new javax.swing.JScrollPane();
        tablaSec = new javax.swing.JTable();
        bontonAtrasSeccion = new javax.swing.JButton();
        botonEliminarSeccion = new javax.swing.JButton();
        botonModificarSeccion = new javax.swing.JButton();
        botonGuardarSeccion = new javax.swing.JButton();
        titulo2Sec = new javax.swing.JLabel();
        textCodAgrSec = new javax.swing.JLabel();
        campoCodAgrSec = new javax.swing.JTextField();
        textNumAgrSec = new javax.swing.JLabel();
        campoNumAgrSec = new javax.swing.JTextField();
        textPerAcaAgrSec = new javax.swing.JLabel();
        comboPerAcaAgrSec = new javax.swing.JComboBox<>();
        textAsigAgrSec = new javax.swing.JLabel();
        comboAsigAgrSec = new javax.swing.JComboBox<>();
        textProfAgrSec = new javax.swing.JLabel();
        comboProfAgrSec = new javax.swing.JComboBox<>();
        textMaxEstAgrSec = new javax.swing.JLabel();
        campoMaxEstAgrSec = new javax.swing.JTextField();
        textStaAgrSec = new javax.swing.JLabel();
        comboStaAgrSec = new javax.swing.JComboBox<>();
        botonAgregarSeccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sección");
        setResizable(false);

        bgSeccion.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Sec.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Sec.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Sec.setText("BUSCAR SECCIÓN");

        textCodBusSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodBusSec.setForeground(new java.awt.Color(255, 255, 255));
        textCodBusSec.setText("Código");

        campoCodBusSec.setEditable(false);
        campoCodBusSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarSeccion.setText("BUSCAR");
        botonBuscarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaSec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Número", "Periodo Académico", "Asignatura", "Profesor", "Máximo de Estudiante", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollSec.setViewportView(tablaSec);

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

        titulo2Sec.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Sec.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Sec.setText("AGREGAR SECCIÓN");

        textCodAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrSec.setText("Código");

        campoCodAgrSec.setEditable(false);
        campoCodAgrSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNumAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNumAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textNumAgrSec.setText("Número");

        campoNumAgrSec.setEditable(false);
        campoNumAgrSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textPerAcaAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textPerAcaAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textPerAcaAgrSec.setText("Periodo Académico");

        textAsigAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textAsigAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textAsigAgrSec.setText("Asignatura");

        textProfAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textProfAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textProfAgrSec.setText("Profesor");

        textMaxEstAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textMaxEstAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textMaxEstAgrSec.setText("Máximo de Estudiante");

        campoMaxEstAgrSec.setEditable(false);
        campoMaxEstAgrSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textStaAgrSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrSec.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrSec.setText("Estado");

        botonAgregarSeccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarSeccion.setText("AGREGAR");
        botonAgregarSeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgSeccionLayout = new javax.swing.GroupLayout(bgSeccion);
        bgSeccion.setLayout(bgSeccionLayout);
        bgSeccionLayout.setHorizontalGroup(
            bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSeccionLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgSeccionLayout.createSequentialGroup()
                        .addComponent(textCodBusSec)
                        .addGap(29, 29, 29)
                        .addComponent(campoCodBusSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(botonBuscarSeccion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(bgSeccionLayout.createSequentialGroup()
                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgSeccionLayout.createSequentialGroup()
                                            .addComponent(textStaAgrSec)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSeccionLayout.createSequentialGroup()
                                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                                    .addComponent(textProfAgrSec)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(campoCodAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(35, 35, 35)))
                                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textNumAgrSec)
                                                .addComponent(textMaxEstAgrSec))
                                            .addGap(14, 14, 14))
                                        .addGroup(bgSeccionLayout.createSequentialGroup()
                                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(comboProfAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                                    .addComponent(textPerAcaAgrSec)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(comboPerAcaAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(comboStaAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textAsigAgrSec)
                                            .addGap(94, 94, 94))))
                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                    .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textCodAgrSec)
                                        .addComponent(bontonAtrasSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(botonEliminarSeccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulo2Sec)
                                    .addGap(34, 34, 34)))
                            .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bgSeccionLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(botonModificarSeccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addComponent(botonGuardarSeccion))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSeccionLayout.createSequentialGroup()
                                    .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botonAgregarSeccion)
                                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboAsigAgrSec, 0, 215, Short.MAX_VALUE)
                                            .addComponent(campoNumAgrSec)
                                            .addComponent(campoMaxEstAgrSec)))
                                    .addGap(35, 35, 35))))
                        .addComponent(scrollSec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSeccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1Sec)
                .addGap(329, 329, 329))
        );
        bgSeccionLayout.setVerticalGroup(
            bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgSeccionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo1Sec)
                .addGap(35, 35, 35)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodBusSec)
                    .addComponent(campoCodBusSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollSec, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSeccionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bontonAtrasSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgSeccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo2Sec)
                        .addGap(18, 18, 18)))
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodAgrSec)
                    .addComponent(campoCodAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumAgrSec)
                    .addComponent(campoNumAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPerAcaAgrSec)
                    .addComponent(textAsigAgrSec)
                    .addComponent(comboPerAcaAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAsigAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgSeccionLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProfAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textProfAgrSec)
                            .addComponent(textMaxEstAgrSec))
                        .addGap(18, 18, 18)
                        .addGroup(bgSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboStaAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textStaAgrSec)))
                    .addGroup(bgSeccionLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(campoMaxEstAgrSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 58, Short.MAX_VALUE))
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
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasSeccionMouseClicked

    private void bontonAtrasSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasSeccionActionPerformed

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
    private javax.swing.JButton botonAgregarSeccion;
    private javax.swing.JButton botonBuscarSeccion;
    private javax.swing.JButton botonEliminarSeccion;
    private javax.swing.JButton botonGuardarSeccion;
    private javax.swing.JButton botonModificarSeccion;
    private javax.swing.JTextField campoCodAgrSec;
    private javax.swing.JTextField campoCodBusSec;
    private javax.swing.JTextField campoMaxEstAgrSec;
    private javax.swing.JTextField campoNumAgrSec;
    private javax.swing.JComboBox<String> comboAsigAgrSec;
    private javax.swing.JComboBox<String> comboPerAcaAgrSec;
    private javax.swing.JComboBox<String> comboProfAgrSec;
    private javax.swing.JComboBox<String> comboStaAgrSec;
    private javax.swing.JScrollPane scrollSec;
    private javax.swing.JTable tablaSec;
    private javax.swing.JLabel textAsigAgrSec;
    private javax.swing.JLabel textCodAgrSec;
    private javax.swing.JLabel textCodBusSec;
    private javax.swing.JLabel textMaxEstAgrSec;
    private javax.swing.JLabel textNumAgrSec;
    private javax.swing.JLabel textPerAcaAgrSec;
    private javax.swing.JLabel textProfAgrSec;
    private javax.swing.JLabel textStaAgrSec;
    private javax.swing.JLabel titulo1Sec;
    private javax.swing.JLabel titulo2Sec;
    // End of variables declaration//GEN-END:variables
}
