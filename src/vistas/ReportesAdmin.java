// Norelvis Peraza // Joe Verde // Sophia Estrada // Juan Fonseca // Gloria Sánchez

package vistas;

public class ReportesAdmin extends javax.swing.JFrame {

    public ReportesAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResportes = new javax.swing.JPanel();
        tituloRep = new javax.swing.JLabel();
        textListSec = new javax.swing.JLabel();
        textListEst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");
        setResizable(false);

        bgResportes.setBackground(new java.awt.Color(41, 144, 159));

        tituloRep.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        tituloRep.setForeground(new java.awt.Color(255, 255, 255));
        tituloRep.setText("REPORTES");

        textListSec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textListSec.setForeground(new java.awt.Color(255, 255, 255));
        textListSec.setText("Listado Por Secciones");

        textListEst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textListEst.setForeground(new java.awt.Color(255, 255, 255));
        textListEst.setText("Listado Por Estudiantes");

        javax.swing.GroupLayout bgResportesLayout = new javax.swing.GroupLayout(bgResportes);
        bgResportes.setLayout(bgResportesLayout);
        bgResportesLayout.setHorizontalGroup(
            bgResportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgResportesLayout.createSequentialGroup()
                .addGroup(bgResportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgResportesLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(tituloRep))
                    .addGroup(bgResportesLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(textListSec)
                        .addGap(240, 240, 240)
                        .addComponent(textListEst)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        bgResportesLayout.setVerticalGroup(
            bgResportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgResportesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tituloRep)
                .addGap(30, 30, 30)
                .addGroup(bgResportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textListSec)
                    .addComponent(textListEst))
                .addContainerGap(584, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgResportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgResportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgResportes;
    private javax.swing.JLabel textListEst;
    private javax.swing.JLabel textListSec;
    private javax.swing.JLabel tituloRep;
    // End of variables declaration//GEN-END:variables
}
