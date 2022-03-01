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
public class SoPhuc {
    Scanner input =  new Scanner(System.in);
    private float pt;
    private float pa;
    public SoPhuc() {
    }
    
    public SoPhuc(float pt, float pa) {
        this.pt = pt;
        this.pa = pa;
    }
    public void input() {
        System.out.print("Nhap vao phan thuc: ");
        pt = input.nextInt();
        System.out.print("Nhap vao phan ao: ");
        pa = input.nextInt();
    }
    public void output() {
        System.out.println(pt + " + " + pt + "i");
    }

    /**
     *
     * @param p2
     * @return
     */
    public SoPhuc cong(SoPhuc p2){
        SoPhuc pTong = new SoPhuc();
        pTong.pt = pt + p2.pt;
        pTong.pa = pa + p2.pa;
        return pTong;
    }
    public SoPhuc hieu(SoPhuc p2){
        SoPhuc pHieu = new SoPhuc();
        pHieu.pt = pt + p2.pt;
        pHieu.pa = pa + p2.pa;
        return pHieu;
    }
    public SoPhuc chia(SoPhuc p2){
        SoPhuc pChia = new SoPhuc();
        pChia.pt = ((pt * p2.pt) + (pa * p2.pa)) / ((p2.pt * p2.pt)
                + (p2.pa * p2.pa));
        pChia.pa = -((pt * p2.pa) - (pa * p2.pt)) / ((p2.pt * p2.pt)
                + (p2.pa * p2.pa));

        return pChia;
    }
    public String soSanhBang(SoPhuc p2) {
        if (pt == p2.pt && pa == p2.pa) {
            return "bang";
        }
        return "khong bang";
    }
     public SoPhuc nghichDao() {
        SoPhuc pNghichDao = new SoPhuc();
        pNghichDao.pt = pt * (1 / ((pt * pt) + (pa * pa)));
        pNghichDao.pa = -pa * (1 / ((pt * pt) + (pa * pa)));

        return pNghichDao;
    }
    public void lonHon(SoPhuc p2) {
        System.out.println("ko so sanh dc 2 so phuc khi ko bang nhau");
    }

    public void nhoHon(SoPhuc p2) {
        System.out.println("ko so sanh dc 2 so phuc khi ko bang nhau");
    }
}
