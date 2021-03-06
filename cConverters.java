/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cConvert;
import java.lang.String;
/**
 *
 * @author 李建宏
 */
public class cConverters extends javax.swing.JFrame {
    
    double  USA_USD = 0.0322, Europe_EUR = 0.028, UK_GBP = 0.0251, Japan_JPY = 3.5398, Switerland_FR = 0.0316, China_CNY = 0.2204,  
            Canada_CAD = 0.0434, Australia_AUD  = 0.0453, Korea_KRW =  33.67, Tailand_THB = 0.9875, Indonesia_IDR = 403.2258,
            Singapore_SGD = 0.0438, Philippines_PHP = 1.5537;
    /**
     * Creates new form cConverters
     */
    public cConverters() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jlblConvert = new javax.swing.JLabel();
        jtxtConvert = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnConvert = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("標楷體", 0, 60)); // NOI18N
        jLabel1.setText("匯率轉換器");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jcmbCurrency.setFont(new java.awt.Font("標楷體", 1, 36)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "請選擇國家...", "美國(USA)", "歐洲(Euro)", "日本(Japan)", "英國(UK)", "瑞士(Switzerland)", "中國(China)", "加拿大(Canada)", "澳洲(Australia)", "韓國(Korea)", "泰國(Tailand)", "印尼(Indonesia)", "新加坡(Singapore)", "菲律賓(Philippines)" }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jlblConvert.setFont(new java.awt.Font("標楷體", 1, 48)); // NOI18N
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jtxtConvert.setFont(new java.awt.Font("標楷體", 1, 48)); // NOI18N
        jtxtConvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConvertActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("標楷體", 1, 48)); // NOI18N
        jbtnReset.setText("重設");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnConvert.setFont(new java.awt.Font("標楷體", 1, 48)); // NOI18N
        jbtnConvert.setText("換算");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("標楷體", 1, 48)); // NOI18N
        jbtnExit.setText("離開");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnConvert)
                        .addGap(86, 86, 86)
                        .addComponent(jbtnReset)
                        .addGap(89, 89, 89)
                        .addComponent(jbtnExit)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnConvert)
                    .addComponent(jbtnExit)
                    .addComponent(jbtnReset))
                .addGap(200, 200, 200))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtConvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtConvertActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        jcmbCurrency.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
        double Taiwan_NTD = Double.parseDouble(jtxtConvert.getText());
       
        if(jcmbCurrency.getSelectedItem().equals("美國(USA)"))
        {
            String cConvert1 = String.format("USD %.2f", Taiwan_NTD * USA_USD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("歐洲(Euro)"))
        {
            String cConvert1 = String.format("EUR %.2f", Taiwan_NTD * Europe_EUR);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("日本(Japan)"))
        {
            String cConvert1 = String.format("JPY %.2f", Taiwan_NTD * Japan_JPY);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("英國(UK)"))
        {
            String cConvert1 = String.format("GBP %.2f", Taiwan_NTD * UK_GBP);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("瑞士(Switzerland)"))
        {
            String cConvert1 = String.format("FR %.2f", Taiwan_NTD * Switerland_FR);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("中國(China)"))
        {
            String cConvert1 = String.format("CNY %.2f", Taiwan_NTD * China_CNY);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("加拿大(Canada)"))
        {
            String cConvert1 = String.format("CAD %.2f", Taiwan_NTD * Canada_CAD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("澳洲(Australia)"))
        {
            String cConvert1 = String.format("AUD %.2f", Taiwan_NTD * Australia_AUD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("韓國(Korea)"))
        {
            String cConvert1 = String.format("KRW %.2f", Taiwan_NTD * Korea_KRW);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("泰國(Tailand)"))
        {
            String cConvert1 = String.format("THB %.2f", Taiwan_NTD * Tailand_THB);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("印尼(Indonesia)"))
        {
            String cConvert1 = String.format("IDR %.2f", Taiwan_NTD * Indonesia_IDR);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("新加坡(Singapore)"))
        {
            String cConvert1 = String.format("SGD %.2f", Taiwan_NTD * Singapore_SGD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("菲律賓(Philippines)"))
        {
            String cConvert1 = String.format("PHP %.2f", Taiwan_NTD * Philippines_PHP);
            jlblConvert.setText(cConvert1);
        }
    }//GEN-LAST:event_jbtnConvertActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

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
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtxtConvert;
    // End of variables declaration//GEN-END:variables
}
