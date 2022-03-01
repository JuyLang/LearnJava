/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1DiemVaDoanThang;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Diem {
    public int x,y;

    public Diem() {
        
    }
    
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
  
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tạo độ x ");
        x = input.nextInt();
        System.out.println("Nhập vào tạo độ y ");
        y = input.nextInt();
    }

    @Override
    public String toString() {
        return "w{" + "x=" + x + ", y=" + y + '}';
    }
    
}
