/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCalculatorControllers;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Vafa
 */
public class AksizlerController extends javax.swing.JFrame {

    /**
     * Creates new form AksizlerController
     */
    public AksizlerController() {
        initComponents();
        jLabel6.setVisible(false);
        String nov[]={"MDB ölkələrinin istehsalı olmayan aksizli malların və aksiz tətbiq edilən minik avtomobilləri",
        "Neft məhsulları"};
        addCombo1Data(nov);
    }

    private void addCombo1Data(String [] args){
        jComboBox1.removeAllItems();
        for(String e: args){
            jComboBox1.addItem(e);
        }
        jComboBox1.setSelectedIndex(-1);
    }
    private void addCombo2Data(List<String> args){
        jComboBox2.removeAllItems();
        for(String e: args){
            jComboBox2.addItem(e);
        }
        jComboBox2.setSelectedIndex(-1);
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 253, 255));

        jLabel1.setBackground(new java.awt.Color(254, 253, 255));
        jLabel1.setFont(new java.awt.Font("Nyala", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(145, 182, 206));
        jLabel1.setText("Aksizli malı seçin:");

        jComboBox1.setBackground(new java.awt.Color(209, 230, 244));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(145, 182, 206));
        jLabel2.setText("Məhsulunun növünü seçin : ");

        jComboBox2.setBackground(new java.awt.Color(209, 230, 244));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(145, 182, 206));
        jLabel3.setText("Gömrük dəyərini daxil edin :");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(145, 182, 206));
        jLabel4.setText("Gecikmə gününün sayını daxil edin :");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nyala", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(145, 182, 206));
        jLabel5.setText("Diqqət! Bura verginin alınma günü də daxildir.");

        jButton1.setBackground(new java.awt.Color(254, 253, 255));
        jButton1.setFont(new java.awt.Font("Nyala", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(145, 182, 206));
        jButton1.setText("Hesablayın");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(145, 182, 206));
        jLabel6.setText("Tutulacaq vergi miqdarı :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(145, 182, 206));

        jButton2.setBackground(new java.awt.Color(254, 253, 255));
        jButton2.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(145, 182, 206));
        jButton2.setText("Geri");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jComboBox2, 0, 240, Short.MAX_VALUE)
                                .addComponent(jTextField1))
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Integer index=jComboBox1.getSelectedIndex();
        List<String> nov2=new ArrayList();
        switch(index){
            case 0:{
               nov2.add("istehsal buraxılış tarixindən bir ilə qədər keçmiş minik avtomobilləri");
               nov2.add("Araq");
               nov2.add("İçməli spirt");
               nov2.add("Konyak");
               nov2.add("Şampan şərabı");
               nov2.add("Digər bütün növ şərablar");
               nov2.add("Tündləşdirilmiş içki");
               nov2.add("Likor");
               nov2.add("Pivə");
               nov2.add("Bütün növ tütün məmulatları");break;
            }
            case 1:{
               nov2.add("Təyyarə benzini V-91/115");
               nov2.add("Avtomobil benzini Aİ-95, Aİ-98");
               nov2.add("Avtomobil benzini Aİ-92, Aİ-93");
               nov2.add("Avtomobil benzini A-72, A-76");
               nov2.add("Reaktiv mühərrik yanacığı");
               nov2.add("Dizel yanacağı");
               nov2.add("Ağ neft");break;
            }
            default: nov2.add("Əvvəlcə yuxarıda seçim edin");
        }
        addCombo2Data(nov2);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String d=jTextField1.getText().trim();
        String g=jTextField2.getText().trim();
        Integer index=jComboBox1.getSelectedIndex();
        Integer index2=jComboBox2.getSelectedIndex();
        try {
            Double deyer=Double.parseDouble(jTextField1.getText());
            Double gun=Double.parseDouble(jTextField2.getText());
            Double vergi=null;
            switch(index){
                case 0:{
                    double derece[]={15,65,90,65,45,40,40,65,40,50};
                    if(gun==0) vergi=(deyer*derece[index2])/100;
                    else vergi=(deyer*derece[index2])/100+deyer*gun*0.003; break;
                }
                case 1:{
                    double derece[]={65.49,65.03,65.23,64.76,39.46,29.83,33.45};
                    if(gun==0) vergi=(deyer*derece[index2])/100;
                    else vergi=(deyer*derece[index2])/100+deyer*gun*0.003; break;
                }
            }
            jLabel6.setVisible(true);
            jLabel7.setText(String.format("%.2f", vergi)+" AZN");
        } catch (Exception e) {
            if(d.isEmpty() || g.isEmpty()) JOptionPane.showMessageDialog(null, "Xanaları doldurmamısınız!");
            else JOptionPane.showMessageDialog(null, "Xanaları rəqəmlə doldurun!");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String d=jTextField1.getText().trim();
        String g=jTextField2.getText().trim();
        Integer index=jComboBox1.getSelectedIndex();
        Integer index2=jComboBox2.getSelectedIndex();
        try {
            Double deyer=Double.parseDouble(jTextField1.getText());
            Double gun=Double.parseDouble(jTextField2.getText());
            Double vergi=null;
            switch(index){
                case 0:{
                    double derece[]={15,65,90,65,45,40,40,65,40,50};
                    if(gun==0) vergi=(deyer*derece[index2])/100;
                    else vergi=(deyer*derece[index2])/100+deyer*gun*0.003; break;
                }
                case 1:{
                    double derece[]={65.49,65.03,65.23,64.76,39.46,29.83,33.45};
                    if(gun==0) vergi=(deyer*derece[index2])/100;
                    else vergi=(deyer*derece[index2])/100+deyer*gun*0.003; break;
                }
            }
            jLabel6.setVisible(true);
            jLabel7.setText(String.format("%.2f", vergi)+" AZN");
        } catch (Exception e) {
            if(d.isEmpty() || g.isEmpty()) JOptionPane.showMessageDialog(null, "Xanaları doldurmamısınız!");
            else JOptionPane.showMessageDialog(null, "Xanaları rəqəmlə doldurun!");
        }
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        TaxCalculatorController1 open=new TaxCalculatorController1();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked
    
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AksizlerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AksizlerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AksizlerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AksizlerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AksizlerController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
