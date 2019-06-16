/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCalculatorControllers;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Vafa
 */
public class TaxCalculatorController extends javax.swing.JFrame {

    /**
     * Creates new form TaxCalculatorController
     */
    public TaxCalculatorController() {
        initComponents();
        String nov[]={"Dövlət","Yerli (Bələdiyyə)"};
        addComboData(nov);
    }
    private void addComboData(String [] args){
        jComboBox.removeAllItems();
        for(String e: args){
            jComboBox.addItem(e);
        }
        jComboBox.setSelectedIndex(-1);
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
        jComboBox = new javax.swing.JComboBox<>();
        jLabel = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vergi Kalkulyatoru");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 253, 255));

        jComboBox.setBackground(new java.awt.Color(209, 230, 244));
        jComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel.setFont(new java.awt.Font("Nyala", 1, 24)); // NOI18N
        jLabel.setForeground(new java.awt.Color(145, 182, 206));
        jLabel.setText("Vergi növünü seçin:");

        NextButton.setBackground(new java.awt.Color(254, 253, 255));
        NextButton.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        NextButton.setForeground(new java.awt.Color(145, 182, 206));
        NextButton.setText("Növbəti");
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextButtonMouseClicked(evt);
            }
        });
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(NextButton))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel)
                .addGap(18, 18, 18)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(NextButton))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonActionPerformed

    private void NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseClicked
        int index=jComboBox.getSelectedIndex();
        switch(index){
            case 0:{
                TaxCalculatorController1 open=new TaxCalculatorController1();
                open.setVisible(true);
                this.setVisible(false); break;
            }
            case 1:{
                TaxCalculatorController3 open=new TaxCalculatorController3();
                open.setVisible(true);
                this.setVisible(false); break;
            }
            default : JOptionPane.showMessageDialog(null, "Siz hələ seçim etməmisiniz!");
        }
        
        /*else{
            Warning.setText("Xahis olunur, evvelce secim edesiniz!");
        }*/
    }//GEN-LAST:event_NextButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
//        TaxCalculatorController t=new TaxCalculatorController();
//        System.out.println(t.comboBox1SelectedItem());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                  UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaxCalculatorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxCalculatorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxCalculatorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxCalculatorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxCalculatorController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}