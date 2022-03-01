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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dec2Bin st = new Dec2Bin(5);
        System.out.println("Push Stack vd: 18,69,43,25,16");
        st.Push(18);
        st.Push(69);
        st.Push(43);
        st.Push(25);
        st.Push(16);
        st.Output();
        st.convertNum();
    }
    
}
