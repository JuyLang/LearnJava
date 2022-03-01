/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangThucPham {
    //Khai báo các thuộc tính 
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date nSX, hSD;
    //Khởi tạo constructor không tham số
    public HangThucPham() {
        
    }
    //Khởi tạo constructor có tham số
    public HangThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }
   
    
    //getter and setter
    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getnSX() {
        return nSX;
    }

    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }

    public Date gethSD() {
        return hSD;
    }

    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }
    
    //Khởi tạo phương thức để nhập năm tháng ngày sản xuất
    public void inputNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }
    //Khởi tạo phương thức để nhập hạn sử dụng
    public void inputHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hSD = calendar.getTime();
    }
    
    //khởi tạo phương thức kiểm tra tên hàng không được để trống
    public boolean checkNameProduct(boolean k) {
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Nhập Tên hàng, không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
    
    //khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
    public boolean CheckTimeInvalid(boolean t) {
        if (this.getnSX().compareTo(this.gethSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
    //khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
    public void ChecktimeHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        setMaHang(input.nextInt());
       do {
           setTenHang(input.nextLine());
        } while (checkNameProduct(kt));  // kiểm tra tên có nhập đúng không,sai nhập lại
        
        System.out.println("Nhập đơn giá : ");
        setDonGia(input.nextDouble());   // nhập đơn giá 
        
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            inputNSX(input.nextInt(), input.nextInt(), input.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            inputHSD(input.nextInt(), input.nextInt(), input.nextInt());
        } while (CheckTimeInvalid(th));  // nhập vào ngày sản xuất và hạn sử dụng
                                            //nếu sai HSD < NSX thì nhập lại
      
//        System.out.println(toString()); // in ra tp vừa tạo
        ChecktimeHSD(); // kiêm tra xem còn hạn sử dụng hay không 
    }
    @Override
    public String toString() {
        return maHang + "   " + tenHang + "    " + 
                donGia + "   " + nSX +"    "+ hSD + "  ";
    }
    
}
