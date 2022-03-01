/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_stack;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class BT1_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của stack");
        int n = input.nextInt();
        StackDemo st = new StackDemo(n);
        st.Push(68);
        st.Push(99);
        st.Push(6);
        st.Output();
    }
    
}
