/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01hanghoa;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class DienThoai extends HangHoa implements Serializable {
    private static long serialVersionUID = 1232345L;
    protected String nhaSX;
    protected String dungLuongBN;
    protected String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSX, String dungLuongBN, String mauSac, String maHang, String tenHang, float giaBan) {
        super(maHang, tenHang, giaBan);
        this.nhaSX = nhaSX;
        this.dungLuongBN = dungLuongBN;
        this.mauSac = mauSac;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getDungLuongBN() {
        return dungLuongBN;
    }

    public void setDungLuongBN(String dungLuongBN) {
        this.dungLuongBN = dungLuongBN;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    public String toString(){
     return super.toString() +("\nNhaSX: "+this.getNhaSX()+"\nDungLuongBoNho: "+this.getDungLuongBN()+"\nMauSac: "+this.getMauSac());
    }
}
