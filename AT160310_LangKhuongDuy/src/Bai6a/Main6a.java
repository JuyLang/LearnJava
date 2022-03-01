/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6a;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main6a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        SoPhuc cong;
        SoPhuc hieu;
        SoPhuc chia;
        SoPhuc nghichDao;
        p1.input();
        p1.output();
        p2.input();
        p2.output();
        cong = p1.cong(p2);
        hieu = p1.hieu(p2);
        chia = p1.chia(p2);
        nghichDao = p1.nghichDao();
        System.out.println("tong 2 so phuc");
        cong.output();
        System.out.println("hieu 2 so phuc");
        hieu.output();
        System.out.println("thuong 2 so phuc");
        chia.output();
        System.out.println("nghich dao so thu nhat ");
        nghichDao.output();
        System.out.println("so thu nhat " + p1.soSanhBang(p2) + " so thu hai");
        p1.lonHon(p2);
        p1.nhoHon(p2);
    }
    
}
