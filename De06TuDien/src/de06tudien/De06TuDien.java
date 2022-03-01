/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06tudien;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De06TuDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TuDienPanel td = new TuDienPanel();
        td.thongBao2();
        JFrame f = new JFrame("Dictionary");
        f.add(td);
        f.pack();
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        
    }
    
}
