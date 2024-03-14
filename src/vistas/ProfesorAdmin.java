// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class ProfesorAdmin extends javax.swing.JFrame {

    public ProfesorAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstudiante2 = new javax.swing.JPanel();
        titulo1Prof = new javax.swing.JLabel();
        textCedBusProf = new javax.swing.JLabel();
        campoCedBusProf = new javax.swing.JTextField();
        botonBuscarProf = new javax.swing.JButton();
        scrollProf = new javax.swing.JScrollPane();
        tablaProf = new javax.swing.JTable();
        bontonAtrasProf = new javax.swing.JButton();
        botonEliminarProf = new javax.swing.JButton();
        botonModificarProf = new javax.swing.JButton();
        botonGuardarProf = new javax.swing.JButton();
        titulo2Prof = new javax.swing.JLabel();
        textCodAgrProf = new javax.swing.JLabel();
        campoCodAgrProf = new javax.swing.JTextField();
        textCedAgrProf = new javax.swing.JLabel();
        campoCedAgrProf = new javax.swing.JTextField();
        textNomAgrProf = new javax.swing.JLabel();
        campoNomAgrProf = new javax.swing.JTextField();
        textApeAgrProf = new javax.swing.JLabel();
        campoApeAgrProf = new javax.swing.JTextField();
        textDirAgrProf = new javax.swing.JLabel();
        campoDirAgrProf = new javax.swing.JTextField();
        textCorAgrProf = new javax.swing.JLabel();
        campoCorAgrProf = new javax.swing.JTextField();
        textTelAgrProf = new javax.swing.JLabel();
        campoTelAgrProf = new javax.swing.JTextField();
        textEspAgrProf = new javax.swing.JLabel();
        campoEspAgrProf = new javax.swing.JTextField();
        textUsuAgrProf = new javax.swing.JLabel();
        comboUsuAgrProf = new javax.swing.JComboBox<>();
        textStaAgrProf = new javax.swing.JLabel();
        comboStaAgrProf = new javax.swing.JComboBox<>();
        botonAgregarProf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profesor");
        setResizable(false);

        bgEstudiante2.setBackground(new java.awt.Color(41, 144, 159));

        titulo1Prof.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo1Prof.setForeground(new java.awt.Color(255, 255, 255));
        titulo1Prof.setText("BUSCAR PROFESOR");

        textCedBusProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedBusProf.setForeground(new java.awt.Color(255, 255, 255));
        textCedBusProf.setText("Cédula");

        campoCedBusProf.setEditable(false);
        campoCedBusProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonBuscarProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBuscarProf.setText("BUSCAR");
        botonBuscarProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablaProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Dirección", "Correo", "Teléfono", "Especialidad", "Usuario", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollProf.setViewportView(tablaProf);

        bontonAtrasProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bontonAtrasProf.setText("ATRAS");
        bontonAtrasProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bontonAtrasProf.setMaximumSize(new java.awt.Dimension(93, 21));
        bontonAtrasProf.setMinimumSize(new java.awt.Dimension(93, 21));
        bontonAtrasProf.setPreferredSize(new java.awt.Dimension(82, 31));
        bontonAtrasProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bontonAtrasProfMouseClicked(evt);
            }
        });
        bontonAtrasProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonAtrasProfActionPerformed(evt);
            }
        });

        botonEliminarProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarProf.setText("ELIMINAR");
        botonEliminarProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarProf.setEnabled(false);

        botonModificarProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarProf.setText("MODIFICAR");
        botonModificarProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarProf.setEnabled(false);

        botonGuardarProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonGuardarProf.setText("GUARDAR");
        botonGuardarProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarProf.setEnabled(false);

        titulo2Prof.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        titulo2Prof.setForeground(new java.awt.Color(255, 255, 255));
        titulo2Prof.setText("AGREGAR PROFESOR");

        textCodAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCodAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textCodAgrProf.setText("Código");

        campoCodAgrProf.setEditable(false);
        campoCodAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCedAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCedAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textCedAgrProf.setText("Cédula");

        campoCedAgrProf.setEditable(false);
        campoCedAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textNomAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textNomAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textNomAgrProf.setText("Nombre");

        campoNomAgrProf.setEditable(false);
        campoNomAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textApeAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textApeAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textApeAgrProf.setText("Apellido");

        campoApeAgrProf.setEditable(false);
        campoApeAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textDirAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textDirAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textDirAgrProf.setText("Dirección");

        campoDirAgrProf.setEditable(false);
        campoDirAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textCorAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textCorAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textCorAgrProf.setText("Correo");

        campoCorAgrProf.setEditable(false);
        campoCorAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textTelAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textTelAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textTelAgrProf.setText("Teléfono");

        campoTelAgrProf.setEditable(false);
        campoTelAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textEspAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textEspAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textEspAgrProf.setText("Especialidad");

        campoEspAgrProf.setEditable(false);
        campoEspAgrProf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textUsuAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textUsuAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textUsuAgrProf.setText("Estado");

        textStaAgrProf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textStaAgrProf.setForeground(new java.awt.Color(255, 255, 255));
        textStaAgrProf.setText("Carrera");

        botonAgregarProf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAgregarProf.setText("AGREGAR");
        botonAgregarProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgEstudiante2Layout = new javax.swing.GroupLayout(bgEstudiante2);
        bgEstudiante2.setLayout(bgEstudiante2Layout);
        bgEstudiante2Layout.setHorizontalGroup(
            bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEstudiante2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgEstudiante2Layout.createSequentialGroup()
                        .addComponent(textCedBusProf)
                        .addGap(28, 28, 28)
                        .addComponent(campoCedBusProf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarProf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgEstudiante2Layout.createSequentialGroup()
                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollProf, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgEstudiante2Layout.createSequentialGroup()
                                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgEstudiante2Layout.createSequentialGroup()
                                        .addComponent(bontonAtrasProf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonEliminarProf)
                                            .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textNomAgrProf)
                                                .addComponent(textCodAgrProf)))
                                        .addGap(160, 160, 160)
                                        .addComponent(titulo2Prof)
                                        .addGap(114, 114, 114)
                                        .addComponent(botonModificarProf))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgEstudiante2Layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textDirAgrProf)
                                            .addComponent(textTelAgrProf)
                                            .addComponent(textUsuAgrProf))
                                        .addGap(18, 18, 18)
                                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoCodAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoNomAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoDirAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTelAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboUsuAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(72, 72, 72)
                                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(bgEstudiante2Layout.createSequentialGroup()
                                                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textCedAgrProf)
                                                    .addComponent(textApeAgrProf)
                                                    .addComponent(textEspAgrProf)
                                                    .addComponent(textCorAgrProf))
                                                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(bgEstudiante2Layout.createSequentialGroup()
                                                        .addGap(36, 36, 36)
                                                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(campoApeAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(campoCedAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(campoCorAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgEstudiante2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(campoEspAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(bgEstudiante2Layout.createSequentialGroup()
                                                .addComponent(textStaAgrProf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboStaAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonGuardarProf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonAgregarProf, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 48, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgEstudiante2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1Prof)
                .addGap(390, 390, 390))
        );
        bgEstudiante2Layout.setVerticalGroup(
            bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEstudiante2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titulo1Prof)
                .addGap(33, 33, 33)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCedBusProf)
                    .addComponent(campoCedBusProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollProf, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgEstudiante2Layout.createSequentialGroup()
                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bontonAtrasProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(bgEstudiante2Layout.createSequentialGroup()
                        .addComponent(titulo2Prof)
                        .addGap(18, 18, 18)
                        .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodAgrProf)
                            .addComponent(textCedAgrProf)
                            .addComponent(campoCedAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(4, 4, 4)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNomAgrProf)
                    .addComponent(campoApeAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApeAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDirAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDirAgrProf)
                    .addComponent(campoCorAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCorAgrProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelAgrProf)
                    .addComponent(textEspAgrProf)
                    .addComponent(campoEspAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgEstudiante2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUsuAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsuAgrProf)
                    .addComponent(textStaAgrProf)
                    .addComponent(comboStaAgrProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgEstudiante2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgEstudiante2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontonAtrasProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bontonAtrasProfMouseClicked
        //Abrir ventana
        DashboardAdministrador frm = new DashboardAdministrador();
        frm.setVisible(true);
        //Cerrar ventana anterior
        this.dispose();
    }//GEN-LAST:event_bontonAtrasProfMouseClicked

    private void bontonAtrasProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonAtrasProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bontonAtrasProfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesorAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgEstudiante;
    private javax.swing.JPanel bgEstudiante1;
    private javax.swing.JPanel bgEstudiante2;
    private javax.swing.JButton bontonAtrasEst;
    private javax.swing.JButton bontonAtrasEst1;
    private javax.swing.JButton bontonAtrasProf;
    private javax.swing.JButton botonAgregarProf;
    private javax.swing.JButton botonBuscarEst;
    private javax.swing.JButton botonBuscarEst1;
    private javax.swing.JButton botonBuscarProf;
    private javax.swing.JButton botonEliminarProf;
    private javax.swing.JButton botonGuardarProf;
    private javax.swing.JButton botonModificarProf;
    private javax.swing.JTextField campoApeAgrProf;
    private javax.swing.JTextField campoCedAgrProf;
    private javax.swing.JTextField campoCedBusEst;
    private javax.swing.JTextField campoCedBusEst1;
    private javax.swing.JTextField campoCedBusProf;
    private javax.swing.JTextField campoCodAgrProf;
    private javax.swing.JTextField campoCorAgrProf;
    private javax.swing.JTextField campoDirAgrProf;
    private javax.swing.JTextField campoEspAgrProf;
    private javax.swing.JTextField campoNomAgrProf;
    private javax.swing.JTextField campoTelAgrProf;
    private javax.swing.JComboBox<String> comboStaAgrProf;
    private javax.swing.JComboBox<String> comboUsuAgrProf;
    private javax.swing.JScrollPane scrollEst;
    private javax.swing.JScrollPane scrollEst1;
    private javax.swing.JScrollPane scrollProf;
    private javax.swing.JTable tablaEst;
    private javax.swing.JTable tablaEst1;
    private javax.swing.JTable tablaProf;
    private javax.swing.JLabel textApeAgrProf;
    private javax.swing.JLabel textCedAgrProf;
    private javax.swing.JLabel textCedBusEst;
    private javax.swing.JLabel textCedBusEst1;
    private javax.swing.JLabel textCedBusProf;
    private javax.swing.JLabel textCodAgrProf;
    private javax.swing.JLabel textCorAgrProf;
    private javax.swing.JLabel textDirAgrProf;
    private javax.swing.JLabel textEspAgrProf;
    private javax.swing.JLabel textNomAgrProf;
    private javax.swing.JLabel textStaAgrProf;
    private javax.swing.JLabel textTelAgrProf;
    private javax.swing.JLabel textUsuAgrProf;
    private javax.swing.JLabel titulo1Est;
    private javax.swing.JLabel titulo1Est1;
    private javax.swing.JLabel titulo1Prof;
    private javax.swing.JLabel titulo2Prof;
    // End of variables declaration//GEN-END:variables
}
