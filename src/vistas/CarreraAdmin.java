// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class CarreraAdmin extends javax.swing.JFrame {

    public CarreraAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCarrera = new javax.swing.JPanel();
        titulo1Car = new javax.swing.JLabel();
        textNomBusCar = new javax.swing.JLabel();
        campoNomBusCar = new javax.swing.JTextField();
        botonBuscarCar = new javax.swing.JButton();
        scrollCar = new javax.swing.JScrollPane();
        tablaCar = new javax.swing.JTable();
        bontonAtrasCar = new javax.swing.JButton();
        botonEliminarCar = new javax.swing.JButton();
        botonModificarCar = new javax.swing.JButton();
        botonGuardarCar = new javax.swing.JButton();
        titulo2Car = new javax.swing.JLabel();
        textCodAgrCar = new javax.swing.JLabel();
        campoCodAgrCar = new javax.swing.JTextField();
        textNomAgrCar = new javax.swing.JLabel();
        campoNomAgrCar = new javax.swing.JTextField();
        textDesAgrCar = new javax.swing.JLabel();
        campoDesAgrCar = new javax.swing.JTextField();
        textDecAgrCar = new javax.swing.JLabel();
        comboDecAgrCar = new javax.swing.JComboBox<>();
        textStaAgrCar = new javax.swing.JLabel();
        comboStaAgrCar = new javax.swing.JComboBox<>();
        botonAgregarCar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera");
        setResizable(false);

        bgCarrera.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Car.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Car.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Car.setText("BUSCAR CARRERA");

        textNomBusCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomBusCar.setForeground(new java.awt.Color(255, 255, 255));
        textNomBusCar.setText("Nombre");

        campoNomBusCar.setEditable(false);
        campoNomBusCar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarCar.setText("BUSCAR");
        botonBuscarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaCar.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nombre", "Descripción", "Decanato", "Estado"
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
        scrollCar.setViewportView(tablaCar);

        bontonAtrasCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasCar.setText("ATRAS");
        bontonAtrasCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasCar.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasCar.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasCar.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasCarMouseClicked(evt);
            }
        });
        bontonAtrasCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasCarActionPerformed(evt);
            }
        });

        botonEliminarCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarCar.setText("ELIMINAR");
        botonEliminarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarCar.setEnabled(false);

        botonModificarCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarCar.setText("MODIFICAR");
        botonModificarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarCar.setEnabled(false);

        botonGuardarCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarCar.setText("GUARDAR");
        botonGuardarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarCar.setEnabled(false);

        titulo2Car.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Car.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Car.setText("AGREGAR CARRERA");

        textCodAgrCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrCar.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrCar.setText("Código");

        campoCodAgrCar.setEditable(false);
        campoCodAgrCar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrCar.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrCar.setText("Nombre");

        campoNomAgrCar.setEditable(false);
        campoNomAgrCar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDesAgrCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDesAgrCar.setForeground(new java.awt.Color(255, 255, 255));
        textDesAgrCar.setText("Descripción");

        campoDesAgrCar.setEditable(false);
        campoDesAgrCar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDecAgrCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDecAgrCar.setForeground(new java.awt.Color(255, 255, 255));
        textDecAgrCar.setText("Decanato");

        textStaAgrCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrCar.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrCar.setText("Estado");

        botonAgregarCar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarCar.setText("AGREGAR");
        botonAgregarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgCarreraLayout = new javax.swing.GroupLayout(bgCarrera);
        bgCarrera.setLayout(bgCarreraLayout);
        bgCarreraLayout.setHorizontalGroup(
            bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCarreraLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgCarreraLayout.createSequentialGroup()
                            .addComponent(bontonAtrasCar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonEliminarCar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificarCar)
                            .addGap(18, 18, 18)
                            .addComponent(botonGuardarCar))
                        .addComponent(scrollCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgCarreraLayout.createSequentialGroup()
                            .addComponent(textNomBusCar)
                            .addGap(29, 29, 29)
                            .addComponent(campoNomBusCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(botonBuscarCar)))
                    .addGroup(bgCarreraLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodAgrCar)
                            .addComponent(textDesAgrCar)
                            .addComponent(textStaAgrCar))
                        .addGap(26, 26, 26)
                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCarreraLayout.createSequentialGroup()
                                .addComponent(titulo2Car)
                                .addGap(41, 41, 41))
                            .addGroup(bgCarreraLayout.createSequentialGroup()
                                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboStaAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgCarreraLayout.createSequentialGroup()
                                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoDesAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoCodAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textNomAgrCar)
                                            .addComponent(textDecAgrCar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregarCar)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgCarreraLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(comboDecAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNomAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCarreraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1Car)
                .addGap(363, 363, 363))
        );
        bgCarreraLayout.setVerticalGroup(
            bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCarreraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo1Car)
                .addGap(39, 39, 39)
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomBusCar)
                    .addComponent(campoNomBusCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollCar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgCarreraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bontonAtrasCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCarreraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo2Car)
                        .addGap(32, 32, 32)))
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textCodAgrCar)
                    .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoCodAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNomAgrCar)
                        .addComponent(campoNomAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDesAgrCar)
                    .addComponent(campoDesAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDecAgrCar)
                    .addComponent(comboDecAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(bgCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStaAgrCar)
                    .addComponent(comboStaAgrCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasCarMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasCarMouseClicked

    private void bontonAtrasCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasCarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarreraAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCarrera;
    private javax.swing.JButton bontonAtrasCar;
    private javax.swing.JButton botonAgregarCar;
    private javax.swing.JButton botonBuscarCar;
    private javax.swing.JButton botonEliminarCar;
    private javax.swing.JButton botonGuardarCar;
    private javax.swing.JButton botonModificarCar;
    private javax.swing.JTextField campoCodAgrCar;
    private javax.swing.JTextField campoDesAgrCar;
    private javax.swing.JTextField campoNomAgrCar;
    private javax.swing.JTextField campoNomBusCar;
    private javax.swing.JComboBox<String> comboDecAgrCar;
    private javax.swing.JComboBox<String> comboStaAgrCar;
    private javax.swing.JScrollPane scrollCar;
    private javax.swing.JTable tablaCar;
    private javax.swing.JLabel textCodAgrCar;
    private javax.swing.JLabel textDecAgrCar;
    private javax.swing.JLabel textDesAgrCar;
    private javax.swing.JLabel textNomAgrCar;
    private javax.swing.JLabel textNomBusCar;
    private javax.swing.JLabel textStaAgrCar;
    private javax.swing.JLabel titulo1Car;
    private javax.swing.JLabel titulo2Car;
    // End of variables declaration//GEN-END:variables
}
