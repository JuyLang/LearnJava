/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Person {
    private String Hoten;
    private String Diachi;

    public Person() {
    }

    public Person(String Hoten, String Diachi) {
        this.Hoten = Hoten;
        this.Diachi = Diachi;
    }

    @Override
    public String toString() {
        return "Person{" + "Hoten=" + Hoten + ", Diachi=" + Diachi + '}';
    }

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
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Họ tên");
        Hoten = input.nextLine();
        System.out.println("Nhập Địa Chỉ");
        Diachi = input.nextLine();  
    }
    public String input(){
        return "{" + "Hoten=" + Hoten + ", Diachi=" + Diachi + '}';
    }
    
}
