/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1b_Bai2;

/**
 *
 * @author langk
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.Push(18);
        st.Push(69);
        st.Push(43);
        st.Push(25);
        st.Push(16);
        st.Output();
//        st.Push(1);
//        st.Push(6);
//        st.Push(8);
//        st.Push(9);
        // đưa 1,6,8,9 bị tràn
        st.convertNum();
    }
    
}
