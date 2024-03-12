// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;
import javax.swing.JOptionPane;

public class ModificarNotaProf extends javax.swing.JFrame {

    public javax.swing.JButton getBontonCancelar() {
        return bontonCancelar;
    }

    public javax.swing.JButton getBontonGuardar() {
        return bontonGuardar;
    }

    public javax.swing.JButton getBotonBuscar() {
        return botonBuscar;
    }

    public javax.swing.JTextField getCampoCedula() {
        return campoCedula;
    }

    public javax.swing.JComboBox<String> getListAsignatura() {
        return listAsignatura;
    }

    public javax.swing.JComboBox<String> getListCarreras() {
        return listCarreras;
    }

    public javax.swing.JComboBox<String> getListSeccion() {
        return listSeccion;
    }

    public javax.swing.JTable getTablaNota() {
        return tablaNota;
    }

    public ModificarNotaProf() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bgModificarNota = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        textCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        scrollNota = new javax.swing.JScrollPane();
        tablaNota = new javax.swing.JTable();
        bontonCancelar = new javax.swing.JButton();
        bontonGuardar = new javax.swing.JButton();
        textCarrera = new javax.swing.JLabel();
        listCarreras = new javax.swing.JComboBox<>();
        textAsignatura = new javax.swing.JLabel();
        listAsignatura = new javax.swing.JComboBox<>();
        textSeccion = new javax.swing.JLabel();
        listSeccion = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

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

        javax.swing.GroupLayout bgModificarNotaLayout = new javax.swing.GroupLayout(bgModificarNota);
        bgModificarNota.setLayout(bgModificarNotaLayout);
        bgModificarNotaLayout.setHorizontalGroup(
            bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgModificarNotaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonBuscar)
                    .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgModificarNotaLayout.createSequentialGroup()
                            .addComponent(bontonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(500, 500, 500)
                            .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgModificarNotaLayout.createSequentialGroup()
                            .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(bgModificarNotaLayout.createSequentialGroup()
                                    .addComponent(titulo)
                                    .addGap(30, 30, 30))
                                .addGroup(bgModificarNotaLayout.createSequentialGroup()
                                    .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textCedula)
                                        .addComponent(textAsignatura))
                                    .addGap(33, 33, 33)
                                    .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(listAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textCarrera)
                                        .addComponent(textSeccion))
                                    .addGap(27, 27, 27)))
                            .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(listCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(scrollNota)))
                .addGap(44, 44, 44))
        );
        bgModificarNotaLayout.setVerticalGroup(
            bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgModificarNotaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addGap(43, 43, 43)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCedula)
                    .addComponent(textCarrera)
                    .addComponent(listCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAsignatura)
                    .addComponent(listSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(scrollNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(bgModificarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bontonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bontonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgModificarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgModificarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            CargarNotasProf frm = new CargarNotasProf();
            frm.setVisible(true);
            //Cerrar ventana anterior
            this.dispose();
        }
    }//GEN-LAST:event_bontonCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarNotaProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgModificarNota;
    private javax.swing.JButton bontonCancelar;
    private javax.swing.JButton bontonGuardar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listAsignatura;
    private javax.swing.JComboBox<String> listCarreras;
    private javax.swing.JComboBox<String> listSeccion;
    private javax.swing.JScrollPane scrollNota;
    private javax.swing.JTable tablaNota;
    private javax.swing.JLabel textAsignatura;
    private javax.swing.JLabel textCarrera;
    private javax.swing.JLabel textCedula;
    private javax.swing.JLabel textSeccion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
