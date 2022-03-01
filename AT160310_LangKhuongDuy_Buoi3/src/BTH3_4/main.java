/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH3_4;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         String data;
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        
        writeToFile("xinchao.txt", data, false, false);
        
        System.out.println(readFromFile("xinchao.txt"));
    }
     static DataOutputStream dos;
     public static boolean writeToFile(String fileName, String dataLine,
            boolean isAppendMode, boolean isNewLine){
        if(isNewLine){
            dataLine = "\n" + dataLine;
        }
        
        try{
            File outFile = new File(fileName);
            if(isAppendMode){
                dos = new DataOutputStream(new FileOutputStream(fileName, true));
            }else{
                dos = new DataOutputStream(new FileOutputStream(outFile));
            }
            
            dos.writeBytes(dataLine);
            dos.close();
            
        }catch(FileNotFoundException ex){
            return false;
        }catch(Exception ex){
            return false;
        }
        return true;
        
    }
    
    static BufferedReader br;
    public static String readFromFile(String fileName) throws IOException{
        String dataLine = "";
        try{
            File inFile = new File(fileName);
            br = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
            dataLine = br.readLine();
            br.close();
        }catch(FileNotFoundException ex){
            return null;
        }catch(IOException ex){
            return null;
        }
        
        return dataLine;
    }
}
