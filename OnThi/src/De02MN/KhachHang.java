/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De02MN;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class KhachHang {
    private String MaKH,TenKH,DiaChi;
    private int NamSinh;
    private Float TienMua;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String DiaChi, int NamSinh, Float TienMua) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.NamSinh = NamSinh;
        this.TienMua = TienMua;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào Mã khách hàng");
        MaKH = input.nextLine();
        System.out.println("Nhập vào Tên khách hàng");
        TenKH = input.nextLine();
        System.out.println("Nhập vào Năm sinh khách hàng");
        NamSinh = input.nextInt();
        System.out.println("Nhập vào Địa Chỉ khách hàng");
        DiaChi=input.nextLine();    
    }
    @Override
    public String toString() {
        return "KhachHang{" + "MaKH=" + MaKH + ", TenKH=" + TenKH + ", DiaChi=" + DiaChi + ", NamSinh=" + NamSinh + ", TienMua=" + TienMua + '}';
    }
    
}
