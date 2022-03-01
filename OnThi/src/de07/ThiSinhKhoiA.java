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
public class ThiSinhKhoiA extends ThiSinh{
    private Float DiemToan,DiemLy,DiemHoa, TongDiem;
    
    public ThiSinhKhoiA() {
    }
    
    public ThiSinhKhoiA(Float DiemToan, Float DiemLy, Float DiemHoa) {
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
    }

    public ThiSinhKhoiA(Float DiemToan, Float DiemLy, Float DiemHoa, String HoTen, String DiaChi, int NgaySinh) {
        super(HoTen, DiaChi, NgaySinh);
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
    }

    public Float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(Float DiemToan) {
        this.DiemToan = DiemToan;
    }

    public Float getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(Float DiemLy) {
        this.DiemLy = DiemLy;
    }

    public Float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(Float DiemHoa) {
        this.DiemHoa = DiemHoa;
    }
    
    @Override
    public void nhap(){
        Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập điểm toán");
        DiemToan = input.nextFloat();
        System.out.println("Nhập điểm lý");
        DiemLy = input.nextFloat();
        System.out.println("Nhập điểm hóa");
        DiemHoa = input.nextFloat();
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" + "DiemToan=" + DiemToan + ", DiemLy=" + DiemLy + ", DiemHoa=" + DiemHoa + '}';
    }
   

    @Override
    public void kiemtra() {
        TongDiem = (DiemToan+DiemLy+DiemHoa);
        if(TongDiem>=20)
        {
            System.out.println(toString());
        }
    }
    
}
