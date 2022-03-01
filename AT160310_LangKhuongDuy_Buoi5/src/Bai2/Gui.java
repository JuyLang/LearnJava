/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author langk
 */
public class Gui extends JFrame{
    private JLabel lblTieuDe, lblHienThiTen, lblHienThiDtdd, lblHienThiHinhAnh, 
            lblTen, lblDtdd, lblHinhAnh, lblTenBelow, lblDTddBelow, lblHinhAnhBelow;
    private JTextField txtTen, txtDtdd, txtHinhAnh;
    private JButton btnHienThi, btnChon;
    public Gui() {
        init();
    }
    public void init(){
        setTitle("Thông tin liên hệ");
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(600, 700);
        Comps();
        addEvents();
    }
    public void Comps(){
        lblTieuDe = new JLabel("Thông tin liên hệ");
        lblTen = new JLabel("Họ tên: ");
        lblDtdd = new JLabel("ĐTDĐ: ");
        lblHinhAnh = new JLabel("Hình ảnh: ");
        txtTen = new JTextField();
        txtDtdd = new JTextField();
        txtHinhAnh = new JTextField();
        btnHienThi = new JButton("Hiển thị");
        
        lblTenBelow = new JLabel("Họ tên: ");
        lblDTddBelow = new JLabel("ĐTDĐ: ");
        lblHinhAnhBelow = new JLabel("Hình ảnh: ");
        lblHienThiTen = new JLabel("Lăng Khương Duy");
        lblHienThiDtdd = new JLabel("0164996564");
        lblHienThiHinhAnh = new JLabel();
        
        //setgiaodien
        lblTieuDe.setBounds(30, 15, 100, 22);
         lblTen.setBounds(lblTieuDe.getX(), 
                lblTieuDe.getY() + lblTieuDe.getHeight() + 10, 100, 22);
        lblDtdd.setBounds(lblTieuDe.getX(), 
                lblTen.getY() + lblTen.getHeight() + 10, 100, 22);
        lblHinhAnh.setBounds(lblTieuDe.getX(), 
                lblDtdd.getY() + lblDtdd.getHeight() + 10, 100, 22);
        
        txtTen.setBounds(lblTen.getX() + lblTen.getWidth(), 
                lblTen.getY(), 170, 22);
        txtDtdd.setBounds(txtTen.getX(), lblDtdd.getY(), 170, 22);
        txtHinhAnh.setBounds(txtTen.getX(), lblHinhAnh.getY(), 170, 22);
        btnHienThi.setBounds(130, txtHinhAnh.getY() + txtHinhAnh.getHeight() + 20
                , 80, 22);
        
        lblTenBelow.setBounds(lblTieuDe.getX(), 
                btnHienThi.getY() + btnHienThi.getHeight() + 30, 100, 22);
        lblDTddBelow.setBounds(lblTieuDe.getX(), 
                lblTenBelow.getY() + lblTenBelow.getHeight() + 10, 100, 22);
        lblHinhAnhBelow.setBounds(lblTieuDe.getX(), 
                lblDTddBelow.getY() + lblDTddBelow.getHeight() + 10, 100, 22);
        lblHienThiTen.setBounds(txtTen.getX(), lblTenBelow.getY(), 170, 22);
        lblHienThiDtdd.setBounds(txtTen.getX(), lblDTddBelow.getY(), 170, 22);
        lblHienThiHinhAnh.setBounds(txtTen.getX(), lblHinhAnhBelow.getY(), 120, 120);

        //add
        add(lblTieuDe);
        add(lblTen);
        add(lblDtdd);
        add(lblHinhAnh);
        add(txtTen);
        add(txtDtdd);
        add(txtHinhAnh);
        add(btnHienThi);
        
        add(lblTenBelow);
        add(lblDTddBelow); 
        add(lblHinhAnhBelow);
        add(lblHienThiTen);
        add(lblHienThiDtdd);
        add(lblHienThiHinhAnh);
    }
    public void addEvents(){
         ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                String tenString = txtTen.getText().trim();
                String dtddString = txtDtdd.getText().trim();
                String hinhAnhString = txtHinhAnh.getText().trim();
                setTitle(tenString + " Thông Tin");
                lblHienThiTen.setText(tenString);
                lblHienThiDtdd.setText(dtddString);
                ImageIcon icon = new ImageIcon(hinhAnhString);
                lblHienThiHinhAnh.setSize(400, 350);
                lblHienThiHinhAnh.setIcon(icon);
                
            }
        };
        btnHienThi.addActionListener(actionListener);
    }
}
