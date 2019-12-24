
package com.simpleway.calificacionfinal.frontEnd;

import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

   double sumaObtenerNota = 0;
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        btnReiniciar.setEnabled(false);
        txtSuma.setEditable(false);
        txtSupletorio.setEnabled(false);
        btnObtenerNotaFinal.setEnabled(false);
        txtNotaFinal.setEditable(false);
    }
    
    private double calcularSupletorio(double notaTotal, double notaSupletorio){
        return notaTotal + notaSupletorio;
    }
    private double validarSupletorio(){
        String notaSupletorio = txtSupletorio.getText();
        double notaTotalSupletorio = 0;
        if(!notaSupletorio.isEmpty()){
            double notaSupletorioNumerico = Double.parseDouble(notaSupletorio);
            if(notaSupletorioNumerico >=0 && notaSupletorioNumerico <=20){
                double notaTotalBimestres = Double.parseDouble(txtSuma.getText());
                notaTotalSupletorio = calcularSupletorio(notaTotalBimestres, notaSupletorioNumerico);  
                txtNotaFinal.setText(""+notaTotalSupletorio);
                if(notaTotalSupletorio >= 24){        
                    lblMensaje.setText("Aprobado");
                }else{
                    lblMensaje.setText("Reprobado");
                }
            }else{
               JOptionPane.showMessageDialog(this, "La nota supletorio debe estar entre 0 y 20"); 
            }
        }else{
            JOptionPane.showMessageDialog(this, "El campo supleotiro est vacio");
        }
        return notaTotalSupletorio;
    }
    
    private String aprobado(double totalNotas){
        String mensaje = "";
        if(totalNotas>=14){
            double notaFinal = totalNotas*2;
            mensaje="Exonerado";
            txtNotaFinal.setText(""+notaFinal);    
        }else{  
            txtSuma.setText(""+totalNotas);
            habilitarCamposSupletorio();
            validarSupletorio();
        }
        return  mensaje;
    }
    
    private void habilitarCamposSupletorio(){
        txtSupletorio.setEnabled(true);
        btnObtenerNotaFinal.setEnabled(true);
        btnObtenerNota.setEnabled(false);
    }
    
    private void deshabilitarCamposNotas(){
        txtBimestre1.setEnabled(false);
        txtBimestre2.setEnabled(false);
        btnReiniciar.setEnabled(true);
    }
    
    private void reiniciar(){
        txtBimestre1.setText("0");
        txtBimestre2.setText("0");
        txtBimestre1.setEnabled(true);
        txtBimestre2.setEnabled(true);
        btnObtenerNota.setEnabled(true);
        txtSuma.setText("0");
        txtSupletorio.setText("0");
        txtNotaFinal.setText("0");
        btnObtenerNotaFinal.setEnabled(false);
        btnReiniciar.setEnabled(false);
        txtSupletorio.setEnabled(false);
    }
    private double obtenerNotal(){
        String notaB1 = txtBimestre1.getText();
        String notaB2 = txtBimestre2.getText();
        
        if(!notaB1.isEmpty() && !notaB2.isEmpty()){
            double notaBimestre1 = Double.parseDouble(notaB1);
            double notaBimestre2 = Double.parseDouble(notaB2);
            if((notaBimestre1 >= 0 && notaBimestre1 <=10 ) && (notaBimestre2 >=0 && notaBimestre2 <= 10)){
                sumaObtenerNota = notaBimestre1 + notaBimestre2;
                deshabilitarCamposNotas();
                lblMensaje.setText(aprobado(sumaObtenerNota));
            }else{
                JOptionPane.showMessageDialog(null, "LAS NOTAS DEBEN ESTAR ENTRE 0-10");
            }
        }else{
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }
        return sumaObtenerNota;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblBimestre1 = new javax.swing.JLabel();
        lblBimestre2 = new javax.swing.JLabel();
        txtBimestre1 = new javax.swing.JTextField();
        txtBimestre2 = new javax.swing.JTextField();
        btnObtenerNota = new javax.swing.JButton();
        lblSuma = new javax.swing.JLabel();
        txtSuma = new javax.swing.JTextField();
        btnObtenerNotaFinal = new javax.swing.JButton();
        lblSupletorio = new javax.swing.JLabel();
        txtSupletorio = new javax.swing.JTextField();
        lblNotaFinal = new javax.swing.JLabel();
        txtNotaFinal = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setText("Registro de Notas");

        lblBimestre1.setText("Bimestre 1");

        lblBimestre2.setText("Bimestre 2");

        txtBimestre1.setText("0");

        txtBimestre2.setText("0");

        btnObtenerNota.setText("Obtener nota");
        btnObtenerNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerNotaActionPerformed(evt);
            }
        });

        lblSuma.setText("Suma :");

        txtSuma.setText("0");

        btnObtenerNotaFinal.setText("Obtener nota Final");
        btnObtenerNotaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerNotaFinalActionPerformed(evt);
            }
        });

        lblSupletorio.setText("Supletorio");

        txtSupletorio.setText("0");

        lblNotaFinal.setText("Nota Final:");

        txtNotaFinal.setText("0");

        lblMensaje.setText("jLabel7");

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBimestre2)
                            .addComponent(lblBimestre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnObtenerNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBimestre2)
                                    .addComponent(txtBimestre1))))
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObtenerNotaFinal)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnReiniciar))
                            .addComponent(lblSupletorio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNotaFinal)
                                .addGap(30, 30, 30)
                                .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblSuma)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSupletorio, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txtSuma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBimestre1)
                    .addComponent(txtBimestre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBimestre2)
                    .addComponent(txtBimestre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnObtenerNota)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuma)
                    .addComponent(txtSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupletorio)
                    .addComponent(txtSupletorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObtenerNotaFinal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotaFinal)
                    .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerNotaActionPerformed
        // TODO add your handling code here:
        txtSuma.setText(""+obtenerNotal()); 
    }//GEN-LAST:event_btnObtenerNotaActionPerformed

    private void btnObtenerNotaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerNotaFinalActionPerformed
        // TODO add your handling code here:
        aprobado(sumaObtenerNota);
    }//GEN-LAST:event_btnObtenerNotaFinalActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerNota;
    private javax.swing.JButton btnObtenerNotaFinal;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBimestre1;
    private javax.swing.JLabel lblBimestre2;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNotaFinal;
    private javax.swing.JLabel lblSuma;
    private javax.swing.JLabel lblSupletorio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBimestre1;
    private javax.swing.JTextField txtBimestre2;
    private javax.swing.JTextField txtNotaFinal;
    private javax.swing.JTextField txtSuma;
    private javax.swing.JTextField txtSupletorio;
    // End of variables declaration//GEN-END:variables
}
