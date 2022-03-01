/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Vecto {
  private int sh;
    private int vecto[];

    public Vecto() {
        sh = 0;
        vecto = new int[sh];
    }

    public Vecto(int n) {
        sh = n;
        vecto = new int[n];
    }

    public Vecto cong(Vecto v2) {
        Vecto vTong = new Vecto(sh);

        for (int i = 0; i < sh; i++) {
            vTong.vecto[i] = vecto[i] + v2.vecto[i];
        }
        return vTong;
    }

    public Vecto hieu(Vecto v2) {
        Vecto vHieu = new Vecto(sh);

        for (int i = 0; i < sh; i++) {
            vHieu.vecto[i] = vecto[i] - v2.vecto[i];
        }
        return vHieu;
    }

    public int tichVoHuong(Vecto v2) {
        int tichVoHuong = 0;

        for (int i = 0; i < sh; i++) {
            tichVoHuong += vecto[i] + v2.vecto[i];
        }
        return tichVoHuong;
    }

    public void print() {
//        System.out.println("toa do vecto la");
        for (int i = 0; i < sh; i++) {
            System.out.print(vecto[i] + ", ");
        }
        System.out.println();
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap vao so pt: ");
        sh = sc.nextInt();
        vecto = new int[sh];
        System.out.println("Nhap vao gia tri cho vecto: ");
        for (int i = 0; i < sh; i++) {

            System.out.print("\tPhan tu thu [" + (i) + "]: ");
            vecto[i] = sc.nextInt();
        }
    }

    public String vuongGoc(Vecto v2) {
        if (tichVoHuong(v2) == 0) {
            return "vuong goc";
        }
        return "khong vuong goc";
    }

    public Vecto tich(int k) {
        Vecto vTich = new Vecto(sh);

        for (int i = 0; i < sh; i++) {
            vTich.vecto[i] = k * vecto[i];
        }
        return vTich;
    }

    public double doDai() {
        double k = 0;
        for (int i = 0; i < sh; i++) {
            k += vecto[i] * vecto[i];
        }
        k = (double) Math.sqrt(k);
        return k;
    }

    public Vecto chuanHoa() {
        double doDai = doDai();
        Vecto vChuanHoa = new Vecto(sh);

        for (int i = 0; i < sh; i++) {
            vChuanHoa.vecto[i] = (int) (vecto[i] / doDai);
        }
        return vChuanHoa;
    }  
}
