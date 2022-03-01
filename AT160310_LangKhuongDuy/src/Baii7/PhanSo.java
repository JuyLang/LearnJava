/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baii7;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class PhanSo {
    private int ts;
    private int ms;
    Scanner input = new Scanner(System.in);
    public PhanSo() {
       ts = 0;
       ms = 1;
    }
    public PhanSo(int ms, int ts) {
        this.ms = ms;
        this.ts = ts;
    }
    public void nhap(){
        System.out.println("Nhập vào tử số");
        ts = input.nextInt();
        System.out.println("Nhập vào mẫu số");
        ms = input.nextInt();
    }
    public void print() {
        System.out.println(ts + " / " + ms);
    }
    public PhanSo Cong(PhanSo b){
        PhanSo pTong =  new PhanSo();
        pTong.ms = ms * b.ms;
        pTong.ts = ts * b.ms + b.ts * ms;
        return toiGian(pTong);
    }
    public PhanSo Tru(PhanSo b){
        PhanSo pHieu = new PhanSo();
        pHieu.ms = ms * b.ms;
        pHieu.ts = ts * b.ms - b.ts * ms;

        return toiGian(pHieu);
    }
    public PhanSo nhan(PhanSo b) {
        PhanSo pNhan = new PhanSo();
        pNhan.ms = ms * b.ms;
        pNhan.ts = ts * b.ts;
        return toiGian(pNhan);
    }
    public PhanSo chia(PhanSo b) {
        PhanSo pChia = new PhanSo();
        pChia.ts = ts * b.ms;
        pChia.ms = ms * b.ts;
        return toiGian(pChia);
    }
    public PhanSo DoiDau(PhanSo b){
        PhanSo pDoidau = new PhanSo();
        pDoidau.ts = ts ;
        pDoidau.ms = ms * (-1);
        return toiGian(pDoidau);
    }
     public PhanSo nghichDao(PhanSo b){
        PhanSo pnghichDao = new PhanSo();
        pnghichDao.ts = ts ;
        pnghichDao.ms = ms * (-1);
        return toiGian(pnghichDao);
    }
    public PhanSo toiGian(PhanSo b) {
        PhanSo pToiGian = new PhanSo();
        int x = Math.abs(b.ts);
        int y = Math.abs(b.ms);
        int r = 0;
        while (y > 0) {
            r = x % y;
            x = y;
            y = r;
        }

        pToiGian.ms = b.ms / x;
        pToiGian.ts = b.ts / x;

        return pToiGian;
    }
     public String soSanhBang(PhanSo b) {
        if (ts * b.ms == b.ts * ms) {
            return "bang";
        }
        return "khong bang";
    }

    public String lonHon(PhanSo p2) {
        if (ts * p2.ms > p2.ts * ms) {
            return "lon hon";
        }
        return "khong lon hon";
    }

    public String nhoHon(PhanSo b) {
        if (ts * b.ms < b.ts * ms) {
            return "nho hon";
        }
        return "khong nho hon";
    }
}
