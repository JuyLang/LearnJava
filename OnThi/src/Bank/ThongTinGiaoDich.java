/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class ThongTinGiaoDich {
    private String MaGD, LoaiGD;
    private Float SoTien;
    private int NgayGD;

    public ThongTinGiaoDich() {
    }
    
    public ThongTinGiaoDich(String MaGD, String LoaiGD, Float SoTien, int NgayGD) {
        this.MaGD = MaGD;
        this.LoaiGD = LoaiGD;
        this.SoTien = SoTien;
        this.NgayGD = NgayGD;
    }

    public String getMaGD() {
        return MaGD;
    }

    public void setMaGD(String MaGD) {
        this.MaGD = MaGD;
    }

    public String getLoaiGD() {
        return LoaiGD;
    }

    public void setLoaiGD(String LoaiGD) {
        this.LoaiGD = LoaiGD;
    }

    public Float getSoTien() {
        return SoTien;
    }

    public void setSoTien(Float SoTien) {
        this.SoTien = SoTien;
    }

    public int getNgayGD() {
        return NgayGD;
    }

    public void setNgayGD(int NgayGD) {
        this.NgayGD = NgayGD;
    }
    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Mã Giao Dịch");
        MaGD = input.nextLine();
        System.out.println("Nhập Mã Số tiền");
        SoTien = input.nextFloat();
        System.out.println("Nhập Ngày Giao Dịch");
        NgayGD = input.nextInt();
        System.out.println("Nhập Loại Giao Dịch Rút/Gửi");
        LoaiGD = input.nextLine();
    }
    public ThongTinGiaoDich nhapTTGD(){
        return null;
        
    }
    @Override
    public String toString() {
        return "ThongTinGiaoDich{" + "MaGD=" + MaGD + ", LoaiGD=" + LoaiGD + ", SoTien=" + SoTien + ", NgayGD=" + NgayGD + '}';
    }
    
    
}
