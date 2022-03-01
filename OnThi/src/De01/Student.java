/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De01;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Student extends Person{
    private String MaSV, Email;
    private float DiemTK;

    public Student() {
    }
    
    public Student(String MaSV, String Email, float DiemTK) {
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    public Student(String MaSV, String Email, float DiemTK, String HoTen, String DiaChi, String GioiTinh, int NgaySinh) {
        super(HoTen, DiaChi, GioiTinh, NgaySinh);
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDiemTK() {
        return DiemTK;
    }

    public void setDiemTK(float DiemTK) {
        this.DiemTK = DiemTK;
    }
    
    @Override
    public void nhap(){
        Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Mã sinh viên là");
        MaSV = input.nextLine();
        System.out.println("Email sinh viên: ");
        Email = input.nextLine();
        System.out.println("Điểm tổng kết sinh viên");
        DiemTK = input.nextFloat();
        
    }

    @Override
    public String toString() {
        return  "Họ Tên "+getHoTen()+", Giới tính "+getGioiTinh()+
                ", Địa chỉ "+getDiaChi()+
                ", Ngày sinh "+getNgaySinh()+
                " MaSV=" + MaSV + 
                ", Email=" + Email + 
                ", DiemTK=" + DiemTK + "";
    }
    
}
