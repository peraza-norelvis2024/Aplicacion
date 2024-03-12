// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class CargarNotasProf extends javax.swing.JFrame {

    public javax.swing.JButton getBontonAtras1() {
        return bontonAtras1;
    }

    public javax.swing.JButton getBontonGuardar() {
        return bontonGuardar;
    }

    public javax.swing.JComboBox<String> getListAsignatura() {
        return listAsignatura;
    }

    public javax.swing.JComboBox<String> getListCarreras() {
        return listCarreras;
    }

    public javax.swing.JComboBox<String> getListPeriodos() {
        return listPeriodos;
    }

    public javax.swing.JComboBox<String> getListPeriodos2() {
        return listPeriodos2;
    }

    public javax.swing.JComboBox<String> getListSeccion() {
        return listSeccion;
    }

    public javax.swing.JMenu getModificarNota() {
        return modificarNota;
    }

    public javax.swing.JTable getTablaNotas() {
        return tablaNotas;
    }

    public CargarNotasProf() {
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
        scrollNotas = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        bontonAtras1 = new javax.swing.JButton();
        bontonGuardar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        modificarNota = new javax.swing.JMenu();

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
        listPeriodos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPeriodosActionPerformed(evt);
            }
        });

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

        tablaNotas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollNotas.setViewportView(tablaNotas);

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

        javax.swing.GroupLayout bgCargarNotasLayout = new javax.swing.GroupLayout(bgCargarNotas);
        bgCargarNotas.setLayout(bgCargarNotasLayout);
        bgCargarNotasLayout.setHorizontalGroup(
            bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCargarNotasLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(tituloNotas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgCargarNotasLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgCargarNotasLayout.createSequentialGroup()
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAsignatura)
                            .addComponent(textPeriodos))
                        .addGap(18, 18, 18)
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgCargarNotasLayout.createSequentialGroup()
                                .addComponent(textCarrera)
                                .addGap(51, 51, 51)
                                .addComponent(listCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgCargarNotasLayout.createSequentialGroup()
                                .addComponent(textSeccion)
                                .addGap(51, 51, 51)
                                .addComponent(listSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(bgCargarNotasLayout.createSequentialGroup()
                            .addComponent(bontonAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        bgCargarNotasLayout.setVerticalGroup(
            bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCargarNotasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloNotas)
                .addGap(39, 39, 39)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPeriodos)
                    .addComponent(listPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCarrera))
                .addGap(66, 66, 66)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAsignatura)
                    .addComponent(textSeccion)
                    .addComponent(listSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(scrollNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(bgCargarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        modificarNota.setText("Modificar Nota");
        modificarNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modificarNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarNotaMouseClicked(evt);
            }
        });
        modificarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNotaActionPerformed(evt);
            }
        });
        menu.add(modificarNota);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCargarNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCargarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtras1MouseClicked
        //Abrir ventana
        DashboardProfesor frm = new DashboardProfesor();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtras1MouseClicked

    private void bontonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonGuardarMouseClicked

    }//GEN-LAST:event_bontonGuardarMouseClicked

    private void modificarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNotaActionPerformed
        
    }//GEN-LAST:event_modificarNotaActionPerformed

    private void modificarNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarNotaMouseClicked
        //Abrir la otra ventana si el usuario y contraseña son correctos
        ModificarNotaProf frm = new ModificarNotaProf();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_modificarNotaMouseClicked

    private void listPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPeriodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listPeriodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarNotasProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCargarNotas;
    private javax.swing.JButton bontonAtras1;
    private javax.swing.JButton bontonGuardar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> listAsignatura;
    private javax.swing.JComboBox<String> listCarreras;
    private javax.swing.JComboBox<String> listPeriodos;
    private javax.swing.JComboBox<String> listPeriodos2;
    private javax.swing.JComboBox<String> listSeccion;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu modificarNota;
    private javax.swing.JScrollPane scrollNotas;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JLabel textAsignatura;
    private javax.swing.JLabel textCarrera;
    private javax.swing.JLabel textPeriodos;
    private javax.swing.JLabel textSeccion;
    private javax.swing.JLabel tituloNotas;
    // End of variables declaration//GEN-END:variables
}
