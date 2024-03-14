// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class PeriodoAcademicoAdmin extends javax.swing.JFrame {

    public PeriodoAcademicoAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPeriodoAcademico = new javax.swing.JPanel();
        titulo1PerAcad = new javax.swing.JLabel();
        textNomBusPerAcad = new javax.swing.JLabel();
        campoNomBusPerAcad = new javax.swing.JTextField();
        botonBuscarPerAcad = new javax.swing.JButton();
        scrollPerAcad = new javax.swing.JScrollPane();
        tablaPerAcad = new javax.swing.JTable();
        bontonAtrasPerAcad = new javax.swing.JButton();
        botonEliminarPerAcad = new javax.swing.JButton();
        botonModificarPerAcad = new javax.swing.JButton();
        botonGuardarPerAcad = new javax.swing.JButton();
        titulo2PerAcad = new javax.swing.JLabel();
        textCodAgrPerAcad = new javax.swing.JLabel();
        campoCodAgrPerAcad = new javax.swing.JTextField();
        textNomAgrPerAcad = new javax.swing.JLabel();
        campoNomAgrPerAcad = new javax.swing.JTextField();
        textDesAcaAgrPerAcad = new javax.swing.JLabel();
        campoDesAgrPerAcad = new javax.swing.JTextField();
        textFecIngAgrPerAcad = new javax.swing.JLabel();
        campoFecIngAgrPerAcad = new javax.swing.JFormattedTextField();
        textFecCulAgrPerAcad = new javax.swing.JLabel();
        campoFecCulAgrPerAcad = new javax.swing.JFormattedTextField();
        textStaAgrPerAcad = new javax.swing.JLabel();
        comboStaAgrPerAcad = new javax.swing.JComboBox<>();
        textActAgrPerAcad = new javax.swing.JLabel();
        comboActAgrPerAcad = new javax.swing.JComboBox<>();
        botonAgregarPerAcad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Período Académico");
        setResizable(false);

        bgPeriodoAcademico.setBackground(new java.awt.Color(41, 144, 159));

        titulo1PerAcad.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1PerAcad.setForeground(new java.awt.Color(255, 255, 255));
        titulo1PerAcad.setText("BUSCAR PERIODO ACADÉMICO");

        textNomBusPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomBusPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textNomBusPerAcad.setText("Nombre");

        campoNomBusPerAcad.setEditable(false);
        campoNomBusPerAcad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarPerAcad.setText("BUSCAR");
        botonBuscarPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaPerAcad.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nombre", "Descripción", "Fecha de Ingreso", "Fecha de Culminación", "Estado", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
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
        scrollPerAcad.setViewportView(tablaPerAcad);

        bontonAtrasPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasPerAcad.setText("ATRAS");
        bontonAtrasPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasPerAcad.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasPerAcad.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasPerAcad.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasPerAcad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasPerAcadMouseClicked(evt);
            }
        });
        bontonAtrasPerAcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasPerAcadActionPerformed(evt);
            }
        });

        botonEliminarPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarPerAcad.setText("ELIMINAR");
        botonEliminarPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarPerAcad.setEnabled(false);

        botonModificarPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarPerAcad.setText("MODIFICAR");
        botonModificarPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarPerAcad.setEnabled(false);

        botonGuardarPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarPerAcad.setText("GUARDAR");
        botonGuardarPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarPerAcad.setEnabled(false);

        titulo2PerAcad.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2PerAcad.setForeground(new java.awt.Color(255, 255, 255));
        titulo2PerAcad.setText("AGREGAR PERIODO ACADÉMICO");

        textCodAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrPerAcad.setText("Código");

        campoCodAgrPerAcad.setEditable(false);
        campoCodAgrPerAcad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrPerAcad.setText("Nombre");

        campoNomAgrPerAcad.setEditable(false);
        campoNomAgrPerAcad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDesAcaAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDesAcaAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textDesAcaAgrPerAcad.setText("Descripción");

        campoDesAgrPerAcad.setEditable(false);
        campoDesAgrPerAcad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textFecIngAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textFecIngAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textFecIngAgrPerAcad.setText("Fecha de Ingreso");

        campoFecIngAgrPerAcad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        textFecCulAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textFecCulAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textFecCulAgrPerAcad.setText("Fecha de Culminación");

        campoFecCulAgrPerAcad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        textStaAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrPerAcad.setText("Estado");

        textActAgrPerAcad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textActAgrPerAcad.setForeground(new java.awt.Color(255, 255, 255));
        textActAgrPerAcad.setText("Activo");

        botonAgregarPerAcad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarPerAcad.setText("AGREGAR");
        botonAgregarPerAcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgPeriodoAcademicoLayout = new javax.swing.GroupLayout(bgPeriodoAcademico);
        bgPeriodoAcademico.setLayout(bgPeriodoAcademicoLayout);
        bgPeriodoAcademicoLayout.setHorizontalGroup(
            bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                        .addComponent(textNomBusPerAcad)
                        .addGap(28, 28, 28)
                        .addComponent(campoNomBusPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarPerAcad)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                        .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                                .addComponent(bontonAtrasPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminarPerAcad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonModificarPerAcad)
                                .addGap(18, 18, 18)
                                .addComponent(botonGuardarPerAcad))
                            .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scrollPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textCodAgrPerAcad)
                                        .addComponent(textActAgrPerAcad)
                                        .addComponent(textFecCulAgrPerAcad)
                                        .addComponent(textDesAcaAgrPerAcad))
                                    .addGap(26, 26, 26)
                                    .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboActAgrPerAcad, javax.swing.GroupLayout.Alignment.LEADING, 0, 228, Short.MAX_VALUE)
                                            .addComponent(campoFecCulAgrPerAcad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoDesAgrPerAcad, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(campoCodAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(57, 57, 57)
                                    .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                                                .addComponent(textNomAgrPerAcad)
                                                .addGap(97, 97, 97)
                                                .addComponent(campoNomAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                                                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textStaAgrPerAcad)
                                                    .addComponent(textFecIngAgrPerAcad))
                                                .addGap(29, 29, 29)
                                                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoFecIngAgrPerAcad)
                                                    .addComponent(comboStaAgrPerAcad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addComponent(botonAgregarPerAcad)))))
                        .addGap(0, 56, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPeriodoAcademicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPeriodoAcademicoLayout.createSequentialGroup()
                        .addComponent(titulo1PerAcad)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPeriodoAcademicoLayout.createSequentialGroup()
                        .addComponent(titulo2PerAcad)
                        .addGap(271, 271, 271))))
        );
        bgPeriodoAcademicoLayout.setVerticalGroup(
            bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPeriodoAcademicoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo1PerAcad)
                .addGap(34, 34, 34)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomBusPerAcad)
                    .addComponent(campoNomBusPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bontonAtrasPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo2PerAcad)
                .addGap(35, 35, 35)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomAgrPerAcad)
                    .addComponent(campoNomAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCodAgrPerAcad))
                .addGap(30, 30, 30)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDesAcaAgrPerAcad)
                    .addComponent(textFecIngAgrPerAcad)
                    .addComponent(campoDesAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFecIngAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFecCulAgrPerAcad)
                    .addComponent(textStaAgrPerAcad)
                    .addComponent(comboStaAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFecCulAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(bgPeriodoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textActAgrPerAcad)
                    .addComponent(comboActAgrPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarPerAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPeriodoAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPeriodoAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasPerAcadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasPerAcadMouseClicked

    }//GEN-LAST:event_bontonAtrasPerAcadMouseClicked

    private void bontonAtrasPerAcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasPerAcadActionPerformed
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasPerAcadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodoAcademicoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPeriodoAcademico;
    private javax.swing.JPanel bgSeccion;
    private javax.swing.JPanel bgSeccion1;
    private javax.swing.JButton bontonAtrasPerAcad;
    private javax.swing.JButton bontonAtrasSeccion;
    private javax.swing.JButton bontonAtrasSeccion1;
    private javax.swing.JButton botonAgregarPerAcad;
    private javax.swing.JButton botonBuscarPerAcad;
    private javax.swing.JButton botonBuscarSeccion;
    private javax.swing.JButton botonBuscarSeccion1;
    private javax.swing.JButton botonEliminarPerAcad;
    private javax.swing.JButton botonGuardarPerAcad;
    private javax.swing.JButton botonModificarPerAcad;
    private javax.swing.JTextField campoCodAgrPerAcad;
    private javax.swing.JTextField campoCodBusSec;
    private javax.swing.JTextField campoCodBusSec1;
    private javax.swing.JTextField campoDesAgrPerAcad;
    private javax.swing.JFormattedTextField campoFecCulAgrPerAcad;
    private javax.swing.JFormattedTextField campoFecIngAgrPerAcad;
    private javax.swing.JTextField campoNomAgrPerAcad;
    private javax.swing.JTextField campoNomBusPerAcad;
    private javax.swing.JComboBox<String> comboActAgrPerAcad;
    private javax.swing.JComboBox<String> comboStaAgrPerAcad;
    private javax.swing.JScrollPane scrollPerAcad;
    private javax.swing.JScrollPane scrollSec;
    private javax.swing.JScrollPane scrollSec1;
    private javax.swing.JTable tablaPerAcad;
    private javax.swing.JTable tablaSec;
    private javax.swing.JTable tablaSec1;
    private javax.swing.JLabel textActAgrPerAcad;
    private javax.swing.JLabel textCodAgrPerAcad;
    private javax.swing.JLabel textCodBusSec;
    private javax.swing.JLabel textCodBusSec1;
    private javax.swing.JLabel textDesAcaAgrPerAcad;
    private javax.swing.JLabel textFecCulAgrPerAcad;
    private javax.swing.JLabel textFecIngAgrPerAcad;
    private javax.swing.JLabel textNomAgrPerAcad;
    private javax.swing.JLabel textNomBusPerAcad;
    private javax.swing.JLabel textStaAgrPerAcad;
    private javax.swing.JLabel titulo1PerAcad;
    private javax.swing.JLabel titulo1Sec;
    private javax.swing.JLabel titulo1Sec1;
    private javax.swing.JLabel titulo2PerAcad;
    // End of variables declaration//GEN-END:variables
}
