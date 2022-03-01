/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01kocolithuyet;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De01KoCoLiThuyet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("QLSV");
        f.add(new QLSVJPane());
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
}
