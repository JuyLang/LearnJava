/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangThucPham extends HangHoa{
    private String nhaCungCap;
    private Date nSX, hSD;
     public HangThucPham(){
         
     }
    public HangThucPham(String nhaCungCap, Date nSX, Date hSD) {
        this.nhaCungCap = nhaCungCap;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    public HangThucPham(String nhaCungCap, Date nSX, Date hSD, int maHang, String tenHang, double soluongTon, double donGia) {
        super(maHang, tenHang, soluongTon, donGia);
        this.nhaCungCap = nhaCungCap;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
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
    ///
    public boolean checkNamenhacungCap(boolean k) {
        if (this.nhaCungCap == "" || this.nhaCungCap.isEmpty()) {
            System.out.println("Nhập Tên hàng, không được để trống : ");
        } else {
            k = false;
        }
        return k;
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
     public boolean CheckTimeInvalid(boolean t) {
        if (this.getnSX().compareTo(this.gethSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
    public void ChecktimeHSD(boolean t) {
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
    public void nhapHangHoaThucPham(){
        Scanner input = new Scanner(System.in);
        boolean t = true;
        boolean th = true;
        nhapHangHoa();
        do {
            System.out.println("Nhập Tên nhà cung cấp : ");
            setNhaCungCap(input.nextLine());
        } while (checkNamenhacungCap(th));  // kiểm tra tên nhà cung cấp
       
         do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            inputNSX(input.nextInt(), input.nextInt(), input.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            inputHSD(input.nextInt(), input.nextInt(), input.nextInt());
            } while (CheckTimeInvalid(th));  
        ChecktimeHSD(t); // kiêm tra xem còn hạn sử dụng hay không 
    }
    public void danhgia(){
        Date today = new Date();
        today.getTime();
        if (getSoluongTon()>0 && this.gethSD().compareTo(today) < 0) {
            System.out.println("hàng thực phẩm này bán Khó bán");
        }
    }
    
    public double tinhVAT(){
        return 0.5;
    }
    @Override
    public String toString() {
        return " Hàng Thực Phẩm: "+getMaHang()+ "  "+getTenHang()+"     "+ nhaCungCap + "   " + 
                getDonGia() + "   " +  getSoluongTon() + nSX +"   "+ hSD + "  " ;
    }
}
