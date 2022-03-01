/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Matran {
    private int m; // so hang
    private int n; // so cot
    private int[][] a;
    public Matran() {
        m = 0;
        n = 0;
        a = new int[m][n];
    }
    public Matran(int m, int n) {
        this.m = m;
        this.n = n;
        a = new int[m][n];
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhap vao so hang: ");
        m = sc.nextInt();
        System.out.print("Nhap vao so cot: ");
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println("Nhap vao gia tri cho ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\tPhan tu thu [" + (i) + "][" + (j)
                        + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }
     public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public Matran cong(Matran mt2) {
        Matran mtTong = new Matran(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtTong.a[i][j] = a[i][j] + mt2.a[i][j];
            }
        }

        return mtTong;
    }
     public Matran hieu(Matran mt2) {
        Matran mtTru = new Matran(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtTru.a[i][j] = a[i][j] - mt2.a[i][j];
            }
        }

        return mtTru;
    }

    // Nhan 2 ma tran
    public Matran tich(Matran mt2) {
        Matran mtTich = new Matran(m, mt2.n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < mt2.n; j++) {
                mtTich.a[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mtTich.a[i][j] += a[i][k] * mt2.a[k][j];
                }
            }
        }

        return mtTich;
    }

    // Chuyen vi ma tran
    public Matran chuyenVi() {
        Matran mtTran = new Matran(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtTran.a[i][j] = a[j][i];
            }
        }

        return mtTran;
    }

    public Matran doiDau() {
        Matran mtTran = new Matran(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtTran.a[i][j] = -a[j][i];
            }
        }
        return mtTran;
    }

    public void tuongThich(Matran mt2) {
        if (m == mt2.m && n == mt2.n) {
            System.out.println("tuong thich");
        } else {
            if (m == mt2.m || n == mt2.n) {
                System.out.println("tuong thich 1 phan");
            } else {
                System.out.println("ko tuong thich");
            }
        }
    }

// Kiem tra ma tran vuong
    public boolean maTranVuong() {
        return (m == n ? true : false);
    }

    // Tinh tong phan tu tren hang h
    public int tongHangK(int k) {
        int s = 0;

        for (int i = 0; i < n; i++) {
            s += a[k - 1][i];
        }

        return s;
    }

    // Tinh tong phan tu tren cot c
    public int tongCotK(int k) {
        int s = 0;

        for (int i = 0; i < m; i++) {
            s += a[i][k - 1];
        }

        return s;
    }

    public int yenNgua() {

        int min = a[1][0];
        int ktr = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                    ktr = j;
                }
            }

            int max = min;

            for (int j = 1; j < m; j++) {
                if (max < a[j][ktr]) {
                    max = a[j][ktr]; //kiem tra lon nhat cot
                }
            }
            if (max == min) {
                return max; 
            }
        }
        return 0;
    }
}
