/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de03;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TrungCH
 */
public class QLSVPane extends javax.swing.JPanel {
DefaultTableModel model;


    /**
     * Creates new form QLSVPane
     */
    public QLSVPane() {
        initComponents();
        model = (DefaultTableModel)table.getModel();
    }
   LopHoc lh = new LopHoc();
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        tenSVText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        maSVText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dqtText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dhpText = new javax.swing.JTextField();
        xnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        jLabel1.setText("TenSV:");

        jLabel2.setText("MaSV:");

        jLabel3.setText("DiemQT:");

        jLabel4.setText("DiemHP:");

        xnButton.setText("Xac Nhan");
        xnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HoTen", "MaSV", "DiemQT", "DiemHP", "DiemTB"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ThemSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tenSVText)
                            .addComponent(maSVText)
                            .addComponent(dqtText)
                            .addComponent(dhpText, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tenSVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xnButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(maSVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dqtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dhpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnButtonActionPerformed
        // TODO add your handling code here:
        boolean accept = false;
        if(tenSVText.getText().trim().isEmpty() || maSVText.getText().trim().isEmpty() 
                || dqtText.getText().trim().isEmpty() || dhpText.getText().trim().isEmpty()){
           thongBao("Khong De Trong Thong Tin ");
        }else{
        String ten = tenSVText.getText();
        String ma = maSVText.getText();
        float dqt = 0;
        float dhp = 0;
        try {
            dqt = Float.parseFloat(dqtText.getText());
            dhp = Float.parseFloat(dhpText.getText());
            accept = true;
        } catch (Exception e) {
            thongBao("Sai format");
        }
        if(accept){
         lh.danhSachSV.add(new SinhVien(ten,ma,dhp,dqt));
         showKQ();
         thongBao("Them Thanh Cong");
          
        }
            System.out.println(lh.danhSachSV.size());
            System.out.println(Integer.parseInt(chuaDaTa.getSiSoText().getText()));
           if(lh.danhSachSV.size()==Integer.parseInt(chuaDaTa.getSiSoText().getText())){
          thongBao("Du So Luong");
          xnButton.setEnabled(false);
        }
        }
    }//GEN-LAST:event_xnButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tenSVText.setText("");
        maSVText.setText("");
        dqtText.setText("");
        dhpText.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        xnButton.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed
public void thongBao(String a){
    JOptionPane.showMessageDialog(this, a);
}
public void showKQ(){
   SinhVien temp = lh.danhSachSV.get(lh.danhSachSV.size()-1);
   model.addRow(new Object[]{temp.getHoTen(),temp.getMaSV(),temp.getDiemQT(),temp.getDiemHP(),temp.diemTB(temp.getDiemQT(), temp.getDiemHP())});
}
private QLLOPHOC chuaDaTa;

    public void setChuaDaTa(QLLOPHOC chuaDaTa) {
        this.chuaDaTa = chuaDaTa;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dhpText;
    private javax.swing.JTextField dqtText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maSVText;
    private javax.swing.JTable table;
    private javax.swing.JTextField tenSVText;
    private javax.swing.JButton xnButton;
    // End of variables declaration//GEN-END:variables
}
