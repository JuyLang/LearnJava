/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangSanhSu extends HangHoa{
    private Date nNK;
    private Date nSX;
    public HangSanhSu() {
        
    }
    public HangSanhSu(Date nNK, Date nSX) {
        this.nNK = nNK;
        this.nSX = nSX;
    }

    public HangSanhSu(Date nNK, Date nSX, int maHang, String tenHang, double soluongTon, double donGia) {
        super(maHang, tenHang, soluongTon, donGia);
        this.nNK = nNK;
        this.nSX = nSX;
    }
    //Khởi tạo phương thức để nhập năm tháng ngày sản xuất
    public void inputNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }
    //Khởi tạo phương thức để nhập ngày nhập kho
    public void inputHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nNK = calendar.getTime();
    }
    
    public void nhapHangSanhSu(){
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        System.out.println("Nhập năm,tháng,ngày sản xuất : ");
        inputNSX(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("nhập năm,tháng,ngày nhập kho : ");
        inputHSD(input.nextInt(), input.nextInt(), input.nextInt());
    }
    public void danhgia(){
        Date today = new Date();
        today.getTime();
        if (getSoluongTon()>50 && nNK.compareTo(today) < 0) {
            System.out.println("hàng sành sứ này Bán Chậm");
        }
    }
    public double tinhVAT(){
        return 0.1;
    }
    @Override
    public String toString() {
        return " Hàng Sành Sứ: "+getMaHang()+ "  "+getTenHang() + "   " + 
                getDonGia() + "   " +  getSoluongTon() + "   "+nSX +"   "+ nNK + "  " ;
    }
}
