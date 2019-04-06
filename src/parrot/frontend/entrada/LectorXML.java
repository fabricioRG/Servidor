package parrot.frontend.entrada;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import parrot.backend.manejadores.ManejadorLectorXML;

/**
 *
 * @author fabricio
 */
public class LectorXML extends javax.swing.JFrame {

    /**
     * Creates new form LectorXML
     */
    
    public LectorXML() {
        ManejadorLectorXML.getInstance().setLectorXML(this);
        initComponents();
        this.setTitle("Parrot");
        this.setLocationRelativeTo(this);
        this.erroresPane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xmlText = new javax.swing.JTextPane();
        procesarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        erroresPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jErroresPane = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(xmlText);

        procesarButton.setBackground(new java.awt.Color(2, 176, 14));
        procesarButton.setForeground(new java.awt.Color(254, 254, 254));
        procesarButton.setText("Procesar");
        procesarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(225, 2, 6));
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(procesarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(procesarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jErroresPane.setEditable(false);
        jErroresPane.setBackground(new java.awt.Color(254, 254, 254));
        jErroresPane.setForeground(new java.awt.Color(255, 6, 0));
        jErroresPane.setCaretColor(new java.awt.Color(1, 1, 1));
        jScrollPane2.setViewportView(jErroresPane);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 7, 1));
        jLabel1.setText("Errores:");

        javax.swing.GroupLayout erroresPaneLayout = new javax.swing.GroupLayout(erroresPane);
        erroresPane.setLayout(erroresPaneLayout);
        erroresPaneLayout.setHorizontalGroup(
            erroresPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erroresPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(erroresPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(erroresPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        erroresPaneLayout.setVerticalGroup(
            erroresPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, erroresPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(erroresPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(erroresPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarButtonActionPerformed
        ManejadorLectorXML.getInstance().procesarTexto(this.xmlText.getText().trim());
        
    }//GEN-LAST:event_procesarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        xmlText.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    public JTextPane getjErroresPane() {
        return jErroresPane;
    }

    public void setjErroresPane(JTextPane jErroresPane) {
        this.jErroresPane = jErroresPane;
    }

    public JPanel getErroresPane() {
        return erroresPane;
    }

    public void setErroresPane(JPanel erroresPane) {
        this.erroresPane = erroresPane;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel erroresPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextPane jErroresPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton procesarButton;
    private javax.swing.JTextPane xmlText;
    // End of variables declaration//GEN-END:variables
}
