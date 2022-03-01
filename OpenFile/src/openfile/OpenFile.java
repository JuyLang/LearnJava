/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openfile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author langk
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream ("E:/khuongduy.txt");
            DataInputStream dis=new DataInputStream(fis);

            int n=dis.readInt();
            double m=dis.readDouble();

            fis.close();
            dis.close();

            System.out.println("So nguyen:  "+n);
            System.out.println("So thuc:    "+m);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
