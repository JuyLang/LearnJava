/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisieuthiawt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author langk
 */
public class GuiQuanLi extends Frame{
    private Label titleHoaDon,titleThongTin,titleSHD,titleTHH, titleNHD,titleSLH
            ,titleDonvi, titleDongia, titleSoLuong;
    private TextField txtSoHoaDon,txtNgayHoaDon,txtSoLuongHoaDon,txtTenHangHoa,
            txtDonvi,txtDonGia,txtSoLuongHang;
    private Button btnThemHoaDon,btnThemHangHoa,btnXuatHoaDon,btnLamLai;

    public GuiQuanLi() {
        init();
    }
    public void init(){
        setTitle("Quản Lí Hóa Đơn");
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(800, 800);
        Comps();
        addEvents();
    }

    private void Comps() {
        titleHoaDon = new Label("Hóa Đơn Bán Hàng");
        titleHoaDon.setBounds(200, 100, 200, 30);
        
        titleSHD = new Label("Số hóa Đơn");
        titleSHD.setBounds(120, 120, 80, 30);
        txtSoHoaDon = new TextField();
        txtSoHoaDon.setBounds(200,120, 80, 30);
        
//        titleNHD = new Label("Ngày hóa đơn");
//        titleSHD.setBounds(120, 140, 80, 30);
//        txtNgayHoaDon = new TextField();
//        txtNgayHoaDon.setBounds(200,140, 80, 30);
        
//        titleSLH = new Label("Số lượng hàng");
//        titleSLH.setBounds(120, 160, 80, 30);
//        txtSoLuongHoaDon = new TextField();
//        txtSoLuongHoaDon.setBounds(200,160, 80, 30);
//        
        
        
        
        
        titleThongTin = new Label("Thông Tin Hàng Hóa");
        titleThongTin.setBounds(500, 100, 200, 30);
        titleTHH = new Label("Tên hàng hóa");
        titleTHH.setBounds(420, 120, 80, 30);
        
        //add
        add(titleHoaDon);
        add(titleThongTin);
        add(titleSHD);
        add(txtSoHoaDon);
        add(titleTHH);
        
//        add(titleNHD);
//        add(txtNgayHoaDon);
//        add(titleThongTin);
//        add(titleTHH);
       
    }

    private void addEvents() {
       
        
    }
}
