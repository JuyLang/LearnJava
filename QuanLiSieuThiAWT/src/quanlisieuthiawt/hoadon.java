/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisieuthiawt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class hoadon extends hanghoa{
    private String SoHD;
    private String NgayHD;
    private int SoLuongHD;
    private ArrayList<hanghoa> ArrHangHoa;

    public hoadon() {
    }

    public hoadon(String SoHD, String NgayHD, int SoLuongHD) {
        this.SoHD = SoHD;
        this.NgayHD = NgayHD;
        this.SoLuongHD = SoLuongHD;
        this.ArrHangHoa = new ArrayList<hanghoa>(SoLuongHD);
        
    }

    public String getSoHD() {
        return SoHD;
    }

    public void setSoHD(String SoHD) {
        this.SoHD = SoHD;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    public int getSoLuongHD() {
        return SoLuongHD;
    }

    public void setSoLuongHD(int SoLuongHD) {
        this.SoLuongHD = SoLuongHD;
    }

    public ArrayList<hanghoa> getArrHangHoa() {
        return ArrHangHoa;
    }

    public void setArrHangHoa(ArrayList<hanghoa> ArrHangHoa) {
        this.ArrHangHoa = ArrHangHoa;
    }
    

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Số Hóa Đơn");
        SoHD = input.nextLine();
        System.out.println("Nhập Ngày Hóa Đơn");
        NgayHD = input.nextLine();
        System.out.println("Nhập Số Lượng mua");
        SoLuongHD = input.nextInt();
        for (int i = 0; i < SoLuongHD; i++) {
            System.out.println("Hàng Hóa thứ "+i);
            ThemHang();
        }
        
    }
    public void ThemHang(){
            hanghoa newHH = new hanghoa();
            newHH.nhap();
            ArrHangHoa.add(newHH);
    }
    public void showlisthanghoa(){
        for (int i = 0; i < SoLuongHD; i++) {
            System.out.println(ArrHangHoa.get(i));
        }
    }
    @Override
    public String toString() {
        return "hoadon{" + "SoHD=" + SoHD + ", NgayHD=" + NgayHD + ", SoLuongHD=" + SoLuongHD + ", ArrHangHoa=" + ArrHangHoa + '}';
    }
}
