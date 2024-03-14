// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class EstudianteAdmin extends javax.swing.JFrame {

    public EstudianteAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstudiante = new javax.swing.JPanel();
        titulo1Est = new javax.swing.JLabel();
        textCedBusEst = new javax.swing.JLabel();
        campoCedBusEst = new javax.swing.JTextField();
        botonBuscarEst = new javax.swing.JButton();
        scrollEst = new javax.swing.JScrollPane();
        tablaEst = new javax.swing.JTable();
        bontonAtrasEst = new javax.swing.JButton();
        botonEliminarEst = new javax.swing.JButton();
        botonModificarEst = new javax.swing.JButton();
        botonGuardarEst = new javax.swing.JButton();
        titulo2Est = new javax.swing.JLabel();
        textCodAgrEst = new javax.swing.JLabel();
        campoCodAgrEst = new javax.swing.JTextField();
        textCedAgrEst = new javax.swing.JLabel();
        campoCedAgrEst = new javax.swing.JTextField();
        textNomAgrEst = new javax.swing.JLabel();
        campoNomAgrEst = new javax.swing.JTextField();
        textApeAgrEst = new javax.swing.JLabel();
        campoApeAgrEst = new javax.swing.JTextField();
        textDirAgrEst = new javax.swing.JLabel();
        campoDirAgrEst = new javax.swing.JTextField();
        textCorAgrEst = new javax.swing.JLabel();
        campoCorAgrEst = new javax.swing.JTextField();
        textTelAgrEst = new javax.swing.JLabel();
        campoTelAgrEst = new javax.swing.JTextField();
        textCarAgrEst = new javax.swing.JLabel();
        comboCarAgrEst = new javax.swing.JComboBox<>();
        textStaAgrEst = new javax.swing.JLabel();
        comboStaAgrEst = new javax.swing.JComboBox<>();
        botonAgregarEst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiante");
        setResizable(false);

        bgEstudiante.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Est.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Est.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Est.setText("BUSCAR ESTUDIANTE");

        textCedBusEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedBusEst.setForeground(new java.awt.Color(255, 255, 255));
        textCedBusEst.setText("Cédula");

        campoCedBusEst.setEditable(false);
        campoCedBusEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarEst.setText("BUSCAR");
        botonBuscarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Dirección", "Correo", "Teléfono", "Carrera", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollEst.setViewportView(tablaEst);

        bontonAtrasEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasEst.setText("ATRAS");
        bontonAtrasEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasEst.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasEst.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasEst.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasEstMouseClicked(evt);
            }
        });
        bontonAtrasEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasEstActionPerformed(evt);
            }
        });

        botonEliminarEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarEst.setText("ELIMINAR");
        botonEliminarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarEst.setEnabled(false);

        botonModificarEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarEst.setText("MODIFICAR");
        botonModificarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarEst.setEnabled(false);

        botonGuardarEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarEst.setText("GUARDAR");
        botonGuardarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarEst.setEnabled(false);

        titulo2Est.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Est.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Est.setText("AGREGAR ESTUDIANTE");

        textCodAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrEst.setText("Código");

        campoCodAgrEst.setEditable(false);
        campoCodAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCedAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textCedAgrEst.setText("Cédula");

        campoCedAgrEst.setEditable(false);
        campoCedAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrEst.setText("Nombre");

        campoNomAgrEst.setEditable(false);
        campoNomAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textApeAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textApeAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textApeAgrEst.setText("Apellido");

        campoApeAgrEst.setEditable(false);
        campoApeAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDirAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDirAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textDirAgrEst.setText("Dirección");

        campoDirAgrEst.setEditable(false);
        campoDirAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCorAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCorAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textCorAgrEst.setText("Correo");

        campoCorAgrEst.setEditable(false);
        campoCorAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textTelAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textTelAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textTelAgrEst.setText("Teléfono");

        campoTelAgrEst.setEditable(false);
        campoTelAgrEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCarAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCarAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textCarAgrEst.setText("Carrera");

        textStaAgrEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrEst.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrEst.setText("Estado");

        botonAgregarEst.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarEst.setText("AGREGAR");
        botonAgregarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgEstudianteLayout = new javax.swing.GroupLayout(bgEstudiante);
        bgEstudiante.setLayout(bgEstudianteLayout);
        bgEstudianteLayout.setHorizontalGroup(
            bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEstudianteLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgEstudianteLayout.createSequentialGroup()
                        .addComponent(textCedBusEst)
                        .addGap(28, 28, 28)
                        .addComponent(campoCedBusEst, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarEst)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgEstudianteLayout.createSequentialGroup()
                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollEst, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgEstudianteLayout.createSequentialGroup()
                                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgEstudianteLayout.createSequentialGroup()
                                        .addComponent(bontonAtrasEst, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonEliminarEst)
                                            .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textNomAgrEst)
                                                .addComponent(textCodAgrEst)))
                                        .addGap(138, 138, 138)
                                        .addComponent(titulo2Est)
                                        .addGap(136, 136, 136)
                                        .addComponent(botonModificarEst))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgEstudianteLayout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textDirAgrEst)
                                            .addComponent(textTelAgrEst)
                                            .addComponent(textStaAgrEst))
                                        .addGap(18, 18, 18)
                                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgEstudianteLayout.createSequentialGroup()
                                                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoCodAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoNomAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoDirAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoTelAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(72, 72, 72)
                                                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textCedAgrEst)
                                                    .addComponent(textApeAgrEst)
                                                    .addComponent(textCarAgrEst)
                                                    .addComponent(textCorAgrEst))
                                                .addGap(36, 36, 36)
                                                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoApeAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoCedAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoCorAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(botonAgregarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(comboCarAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(comboStaAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGuardarEst)))
                        .addGap(0, 46, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgEstudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1Est)
                .addGap(377, 377, 377))
        );
        bgEstudianteLayout.setVerticalGroup(
            bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEstudianteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo1Est)
                .addGap(34, 34, 34)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCedBusEst)
                    .addComponent(campoCedBusEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollEst, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgEstudianteLayout.createSequentialGroup()
                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bontonAtrasEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(bgEstudianteLayout.createSequentialGroup()
                        .addComponent(titulo2Est)
                        .addGap(27, 27, 27)
                        .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodAgrEst)
                            .addComponent(textCedAgrEst)
                            .addComponent(campoCedAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(4, 4, 4)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomAgrEst)
                    .addComponent(campoApeAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApeAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDirAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDirAgrEst)
                    .addComponent(campoCorAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCorAgrEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelAgrEst)
                    .addComponent(textCarAgrEst)
                    .addComponent(comboCarAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStaAgrEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStaAgrEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAgregarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasEstMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasEstMouseClicked

    private void bontonAtrasEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasEstActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgEstudiante;
    private javax.swing.JButton bontonAtrasEst;
    private javax.swing.JButton botonAgregarEst;
    private javax.swing.JButton botonBuscarEst;
    private javax.swing.JButton botonEliminarEst;
    private javax.swing.JButton botonGuardarEst;
    private javax.swing.JButton botonModificarEst;
    private javax.swing.JTextField campoApeAgrEst;
    private javax.swing.JTextField campoCedAgrEst;
    private javax.swing.JTextField campoCedBusEst;
    private javax.swing.JTextField campoCodAgrEst;
    private javax.swing.JTextField campoCorAgrEst;
    private javax.swing.JTextField campoDirAgrEst;
    private javax.swing.JTextField campoNomAgrEst;
    private javax.swing.JTextField campoTelAgrEst;
    private javax.swing.JComboBox<String> comboCarAgrEst;
    private javax.swing.JComboBox<String> comboStaAgrEst;
    private javax.swing.JScrollPane scrollEst;
    private javax.swing.JTable tablaEst;
    private javax.swing.JLabel textApeAgrEst;
    private javax.swing.JLabel textCarAgrEst;
    private javax.swing.JLabel textCedAgrEst;
    private javax.swing.JLabel textCedBusEst;
    private javax.swing.JLabel textCodAgrEst;
    private javax.swing.JLabel textCorAgrEst;
    private javax.swing.JLabel textDirAgrEst;
    private javax.swing.JLabel textNomAgrEst;
    private javax.swing.JLabel textStaAgrEst;
    private javax.swing.JLabel textTelAgrEst;
    private javax.swing.JLabel titulo1Est;
    private javax.swing.JLabel titulo2Est;
    // End of variables declaration//GEN-END:variables
}
