/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1KhongKeoTha;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author langkduy
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JTable table = new JTable();
        Object[] columns = {"Tên hàng hóa", "Đơn vị tính",
            "Đơn giá", "Số lượng", "Thành tiền"};
        DefaultTableModel model = new DefaultTableModel();

        JFrame frame = new JFrame();

        frame.setSize(575, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.white);
        table.setForeground(Color.black);
        table.setSelectionForeground(Color.white);
        table.setFont(new Font("Arial", Font.PLAIN, 12));
        table.setRowHeight(15);
        table.setAutoCreateRowSorter(true);

        JScrollPane pane = new JScrollPane(table);
        pane.setBackground(Color.white);
        pane.setBounds(20, 200, 510, 200);
        frame.getContentPane().add(pane);

        JLabel muc_HoaDonBanHang = new JLabel();
        muc_HoaDonBanHang.setText("Hóa đơn bán hàng");
        muc_HoaDonBanHang.setBounds(50, 30, 150, 20);
        frame.getContentPane().add(muc_HoaDonBanHang);

        JLabel txtSoHoaDon = new JLabel();
        txtSoHoaDon.setText("Số hóa đơn:");
        txtSoHoaDon.setBounds(20, 60, 150, 20);
        frame.getContentPane().add(txtSoHoaDon);

        JLabel txtNgayHoaDon = new JLabel();
        txtNgayHoaDon.setText("Ngày hóa đơn:");
        txtNgayHoaDon.setBounds(20, 85, 150, 20);
        frame.getContentPane().add(txtNgayHoaDon);

        JLabel txtSoLuongHangHoa = new JLabel();
        txtSoLuongHangHoa.setText("Số lượng hàng hóa:");
        txtSoLuongHangHoa.setBounds(20, 110, 150, 20);
        frame.getContentPane().add(txtSoLuongHangHoa);

        JTextField giaTri_SoHoaDon = new JTextField();
        giaTri_SoHoaDon.setBounds(150, 60, 100, 20);
        frame.getContentPane().add(giaTri_SoHoaDon);
        giaTri_SoHoaDon.setColumns(10);

        JTextField giaTri_NgayHoaDon = new JTextField();
        giaTri_NgayHoaDon.setBounds(150, 85, 100, 20);
        frame.getContentPane().add(giaTri_NgayHoaDon);
        giaTri_NgayHoaDon.setColumns(10);

        JTextField giaTri_SoLuongHangHoa = new JTextField();
        giaTri_SoLuongHangHoa.setBounds(150, 110, 100, 20);
        frame.getContentPane().add(giaTri_SoLuongHangHoa);
        giaTri_SoLuongHangHoa.setColumns(10);

        JLabel muc_ThongTinHangHoa = new JLabel();
        muc_ThongTinHangHoa.setText("Thông tin hàng hóa");
        muc_ThongTinHangHoa.setBounds(350, 30, 150, 20);
        frame.getContentPane().add(muc_ThongTinHangHoa);

        JLabel txtTenHangHoa = new JLabel();
        txtTenHangHoa.setText("Tên hàng hóa:");
        txtTenHangHoa.setBounds(300, 60, 150, 20);
        frame.getContentPane().add(txtTenHangHoa);

        JLabel txtDonViTinh = new JLabel();
        txtDonViTinh.setText("Đơn vị tính:");
        txtDonViTinh.setBounds(300, 85, 150, 20);
        frame.getContentPane().add(txtDonViTinh);

        JLabel txtDonGia = new JLabel();
        txtDonGia.setText("Đơn giá:");
        txtDonGia.setBounds(300, 110, 150, 20);
        frame.getContentPane().add(txtDonGia);

        JLabel txtSoLuong = new JLabel();
        txtSoLuong.setText("Số lượng:");
        txtSoLuong.setBounds(300, 135, 150, 20);
        frame.getContentPane().add(txtSoLuong);

        JTextField giaTri_TenHangHoa = new JTextField();
        giaTri_TenHangHoa.setBounds(400, 60, 100, 20);
        frame.getContentPane().add(giaTri_TenHangHoa);
        giaTri_TenHangHoa.setColumns(10);

        JTextField giaTri_DonViTinh = new JTextField();
        giaTri_DonViTinh.setBounds(400, 85, 100, 20);
        frame.getContentPane().add(giaTri_DonViTinh);
        giaTri_DonViTinh.setColumns(10);

        JTextField giaTri_DonGia = new JTextField();
        giaTri_DonGia.setBounds(400, 110, 100, 20);
        frame.getContentPane().add(giaTri_DonGia);
        giaTri_DonGia.setColumns(10);

        JTextField giaTri_SoLuong = new JTextField();
        giaTri_SoLuong.setBounds(400, 135, 100, 20);
        frame.getContentPane().add(giaTri_SoLuong);
        giaTri_SoLuong.setColumns(10);

        // 
        JButton btn_ThemHoaDon = new JButton();
        btn_ThemHoaDon.setText("Thêm hóa đơn");
        btn_ThemHoaDon.setBounds(50, 170, 150, 20);
        frame.getContentPane().add(btn_ThemHoaDon);
        btn_ThemHoaDon.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Thêm thành công!");
        });

        Object[] row = new Object[5];
        JButton btn_ThemHangHoa = new JButton();
        btn_ThemHangHoa.setText("Thêm hàng hóa");
        btn_ThemHangHoa.setBounds(340, 170, 150, 20);
        frame.getContentPane().add(btn_ThemHangHoa);
        btn_ThemHangHoa.addActionListener((ActionEvent e) -> {
            try {
                row[0] = giaTri_TenHangHoa.getText();
                row[1] = giaTri_DonViTinh.getText();
                row[2] = giaTri_DonGia.getText();
                row[3] = giaTri_SoLuong.getText();
                row[4] = Double.parseDouble(giaTri_DonGia.getText())
                        * Double.parseDouble(giaTri_SoLuong.getText());
                
                model.addRow(row);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Vui lòng nhập đủ thông tin và đúng định dạng!");
            }
        });

        JButton btn_XuatHoaDon = new JButton();
        btn_XuatHoaDon.setText("Xuất hóa đơn");
        btn_XuatHoaDon.setBounds(310, 420, 130, 20);
        frame.getContentPane().add(btn_XuatHoaDon);
        btn_XuatHoaDon.addActionListener((ActionEvent e) -> {
            JDialog HoaDon = new JDialog(frame, "Thông tin hóa đơn");
            HoaDon.setLayout(null);
            HoaDon.getContentPane().setLayout(null);
            HoaDon.setLocationRelativeTo(null);
            model.setColumnIdentifiers(columns);
            table.setModel(model);
            table.setBackground(Color.white);
            table.setForeground(Color.black);
            table.setSelectionForeground(Color.white);
            table.setFont(new Font("Arial", Font.PLAIN, 12));
            table.setRowHeight(15);
            table.setAutoCreateRowSorter(true);
            JScrollPane pane1 = new JScrollPane(table);
            pane1.setBackground(Color.white);
            pane1.setBounds(20, 115, 510, 200);
            HoaDon.getContentPane().add(pane1);
            JLabel txtSoHoaDon1 = new JLabel();
            txtSoHoaDon1.setText("Số hóa đơn:");
            txtSoHoaDon1.setBounds(20, 40, 150, 20);
            txtSoHoaDon1.setVisible(true);
            JLabel txtNgayHoaDon1 = new JLabel();
            txtNgayHoaDon1.setText("Ngày hóa đơn:");
            txtNgayHoaDon1.setBounds(20, 65, 150, 20);
            txtNgayHoaDon1.setVisible(true);
            JLabel txtSoLuongHangHoa1 = new JLabel();
            txtSoLuongHangHoa1.setText("Danh sách hàng hóa:");
            txtSoLuongHangHoa1.setBounds(20, 90, 150, 20);
            txtSoLuongHangHoa1.setVisible(true);
            JLabel muc_SoHoaDon = new JLabel();
            muc_SoHoaDon.setText(giaTri_SoHoaDon.getText());
            muc_SoHoaDon.setBounds(200, 40, 150, 20);
            muc_SoHoaDon.setVisible(true);
            JLabel muc_NgayHoaDon = new JLabel();
            muc_NgayHoaDon.setText(giaTri_NgayHoaDon.getText());
            muc_NgayHoaDon.setBounds(200, 65, 150, 20);
            muc_NgayHoaDon.setVisible(true);
            JButton btn_OK = new JButton();
            btn_OK.setText("OK");
            btn_OK.setBounds(450, 320, 75, 20);
            btn_OK.addActionListener((ActionEvent e1) -> {
                System.exit(0);
            });
            btn_OK.setVisible(true);
            HoaDon.add(txtSoHoaDon1);
            HoaDon.add(txtNgayHoaDon1);
            HoaDon.add(txtSoLuongHangHoa1);
            HoaDon.add(muc_SoHoaDon);
            HoaDon.add(muc_NgayHoaDon);
            HoaDon.add(btn_OK);
            HoaDon.setSize(575, 400);
            HoaDon.setVisible(true);
        });
        JButton btn_LamLai = new JButton();
        btn_LamLai.setText("Làm lại");
        btn_LamLai.setBounds(450, 420, 75, 20);
        frame.getContentPane().add(btn_LamLai);
        btn_LamLai.addActionListener((ActionEvent e) -> {
            int rowsRemove = model.getRowCount();
            for (int i = rowsRemove - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        });

        frame.revalidate();
        frame.setVisible(true);
    }
    
}
