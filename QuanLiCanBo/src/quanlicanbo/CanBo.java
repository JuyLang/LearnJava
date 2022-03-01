/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicanbo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class CanBo {
    private String Hoten;
    private Date NgaySinh;
    private String GioiTinh;
    private String DiaChi;

    public CanBo() {
    }

    public CanBo(String Hoten, Date NgaySinh, String GioiTinh, String DiaChi) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
     public void inputNS(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.NgaySinh = calendar.getTime();
    }
     public boolean Checktime() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getNgaySinh().compareTo(today) > 0) {
            System.out.println("Ngày sinh phải nhỏ hơn hôm nay");
            return false;
        } else {
            return true;
        }
     }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Họ Tên");
        Hoten = input.nextLine();
        
         System.out.println("Nhập Địa Chỉ");
          DiaChi = input.nextLine(); 
        System.out.println("Nhập Giới Tính");
        GioiTinh = input.nextLine();
        System.out.println("Nhập Ngày sinh: Năm / Tháng / Ngày");
        inputNS(input.nextInt(), input.nextInt(), input.nextInt());
        if( Checktime() == false){
            System.out.println("Nhập Ngày sinh: Năm / Tháng / Ngày");
            inputNS(input.nextInt(), input.nextInt(), input.nextInt());
        }
          
    }

    @Override
    public String toString() {
        return "CanBo{" + "Hoten=" + Hoten + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + ", DiaChi=" + DiaChi + '}';
    }
    
}
