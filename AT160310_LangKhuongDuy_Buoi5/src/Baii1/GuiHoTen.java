/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baii1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.PKIXRevocationChecker;
import javax.swing.JOptionPane;

/**
 *
 * @author langk
 */
public class GuiHoTen extends Frame{
    private int width = 400;
    private int height = 250;
    private Label lb_tachHoTen, lb_nhapHoTen, lb_ho, lb_ten;
    private TextField tf_nhapHoTen, tf_ho, tf_ten;
    private Button btn_tinh, btn_canel, btn_nhaplai;
    public GuiHoTen() {
        GUI();
    }
    private void GUI() {
        setTitle("Tách chuỗi họ tên");
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(width, height);
        Comps();
        addEvents();
    }
    public void Comps(){
        lb_tachHoTen = new Label("Tách họ tên");
        lb_nhapHoTen = new Label("Nhập họ tên: ");
         lb_ho = new Label("Họ: ");
        lb_ten = new Label("Tên: ");
        tf_nhapHoTen = new TextField();
        btn_tinh = new Button("Tính");
        btn_nhaplai = new Button("Nhập Lại");
        btn_canel = new Button("Dừng lại");
        tf_ho = new TextField();
        tf_ten = new TextField();
        //set giao diện
        lb_tachHoTen.setBounds(60, 15, 100, 25);
        lb_nhapHoTen.setBounds(30, 50, 100, 25);
        lb_ho.setBounds(30, 75, 100, 25);
        lb_ten.setBounds(30, 100, 100, 25);
        btn_tinh.setBounds(80, 140, 60, 30);
        btn_nhaplai.setBounds(180, 140, 60, 30);
        btn_canel.setBounds(280, 140, 60, 30);
        tf_nhapHoTen.setBounds(130, 50, 140, 25);
        tf_ho.setBounds(130, 75, 140, 25);
        tf_ten.setBounds(130, 100, 140, 25);
        // Thêm vào 
        tf_ho.setEditable(false);
        tf_ten.setEditable(false);
        add(lb_tachHoTen);
        add(lb_nhapHoTen);
        add(lb_ho);
        add(lb_ten);
        add(tf_nhapHoTen);
        add(btn_tinh);
        
        add(btn_nhaplai);
        add(btn_canel);
        add(tf_ho);
        add(tf_ten);
        
    }
      private void addEvents() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ss = e.getActionCommand();
                if(ss.equals("Dừng lại")){
                    System.exit(0);
                }
                if(ss.equals("Nhập Lại")){
                   tf_nhapHoTen.setText("");
                   tf_ho.setText("");
                   tf_ten.setText("");
                }
                if(" ".equals(tf_nhapHoTen.getText())) {
                    JOptionPane.showMessageDialog(null, "Hãy nhập tên, Không được bỏ trống");
                    return;
                }
                String hotens = tf_nhapHoTen.getText();
                String[] arr = hotens.split(" ", 2);
                tf_ho.setText(arr[0]);
                tf_ten.setText(arr[1]);
            }
        };
        btn_tinh.addActionListener(actionListener);
        btn_nhaplai.addActionListener(actionListener);
        btn_canel.addActionListener(actionListener);
        
    }
}
