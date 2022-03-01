/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class StackDemo {
    private int n; // Số Phần tử của Stack
    private int top; //HEAD của stack
    public int[] a;
    public StackDemo(int n) {
        top = -1;
        this.n = n;
        a = new int[n];
    }
    public boolean isEmpty() //kiểm tra có trống k
        {
            return top == -1;
        }
     public boolean isFull() // kiểm tra có đầy không
        {
            return top==n-1;
        }
       public void Push(int newelement) //thêm 
        {
            if (isFull() == false) ////nếu stack còn chỗ trống top++,a[top]=x
            {
                top = top + 1;
                a[top] = newelement;
            }
            else // nếu stack đầy
            {
                System.out.println("Stack bị đầy");
            }
        }
        public void Pop() // lấy ra 1 phần tử
        {
            if (!isEmpty())
            {
                top = top - 1;
            }
            else
            {
                System.out.println("Stack rỗng không lấy được");
            }
        }
        public void Output()
        {
            if (!isEmpty())
            {   
                for (int i = 0; i <= top; i++)
                    System.out.println(a[i]);
            }
            else
                System.out.println("Stack rỗng không có gì");
        }
        
        public void convertNum() {
              System.out.println("MENU");
	      System.out.println("1: conversion 10 => 2 ");
	      System.out.println("2: conversion 10 => 8");
	      System.out.println("3: conversion 10 => 16");
	      // do you want 1, 2 , or 3? you have your choice
	      Scanner in = new Scanner(System.in);
              int menu = in.nextInt();
              while(menu >= 3){
                  System.out.println("Hãy chọn lại 1,2,3");
                  menu = in.nextInt();             
              }
            switch (menu) { 
            case 1:
                for (int i = 0; i <= top; i++)
                    System.out.println(Integer.toBinaryString(a[i]) ); 
                break;
            case 2:
               for (int i = 0; i <= top; i++)
                    System.out.println(Integer.toHexString(a[i]));
                break;
            case 3:
                for (int i = 0; i <= top; i++)
                    System.out.println(Integer.toOctalString(a[i]));
                break;
            default:
                break;
        }
    }
}
