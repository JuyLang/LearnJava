/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de07;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class ThiSinhKhoiB extends ThiSinh{
    private Float DiemSu,DiemVan,DiemDia, TongDiem;

    public ThiSinhKhoiB() {
    }

    public ThiSinhKhoiB(Float DiemSu, Float DiemVan, Float DiemDia) {
        this.DiemSu = DiemSu;
        this.DiemVan = DiemVan;
        this.DiemDia = DiemDia;
    }

    public ThiSinhKhoiB(Float DiemSu, Float DiemVan, Float DiemDia, String HoTen, String DiaChi, int NgaySinh) {
        super(HoTen, DiaChi, NgaySinh);
        this.DiemSu = DiemSu;
        this.DiemVan = DiemVan;
        this.DiemDia = DiemDia;
    }
    @Override
    public void nhap(){
        Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập điểm Văn");
        DiemVan = input.nextFloat();
        System.out.println("Nhập điểm Sử");
        DiemSu = input.nextFloat();
        System.out.println("Nhập điểm Địa");
        DiemDia = input.nextFloat();
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" + "DiemSu=" + DiemSu + ", DiemVan=" + DiemVan + ", DiemDia=" + DiemDia + '}';
    }
    
    @Override
    public void kiemtra() {
        TongDiem = (DiemDia+DiemSu+DiemDia);
        if(TongDiem>=20)
        {
            System.out.println(toString());
        }
    }
}
