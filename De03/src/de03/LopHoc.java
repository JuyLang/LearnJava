/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de03;

import java.util.ArrayList;

/**
 *
 * @author TrungCH
 */
public class LopHoc {
    protected ArrayList<SinhVien> danhSachSV = new ArrayList<>();
    protected int siSo;
    protected String tenLop;

    public LopHoc() {
    }

    public LopHoc(int siSo, String tenLop) {
        this.siSo = siSo;
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
    
}
