/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01kocolithuyet;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Duy
 */
public class QLSVJPane extends javax.swing.JPanel {

    /**
     * Creates new form QLSVJPane
     */
    public QLSVJPane() {
        initComponents();
    }
 private ArrayList<Student> danhSachSV = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tenText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        maSVText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nsText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gtBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        diaChiaText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        diemText = new javax.swing.JTextField();
        themButton = new javax.swing.JButton();
        luuButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        jLabel1.setText("HoTen:");

        tenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenTextActionPerformed(evt);
            }
        });

        jLabel2.setText("MaSV:");

        jLabel3.setText("NgaySinh:");

        jLabel4.setText("GioiTinh:");

        gtBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));
        gtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("DiaChi:");

        jLabel6.setText("Email:");

        jLabel7.setText("DiemTB:");

        themButton.setText("Them");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        luuButton.setText("Luu");
        luuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themButton)
                        .addGap(33, 33, 33)
                        .addComponent(luuButton)
                        .addGap(39, 39, 39)
                        .addComponent(resetButton)
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenText, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maSVText)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nsText)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaChiaText)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diemText))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maSVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaChiaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton)
                    .addComponent(luuButton)
                    .addComponent(resetButton))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        boolean accept = false;
        String ma = maSVText.getText();
        String email = emailText.getText();
        String ten = tenText.getText();
        float dtb = 0;
        int ns = 0;
        try {
           dtb = Float.parseFloat(diemText.getText());
           ns = Integer.parseInt(nsText.getText());
           accept = true;
        } catch (Exception e) {
          
            thongBao("sai format");
        }
        String dc = diaChiaText.getText();
        String gt = (String)gtBox.getSelectedItem();
        if(accept){ //String maSV, String email, float diemTB, String hoTen, int ngaySinh, String diaChi, String gioiTinh
         danhSachSV.add(new Student(ma,email,dtb,ten,ns,dc,gt));
         for(Student sv: danhSachSV){
              System.out.println(sv);
         }
        }
        
    }//GEN-LAST:event_themButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        tenText.setText("");
        maSVText.setText("");
        emailText.setText("");
        diaChiaText.setText("");
        diemText.setText("");
        nsText.setText("");
        gtBox.setSelectedIndex(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed
        // TODO add your handling code here:
      if(danhSachSV.isEmpty()){
        thongBao("Luu Khong Thanh Cong");
      }else{
         try {
            FileOutputStream fos = new FileOutputStream("D:/sinhvien.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhSachSV);
            thongBao("Luu Thanh Cong");
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
            thongBao("Luu Khong Thanh Cong");
        }
      }
    }//GEN-LAST:event_luuButtonActionPerformed

    private void tenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenTextActionPerformed

    private void gtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtBoxActionPerformed
public void thongBao(String a){
 JOptionPane.showMessageDialog(this,a);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diaChiaText;
    private javax.swing.JTextField diemText;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox<String> gtBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton luuButton;
    private javax.swing.JTextField maSVText;
    private javax.swing.JTextField nsText;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField tenText;
    private javax.swing.JButton themButton;
    // End of variables declaration//GEN-END:variables
}