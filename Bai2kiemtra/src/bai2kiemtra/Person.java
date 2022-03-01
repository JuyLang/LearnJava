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
public class Person {
    private String Hoten;
    private String Diachi;
    //contructor

    public Person() {
    }

    public Person(String Hoten) {
        this.Hoten = Hoten;
    }
    
    public Person(String Hoten, String Diachi) {
        this.Hoten = Hoten;
        this.Diachi = Diachi;
    }
    
    
    //getter setter 

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
     public void nhapPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Họ Tên");
        Hoten = input.nextLine();
        System.out.println("Nhập Địa Chỉ");
        Diachi = input.nextLine();
    }
    @Override
    public String toString() {
        return "Person{" + "Hoten=" + Hoten + ", Diachi=" + Diachi + '}';
    }
    
}
