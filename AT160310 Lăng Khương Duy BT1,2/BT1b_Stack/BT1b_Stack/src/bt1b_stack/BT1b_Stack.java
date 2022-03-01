/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1b_stack;

/**
 *
 * @author langk
 */
public class BT1b_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackDemo st = new StackDemo(5);
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
