/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangDienMay extends HangHoa{
    private int ngaybaohanh;
    private float congsuat;
    public HangDienMay(){
    
    }
    public HangDienMay(int ngaybaohanh, float congsuat) {
        this.ngaybaohanh = ngaybaohanh;
        this.congsuat = congsuat;
    }

    public HangDienMay(int ngaybaohanh, float congsuat, int maHang, String tenHang, double soluongTon, double donGia) {
        super(maHang, tenHang, soluongTon, donGia);
        this.ngaybaohanh = ngaybaohanh;
        this.congsuat = congsuat;
    }

    public int getNgaybaohanh() {
        return ngaybaohanh;
    }

    public void setNgaybaohanh(int ngaybaohanh) {
        this.ngaybaohanh = ngaybaohanh;
    }

    public float getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(float congsuat) {
        this.congsuat = congsuat;
    }
    
    public boolean checkngayBaoHanh(boolean k) {
        if ( this.ngaybaohanh <= 0 ) {
            System.out.println("Ngày Bảo Hành phải Lớn hơn 0");
        } else {
            k = false;
        }
        return k;
        }
      public boolean CheckCongSuat(boolean k) {
        if ( this.congsuat <= 0 ) {
            System.out.println("Công Suất phải Lớn hơn 0");
        } else {
            k = false;
        }
        return k;
        }
    public void nhapHangDienMay(){
        Scanner input = new Scanner(System.in);
        boolean bh = true;
        boolean cs = true;
        nhapHangHoa();
        do {
            setNgaybaohanh(input.nextInt());
        } while (checkngayBaoHanh(bh));  // kiểm tra ngày bào hành
        do {
            System.out.println("nhập công suất, phải lớn hơn 0 ");
            setCongsuat(input.nextFloat());
        } while (CheckCongSuat(cs));  // kiểm tra công suất
    }
    public void danhgia(){
        if(getSoluongTon() < 3){
            System.out.println("Bán được");
        }
    }
    public double tinhVAT(){
        return 0.1;
    }
    @Override
    public String toString() {
        return " Hàng Điện Máy: "+getMaHang()+ "  "+getTenHang() + "   " + 
                getDonGia() + "   " +  getSoluongTon() + "   "+ngaybaohanh +"   "+ congsuat + "  " ;
    }
}
