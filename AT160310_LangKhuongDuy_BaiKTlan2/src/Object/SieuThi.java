/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author langkduy
 */
public class SieuThi {
    private  String soHoadon;
    private String ngayHoaDon;
    private  int soLuongHangHoa;

    public SieuThi() {
    }

    public SieuThi(String soHoadon, String ngayHoaDon, int soLuongHangHoa) {
        this.soHoadon = soHoadon;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuongHangHoa = soLuongHangHoa;
    }

    public String getSoHoadon() {
        return soHoadon;
    }

    public void setSoHoadon(String soHoadon) {
        this.soHoadon = soHoadon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public int getSoLuongHangHoa() {
        return soLuongHangHoa;
    }

    public void setSoLuongHangHoa(int soLuongHangHoa) {
        this.soLuongHangHoa = soLuongHangHoa;
    }

   

   
    

   
    
}
