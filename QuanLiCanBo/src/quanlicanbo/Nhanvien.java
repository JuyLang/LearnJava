/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicanbo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Nhanvien extends CanBo{
    private Double Bac;

    public Nhanvien(Double Bac) {
        this.Bac = Bac;
    }

    public Nhanvien(Double Bac, String Hoten, Date NgaySinh, String GioiTinh, String DiaChi) {
        super(Hoten, NgaySinh, GioiTinh, DiaChi);
        this.Bac = Bac;
    }

    Nhanvien() {
        
    }

    @Override
    public String toString() {
        return super.toString() + Bac;
    }
    @Override
    public  void nhap(){
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập bậc");
        Bac = input.nextDouble();
    }
}
