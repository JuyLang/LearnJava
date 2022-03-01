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
public class DaySo {
    protected int size;
    protected int[] array;

    public DaySo(int n){
        size = n;
        array =new int[n];
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<size ;i++){
            System.out.print("A["+i+"] =");
            array[i] = input.nextInt();
        }
     }
     public void print(){
        System.out.print("Dãy số bao gồm: ");
        for(int i = 0; i<size ;i++){
            System.out.print(array[i] + " ");
        }
    }
}
