/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1_sinhvien;

/**
 *
 * @author langk
 */
public class Student {
    private String Hoten;
    private String Gioitinh;
    private String Diachi;
    private String email;
    private String phoneName;
    private float hocphi;

    public Student() {
    }

    public Student(String Hoten, String Gioitinh, String Diachi, 
            String email, String phoneName, float hocphi) {
      
        this.Hoten = Hoten;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        this.email = email;
        this.phoneName = phoneName;
        this.hocphi = hocphi;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        return "Student{"  + ", Hoten=" + Hoten + ", Gioitinh="
                + Gioitinh + ", Diachi=" + Diachi + ", email=" + email + 
                ", phoneName=" + phoneName + ", hocphi=" + hocphi + '}';
    }
    void study(String monhoc){
        System.out.println("Sinh viên "+this.Hoten+" đang đi học môn "+monhoc);
    }
    void tuiTion(){
        System.out.println("Sinh viên "+this.Hoten+ "có học phí là "+
                this.hocphi);
    }
}
