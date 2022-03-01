/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kiemtra;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Student extends Person{
    private double mh1;
    private double mh2;
    
    public Student() {
    }
    

    public Student(double mh1, double mh2) {
        this.mh1 = mh1;
        this.mh2 = mh2;
    }

    public Student(double mh1, double mh2, String Hoten, String Diachi) {
        super(Hoten, Diachi);
        this.mh1 = mh1;
        this.mh2 = mh2;
    }

   
    
    //getter setter

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Nhập vào Họ Tên sinh viên");
        setHoten(input.nextLine());
        System.out.println("Nhập vào Địa chỉ sinh viên");
        setDiachi(input.nextLine());
            System.out.println("Nhập vào điểm môn học 1");
            mh1 = input.nextDouble();          
            System.out.println("Nhập vào điểm môn học 2");
            mh2 = input.nextDouble();
            
    } 

  
    public  void xuat(){
        System.out.println("Họ Tên : "+getHoten()+
                ", Địa Chỉ : "+getDiachi() + ", Điểm môn 1 = "+ mh1 +", môn 2 = " + mh2);
    }
    
    public double diemTB(){
        return (mh1+mh2)/2;
    }
    
    public void danhgia(){
        if(diemTB() >= 8 ){
            System.out.println("xếp loại giỏi");
        }
        else if( diemTB() <= 8 && diemTB() >= 6){
            System.out.println("xếp loại khá");
        }
        else if( diemTB() <= 6 && diemTB() >= 4){
            System.out.println("xếp loại trung bình");
        }
        else{
            System.out.println("xếp loại kém");
        }
    }
      @Override
    public String toString() {
        return getHoten() +", "+ getDiachi() + 
                " mh1 = " + mh1 + ", mh2 = " + mh2 +", Điểmtb " +diemTB();
    }
}
