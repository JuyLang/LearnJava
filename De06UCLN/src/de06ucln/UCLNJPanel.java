/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06ucln;

import javax.swing.JOptionPane;

/**
 *
 * @author TrungCH
 */
public class UCLNJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UCLNJPanel
     */
    public UCLNJPanel() {
        initComponents();
        ucText.setEditable(false);
        kqText.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soAText = new javax.swing.JTextField();
        soBText = new javax.swing.JTextField();
        congButton = new javax.swing.JButton();
        truButton = new javax.swing.JButton();
        nhanButton = new javax.swing.JButton();
        chiaButton = new javax.swing.JButton();
        ucButton = new javax.swing.JButton();
        ucText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kqText = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(204, 0, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Phân Số");

        jLabel2.setText("Số A:");

        jLabel3.setText("Số B:");

        congButton.setText("Cộng");
        congButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congButtonActionPerformed(evt);
            }
        });

        truButton.setText("Trừ");
        truButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truButtonActionPerformed(evt);
            }
        });

        nhanButton.setText("Nhân");
        nhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanButtonActionPerformed(evt);
            }
        });

        chiaButton.setText("Chia");
        chiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaButtonActionPerformed(evt);
            }
        });

        ucButton.setText("UCLN");
        ucButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucButtonActionPerformed(evt);
            }
        });

        ucText.setBackground(new java.awt.Color(255, 255, 255));
        ucText.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Ket Qua:");

        kqText.setBackground(new java.awt.Color(255, 255, 255));
        kqText.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addComponent(ucButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soAText)
                            .addComponent(soBText, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(ucText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(congButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nhanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(truButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chiaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(kqText))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soAText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(congButton)
                    .addComponent(truButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhanButton)
                    .addComponent(chiaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ucButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ucText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(kqText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void congButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congButtonActionPerformed
        // TODO add your handling code here:
        boolean accept = false;
        if(soAText.getText().isEmpty() || soBText.getText().isEmpty()){
          thongBao("khong de trong thong tin");
        }else{
            float a = 0;
            float b = 0;
            try {
                a = Float.parseFloat(soAText.getText());
                b = Float.parseFloat(soBText.getText());
                accept = true;
            } catch (Exception e) {
                thongBao("Sai Format");
            }
           if(accept){
              kqText.setText(Float.toString(Number.tinhTong(a,b)));
              ucText.setText("");
           } 
        }
    }//GEN-LAST:event_congButtonActionPerformed

    private void truButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truButtonActionPerformed
        // TODO add your handling code here:
               boolean accept = false;
        if(soAText.getText().isEmpty() || soBText.getText().isEmpty()){
          thongBao("khong de trong thong tin");
        }else{
            float a = 0;
            float b = 0;
            try {
                a = Float.parseFloat(soAText.getText());
                b = Float.parseFloat(soBText.getText());
                accept = true;
            } catch (Exception e) {
                thongBao("Sai Format");
            }
           if(accept){
              kqText.setText(Float.toString(Number.tinhHieu(a,b)));
              ucText.setText("");
           } 
        }
    }//GEN-LAST:event_truButtonActionPerformed

    private void nhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanButtonActionPerformed
        // TODO add your handling code here:
               boolean accept = false;
        if(soAText.getText().isEmpty() || soBText.getText().isEmpty()){
          thongBao("khong de trong thong tin");
        }else{
            float a = 0;
            float b = 0;
            try {
                a = Float.parseFloat(soAText.getText());
                b = Float.parseFloat(soBText.getText());
                accept = true;
            } catch (Exception e) {
                thongBao("Sai Format");
            }
           if(accept){
              kqText.setText(Float.toString(Number.tinhTich(a,b)));
              ucText.setText("");
           } 
        }
    }//GEN-LAST:event_nhanButtonActionPerformed

    private void chiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaButtonActionPerformed
        // TODO add your handling code here:
        if(Float.parseFloat(soBText.getText())==0){
          thongBao("soB!=0");
        }else{
                 boolean accept = false;
        if(soAText.getText().isEmpty() || soBText.getText().isEmpty()){
          thongBao("khong de trong thong tin");
        }else{
            float a = 0;
            float b = 0;
            try {
                a = Float.parseFloat(soAText.getText());
                b = Float.parseFloat(soBText.getText());
                accept = true;
            } catch (Exception e) {
                thongBao("Sai Format");
            }
           if(accept){
              kqText.setText(Float.toString(Number.tinhThuong(a,b)));
              ucText.setText("");
           } 
        }
        }
    }//GEN-LAST:event_chiaButtonActionPerformed

    private void ucButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucButtonActionPerformed
        // TODO add your handling code here:
               boolean accept = false;
        if(soAText.getText().isEmpty() || soBText.getText().isEmpty()){
          thongBao("khong de trong thong tin");
        }else{
            float a = 0;
            float b = 0;
            try {
                a = Float.parseFloat(soAText.getText());
                b = Float.parseFloat(soBText.getText());
                accept = true;
            } catch (Exception e) {
                thongBao("Sai Format");
            }
           if(accept){
              ucText.setText(Float.toString(Number.timUCLN(a, b)));
              kqText.setText("");
           } 
        }
    }//GEN-LAST:event_ucButtonActionPerformed
public void thongBao(String a){
 JOptionPane.showMessageDialog(this, a);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chiaButton;
    private javax.swing.JButton congButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kqText;
    private javax.swing.JButton nhanButton;
    private javax.swing.JTextField soAText;
    private javax.swing.JTextField soBText;
    private javax.swing.JButton truButton;
    private javax.swing.JButton ucButton;
    private javax.swing.JTextField ucText;
    // End of variables declaration//GEN-END:variables
}