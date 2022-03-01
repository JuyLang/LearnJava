/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt_openfile;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author langk
 */
public class LT_OpenFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
public static void main(String[] args) throws FileNotFoundException, IOException {
     try{
            FileOutputStream fos= new FileOutputStream("E:/khuongduy.txt");
            DataOutputStream dos=new DataOutputStream(fos);

            dos.writeInt(100);
            dos.writeDouble(9.5);

            fos.close();
            dos.close();
            System.out.println("Ghi thanh cong");
        }catch (IOException ex){
            ex.printStackTrace();
        }
}
}
