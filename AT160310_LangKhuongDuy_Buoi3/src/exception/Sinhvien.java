/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Sinhvien {
    private String MaSV;
    private String Hoten;
    private float Diem;
    private String xepLoai; 
    Scanner input = new Scanner(System.in);

    Sinhvien() {
        
    }
    
    public Sinhvien(String MaSV, String Hoten, float Diem) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Diem = Diem;
    }
    public void nhap() throws Exception{
            System.out.print("Nhập MaSV ");
            MaSV = input.nextLine();
            System.out.print("Nhập HoTen ");
            Hoten = input.nextLine();
            Xeploaihs();
        
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public float getDiem() {
        return Diem;
    }



    public void Xeploaihs() throws Exception{
        try{
            System.out.print("Nhập Điểm ");
            this.Diem = input.nextFloat();
        }catch(InputMismatchException e){
            throw new Exception("Diem phai la so");
        }
        
        if(this.Diem>10 || this.Diem<0)
            throw new Exception("Diem khong hop le");
        
         if(this.Diem>=8 && this.Diem<=10)
        {
            this.xepLoai="Giỏi";
        }
         else if(this.Diem>=7&& this.Diem<8) 
        {
            this.xepLoai = "Khá";
        }
         else if(this.Diem >=5 && this.Diem<7 )
        {
            this.xepLoai = "Trung Bình";
        }
         else
        {
            this.xepLoai =" Kém ";
        }
    }

    @Override
    public String toString() {
        return "Sinhvien{" + 
                "MaSV=" + MaSV + ", Hoten=" + Hoten + ", Diem=" + Diem + ", "
                + "Xeploai=" + xepLoai + '}';
    }
    
}
