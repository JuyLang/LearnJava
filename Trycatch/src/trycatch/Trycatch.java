/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Nhập vào một số yêu thích");
            int a = Integer.valueOf( input.nextLine());
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
               
        
    } 
}
