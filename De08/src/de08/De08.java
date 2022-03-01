/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de08;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("thong tin cau thu");
        f.add(new ThongSinhJpanel());
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
  
    
}
