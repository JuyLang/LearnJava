/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicanbo;

import java.util.Date;

/**
 *
 * @author langk
 */
public class Nhanviengiupviec extends CanBo{
    private String Congviec;

    public Nhanviengiupviec() {
    }

    public Nhanviengiupviec(String Congviec, String Hoten, Date NgaySinh, String GioiTinh, String DiaChi) {
        super(Hoten, NgaySinh, GioiTinh, DiaChi);
        this.Congviec = Congviec;
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String Congviec) {
        this.Congviec = Congviec;
    }
    
}
