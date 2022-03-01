/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de02kocolythuyet;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De02KoCoLyThuyet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("QLNV");
        f.add(new QLNVJPanel());
        f.setDefaultCloseOperation(3);
        f.pack();
        f.setVisible(true);
    }
    
}
