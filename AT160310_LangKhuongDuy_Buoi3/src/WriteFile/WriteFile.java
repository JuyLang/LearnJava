/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author langk
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("E:\\JAVA HVKTMM\\AT160310_LangKhuongDuy_Buoi3\\khuongduy.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.write(10000);
            fos.close();
            dos.close();
            System.out.println("Ghi thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
