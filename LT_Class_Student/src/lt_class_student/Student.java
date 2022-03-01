/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt_class_student;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Student {
    Scanner input = new Scanner(System.in);
// Trường
    private String Hoten;
    private double diem;
    
//hàm tạo Contructor
//    public Student(String Hoten, double diem) {
//        this.Hoten = Hoten;
//        this.diem = diem;
//    }
//    phương thức
    public void nhap(){
        this.Hoten = input.nextLine();
        this.diem = input.nextInt();
    }
//    private void xuat(){
//        
//    }

    /**
     *
     * @param diem
     */
    public void xeploai(double diem){
        if(diem >= 8){
            System.out.println("Xếp Loại Giỏi");
        }
        else if(diem <= 8 && diem >= 7){
            System.out.println("Xếp loại Khá");
        }
        else{
            System.out.println("Xếp loại Trung Bình");
        }
    }
}
