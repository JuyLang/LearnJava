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
public class Kysu extends CanBo{
    private String Nganh;

    public Kysu(){
    }

    public Kysu(String Nganh, String Hoten, Date NgaySinh, String GioiTinh, String DiaChi) {
        super(Hoten, NgaySinh, GioiTinh, DiaChi);
        this.Nganh = Nganh;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập ngành");
        Nganh = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngành "+ Nganh;
    }
    
}
