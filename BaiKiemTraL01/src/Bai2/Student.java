/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author langk
 */
public class Student extends Person{
    private double mh1;
    private double mh2;

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }
    
    public Student() {
    }
    public Student(double mh1, double mh2, String Hoten, String Diachi) {
        super(Hoten, Diachi);
        this.mh1 = mh1;
        this.mh2 = mh2;
    }
    public double average(){
        return (mh1+mh2)/2;
    }
    public void evaluate(){
        if(8 >= average() && 10<=average()){
            System.out.println("Giỏi");
        }
        else if( 6>= average() && 8<=average()){
            System.out.println("Khá");
        }
        else{
              System.out.println("Trung bình");  
            }                       
    }

    @Override
    public String toString() {
        return "Student{" + input() + "mh1=" + mh1 + ", mh2=" + mh2 + "dtb"+average()+ '}';
    }
    
   
}
