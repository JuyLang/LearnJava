/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import java.util.Scanner;
import javax.jws.Oneway;

/**
 *
 * @author langk
 */
public class TaiKhoanNganHang{
    private String SoTK;
    private Float SoDu;
    private ArrayList<ThongTinGiaoDich> DsGD;

    public TaiKhoanNganHang(int n) {
        this.DsGD = new ArrayList<>(n);
    }

    public TaiKhoanNganHang(String SoTK, Float SoDu, ArrayList<ThongTinGiaoDich> DsGD) {
        this.SoTK = SoTK;
        this.SoDu = SoDu;
        this.DsGD = DsGD;
    }
    
    
    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public Float getSoDu() {
        return SoDu;
    }

    public void setSoDu(Float SoDu) {
        this.SoDu = SoDu;
    }

    public ArrayList<ThongTinGiaoDich> getDsGD() {
        return DsGD;
    }

    public void setDsGD(ArrayList<ThongTinGiaoDich> DsGD) {
        this.DsGD = DsGD;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số tài khoản");
        SoTK = input.nextLine();
        System.out.println("nhập vào số dư tài khoản");
        SoDu = input.nextFloat();
        System.out.println("nhập vào số dư tài khoản");
       
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" + "SoTK=" + SoTK + ", SoDu=" + SoDu + ", DsGD=" + DsGD + '}';
    }
    
}
