/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien;

import javax.swing.JOptionPane;

/**
 *
 * @author TrungCH
 */
public class TuDienPanel extends javax.swing.JPanel {

    /**
     * Creates new form TuDienPanel
     */
    public TuDienPanel() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enField = new javax.swing.JTextField();
        vnField = new javax.swing.JTextField();
        timButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        themButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel6.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Từ Điển Anh - Việt");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("English");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Vetnamese");

        enField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enFieldFocusGained(evt);
            }
        });
        enField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enFieldActionPerformed(evt);
            }
        });

        vnField.setEditable(false);
        vnField.setBackground(new java.awt.Color(255, 255, 255));
        vnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnFieldActionPerformed(evt);
            }
        });

        timButton.setBackground(new java.awt.Color(255, 51, 51));
        timButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timButton.setText("Tìm");
        timButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timButtonActionPerformed(evt);
            }
        });

        themButton.setBackground(new java.awt.Color(102, 102, 255));
        themButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        themButton.setText("Thêm");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(themButton))
                            .addComponent(vnField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enField))
                        .addGap(89, 89, 89)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vnField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timButton)
                    .addComponent(themButton))
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnFieldActionPerformed

    private void enFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enFieldActionPerformed

    }//GEN-LAST:event_enFieldActionPerformed

    private void timButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timButtonActionPerformed
        //Check enField có hay không , có thì mới chạy
        if (!enField.getText().equals("")) {
            int kq = d.timKiemNhiPhan(enField.getText());
            if (kq == -1) {
            // nếu kq = -1 tức là không có index nào            
                int choose = JOptionPane.showConfirmDialog(null, "Từ bạn tìm không có, bạn có muốn thêm?");
                if (choose == 0) {
                    vnField.setEditable(true);
                    themButton.setVisible(true);
                    vnField.setText(vnField.getText());
                } 
                else {
                    reset();
                }
            } else {
                // nếu đúng thì setText ở ô input VietNamese
                vnField.setText(d.getDanhSachCacTu().get(kq).getVn());
            }
        }

    }//GEN-LAST:event_timButtonActionPerformed

    private void enFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enFieldFocusGained
        reset();
    }//GEN-LAST:event_enFieldFocusGained

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed

        if (!enField.getText().equals("") && !vnField.getText().equals("")) {
            int kq = d.timKiemNhiPhan(enField.getText());
            if (kq == -1) {
                
                Word w = new Word(d.getDanhSachCacTu().size() + 1, enField.getText(), vnField.getText());
                d.getDanhSachCacTu().add(w);
                d.sapXepList();
                for (Word o : d.getDanhSachCacTu()) {
                    System.out.println(o.getEn() + o.getVn());
                }
            }
            JOptionPane.showMessageDialog(null, "Thêm Thành Công!!");
        } else {
            JOptionPane.showMessageDialog(null, "Bạn nhập chưa đủ!!");
        }
        reset(); 
    }//GEN-LAST:event_themButtonActionPerformed

    private void reset() {
        vnField.setText("");
        enField.setText("");
        vnField.setEditable(false);
    }

    private Dictionary d = new Dictionary(Dictionary.TU_KHOI_TAO);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton themButton;
    private javax.swing.JButton timButton;
    private javax.swing.JTextField vnField;
    // End of variables declaration//GEN-END:variables
}
