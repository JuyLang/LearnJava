/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06ucln;

/**
 *
 * @author TrungCH
 */
public class Number {

    protected float giaTriA;
    protected float giaTriB;

    public Number() {
    }

    public Number(float giaTriA, float giaTriB) {
        this.giaTriA = giaTriA;
        this.giaTriB = giaTriB;
    }

    public float getGiaTriA() {
        return giaTriA;
    }

    public void setGiaTriA(float giaTriA) {
        this.giaTriA = giaTriA;
    }

    public float getGiaTriB() {
        return giaTriB;
    }

    public void setGiaTriB(float giaTriB) {
        this.giaTriB = giaTriB;
    }

    public static float tinhTong(float a, float b) {
        float tong = a + b;
        return tong;
    }

    public static float tinhHieu(float a, float b) {
        float hieu = a - b;
        return hieu;
    }

    public static float tinhTich(float a, float b) {
        float tich = a * b;
        return tich;
    }

    public static float tinhThuong(float a, float b) {
        float thuong = a/b;
        return thuong;
    }
    public static float timUCLN(float a, float b){
      if(a == 0){
         return b;
      }else if(b== 0){
        return a;
      }else if(a ==0 && b==0){
        return 1;
      }
      a =Math.abs(a);
      b = Math.abs(b);
      while(a!= b){
       if(a> b){
          a = a-b;
       }else{
        b = b- a;
       }
      }
       return a;
    }
}
