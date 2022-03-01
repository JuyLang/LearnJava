/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author langk
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
