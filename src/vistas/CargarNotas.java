// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class CargarNotas extends javax.swing.JFrame {

    public CargarNotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listPeriodos2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        bgCargarNotas = new javax.swing.JPanel();
        tituloNotas = new javax.swing.JLabel();
        textPeriodos = new javax.swing.JLabel();
        listPeriodos = new javax.swing.JComboBox<>();
        textCarrera = new javax.swing.JLabel();
        listCarreras = new javax.swing.JComboBox<>();
        textAsignatura = new javax.swing.JLabel();
        listAsignatura = new javax.swing.JComboBox<>();
        textSeccion = new javax.swing.JLabel();
        listSeccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bontonAtras1 = new javax.swing.JButton();
        bontonModificar = new javax.swing.JButton();

        listPeriodos2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargar Notas");
        setResizable(false);

        bgCargarNotas.setBackground(new java.awt.Color(41, 144, 159));

        tituloNotas.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        tituloNotas.setForeground(new java.awt.Color(255, 255, 255));
        tituloNotas.setText("CARGAR NOTAS");

        textPeriodos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textPeriodos.setForeground(new java.awt.Color(255, 255, 255));
        textPeriodos.setText("Período Académico");

        listPeriodos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCarrera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCarrera.setForeground(new java.awt.Color(255, 255, 255));
        textCarrera.setText("Carrera");

        listCarreras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textAsignatura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        textAsignatura.setText("Asignatura");

        listAsignatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textSeccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textSeccion.setForeground(new java.awt.Color(255, 255, 255));
        textSeccion.setText("Sección");

        listSeccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        bontonAtras1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtras1.setText("ATRAS");
        bontonAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtras1.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtras1.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtras1.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtras1MouseClicked(evt);
            }
        });

        bontonModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonModificar.setText("MODIFICAR");
        bontonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonModificar.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgCargarNotasLayout = new javax.swing.GroupLayout(bgCargarNotas);
        bgCargarNotas.setLayout(bgCargarNotasLayout);
        bgCargarNotasLayout.setHorizontalGroup(
            bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCargarNotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloNotas)
                .addGap(287, 287, 287))
            .addGroup(bgCargarNotasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgCargarNotasLayout.createSequentialGroup()
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPeriodos)
                            .addComponent(textAsignatura))
                        .addGap(22, 22, 22)
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listAsignatura, 0, 200, Short.MAX_VALUE)
                            .addComponent(listPeriodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCarrera)
                            .addComponent(textSeccion))
                        .addGap(27, 27, 27)
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listCarreras, 0, 200, Short.MAX_VALUE)
                            .addComponent(listSeccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCargarNotasLayout.createSequentialGroup()
                        .addComponent(bontonAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bontonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        bgCargarNotasLayout.setVerticalGroup(
            bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCargarNotasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloNotas)
                .addGap(28, 28, 28)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeriodos)
                    .addComponent(listPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCarrera)
                    .addComponent(listCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAsignatura)
                    .addComponent(textSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bontonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCargarNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCargarNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonModificarMouseClicked
        //Abrir ventana
        ModificarNota frm = new ModificarNota();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonModificarMouseClicked

    private void bontonAtras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtras1MouseClicked
        //Abrir ventana
        DashboardProfesor frm = new DashboardProfesor();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtras1MouseClicked

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
            java.util.logging.Logger.getLogger(CargarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCargarNotas;
    private javax.swing.JButton bontonAtras1;
    private javax.swing.JButton bontonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> listAsignatura;
    private javax.swing.JComboBox<String> listCarreras;
    private javax.swing.JComboBox<String> listPeriodos;
    private javax.swing.JComboBox<String> listPeriodos2;
    private javax.swing.JComboBox<String> listSeccion;
    private javax.swing.JLabel textAsignatura;
    private javax.swing.JLabel textCarrera;
    private javax.swing.JLabel textPeriodos;
    private javax.swing.JLabel textSeccion;
    private javax.swing.JLabel tituloNotas;
    // End of variables declaration//GEN-END:variables
}
