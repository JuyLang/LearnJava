/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de01hanghoa;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TrungCH
 */
public class HienThiThongTin extends javax.swing.JPanel {
DefaultTableModel model;
    /** Creates new form HienThiThongTin */
    public HienThiThongTin() {
        initComponents();
        model = (DefaultTableModel)table.getModel();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TenHang", "MaHang", "NhaSX", "GiaBan", "DuongLuong", "Mau"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

public void showKQ(){
  for(int i=0;i<chuaData.danhSachDT.size();i++){
      DienThoai dt = chuaData.danhSachDT.get(i);
    model.addRow(new Object[]{dt.getTenHang(),dt.getMaHang(),dt.getNhaSX(),dt.getGiaBan(),dt.getDungLuongBN(),dt.getMauSac()});
  }
}
private QLHHJPanel chuaData;

    public void setChuaData(QLHHJPanel chuaData) {
        this.chuaData = chuaData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
