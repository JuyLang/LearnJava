/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06songuyento;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class Number implements Serializable {

    protected int min;
    protected int max;
    protected int value;

    public Number() {
    }

    public Number(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  public static boolean kiemTraSoNT(int a){
    int dem= 0;
    for(int i =1;i<=a;i++){
      if(a%i==0){
        dem ++;
      }
    }
    if(dem==2){
     return true;
    }
    return false;
  }

}
