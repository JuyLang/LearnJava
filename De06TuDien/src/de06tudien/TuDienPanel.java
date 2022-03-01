/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06tudien;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TrungCH
 */
public class TuDienPanel extends javax.swing.JPanel {
DefaultTableModel model;
    /**
     * Creates new form TuDienPanel
     */
    public TuDienPanel() {
        initComponents();
        vnText.setEditable(false);
        themButton.setVisible(false);
        model = (DefaultTableModel)table.getModel();
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
        enText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vnText = new javax.swing.JTextField();
        timButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        themButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("EN~VN");

        jLabel2.setText("EN: ");

        jLabel3.setText("VN:");

        vnText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnTextActionPerformed(evt);
            }
        });

        timButton.setText("Tim");
        timButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        themButton.setText("Them");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EN", "VN"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(timButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(vnText))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enText, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(enText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timButton)
                            .addComponent(themButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vnTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnTextActionPerformed

    private void timButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timButtonActionPerformed
        // TODO add your handling code here:
        themButton.setVisible(false);
        if(d.timKiem(enText.getText()).equals("")){
           thongBao();
        }else{
          vnText.setText(d.timKiem(enText.getText()));
        }
    }//GEN-LAST:event_timButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed

        d.danhSachTu.add(new Word(d.danhSachTu.size(), enText.getText(), vnText.getText()));
        vnText.setText("");
        thongBao1("Them Thanh Cong");
        themButton.setVisible(false);
        vnText.setEditable(false);
        Word w = d.danhSachTu.get(d.danhSachTu.size() - 1);
        model.addRow(new Object[]{w.getEn(), w.getVn()});

        
    }//GEN-LAST:event_themButtonActionPerformed
public void thongBao(){
  int luaChon = JOptionPane.showConfirmDialog(this,"Ban Muon Them Tu","Khong Co Tu Ban Nhap",JOptionPane.YES_NO_OPTION);
  if(luaChon == JOptionPane.YES_OPTION){
      vnText.setEditable(true);
     themButton.setVisible(true);
  }else if(luaChon==  JOptionPane.NO_OPTION){
   themButton.setVisible(false);
  }
}
public void thongBao1(String a){
  JOptionPane.showMessageDialog(this, a);
}
public void thongBao2(){
  int luaChon = JOptionPane.showConfirmDialog(this,"Ban Co Muon Hien Thi Mac Dinh Khong","Ban Chon",JOptionPane.YES_NO_OPTION);
  if(luaChon == JOptionPane.YES_OPTION){
      for(int i = 0;i<d.danhSachTu.size();i++){
               Word w = d.danhSachTu.get(i);
               model.addRow(new Object []{w.getEn(),w.getVn()});
           }
  }else if(luaChon==  JOptionPane.NO_OPTION){
    themButton.setVisible(false);
  }
}
private Dictionary d = new Dictionary(Dictionary.TU_KHOI_TAO);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton themButton;
    private javax.swing.JButton timButton;
    private javax.swing.JTextField vnText;
    // End of variables declaration//GEN-END:variables
}