// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class InscripcionAdmin extends javax.swing.JFrame {

    public javax.swing.JButton getBotonAgregar() {
        return botonAgregar;
    }

    public javax.swing.JButton getBotonBuscar() {
        return botonBuscar;
    }

    public javax.swing.JButton getBotonInscripcion() {
        return botonInscripcion;
    }

    public javax.swing.JTextField getCampoApellidos() {
        return campoApellidos;
    }

    public javax.swing.JComboBox<String> getCampoAsignatura() {
        return campoAsignatura;
    }

    public javax.swing.JTextField getCampoCarrera1() {
        return campoCarrera1;
    }

    public javax.swing.JTextField getCampoCedula() {
        return campoCedula;
    }

    public javax.swing.JTextField getCampoNombres() {
        return campoNombres;
    }

    public javax.swing.JComboBox<String> getCampoPeriodoAcademico() {
        return campoPeriodoAcademico;
    }

    public javax.swing.JComboBox<String> getCampoSecciones() {
        return campoSecciones;
    }

    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    public InscripcionAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        textCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        textPeriodoAcademico = new javax.swing.JLabel();
        campoPeriodoAcademico = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        textNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        textApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        textCarrera = new javax.swing.JLabel();
        campoCarrera1 = new javax.swing.JTextField();
        titulo2 = new javax.swing.JLabel();
        textAsignatura = new javax.swing.JLabel();
        campoAsignatura = new javax.swing.JComboBox<>();
        textSecciones = new javax.swing.JLabel();
        campoSecciones = new javax.swing.JComboBox<>();
        botonAgregar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonInscripcion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscripción");
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 144, 159));

        titulo1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("BUSCAR ESTUDIANTE");

        textCedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedula.setForeground(new java.awt.Color(255, 255, 255));
        textCedula.setText("Cédula");

        campoCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textPeriodoAcademico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textPeriodoAcademico.setForeground(new java.awt.Color(255, 255, 255));
        textPeriodoAcademico.setText("Período Académico");

        botonBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNombres.setForeground(new java.awt.Color(255, 255, 255));
        textNombres.setText("Nombres");

        campoNombres.setEditable(false);
        campoNombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textApellidos.setForeground(new java.awt.Color(255, 255, 255));
        textApellidos.setText("Apellidos");

        campoApellidos.setEditable(false);
        campoApellidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCarrera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCarrera.setForeground(new java.awt.Color(255, 255, 255));
        textCarrera.setText("Carrera");

        campoCarrera1.setEditable(false);
        campoCarrera1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        titulo2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("SELECCIONE ASIGNATURAS");

        textAsignatura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        textAsignatura.setText("Asignatura");

        campoAsignatura.setEnabled(false);
        campoAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAsignaturaActionPerformed(evt);
            }
        });

        textSecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textSecciones.setForeground(new java.awt.Color(255, 255, 255));
        textSecciones.setText("Sección");

        campoSecciones.setEnabled(false);

        botonAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregar.setText("AGREGAR");
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregar.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Semestre", "Sección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabla.setViewportView(jTable1);

        botonInscripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonInscripcion.setText("INSCRIBIR");
        botonInscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInscripcion.setEnabled(false);
        botonInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAsignatura)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCarrera)
                            .addComponent(textCedula)
                            .addComponent(textNombres))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(textSecciones)
                                        .addGap(26, 26, 26)
                                        .addComponent(campoSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textPeriodoAcademico)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoPeriodoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textApellidos)
                                        .addGap(88, 88, 88)
                                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(botonBuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonAgregar)
                                        .addGap(8, 8, 8))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(801, 801, 801)
                            .addComponent(botonInscripcion))))
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addGap(304, 304, 304))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPeriodoAcademico)
                    .addComponent(campoPeriodoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombres)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApellidos)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCarrera)
                    .addComponent(campoCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(titulo2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAsignatura)
                    .addComponent(campoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSecciones)
                    .addComponent(campoSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInscripcionActionPerformed

    private void campoAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAsignaturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscripcionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInscripcion;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JComboBox<String> campoAsignatura;
    private javax.swing.JTextField campoCarrera1;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JComboBox<String> campoPeriodoAcademico;
    private javax.swing.JComboBox<String> campoSecciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JLabel textApellidos;
    private javax.swing.JLabel textAsignatura;
    private javax.swing.JLabel textCarrera;
    private javax.swing.JLabel textCedula;
    private javax.swing.JLabel textNombres;
    private javax.swing.JLabel textPeriodoAcademico;
    private javax.swing.JLabel textSecciones;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
