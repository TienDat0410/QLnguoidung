/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNhanVien;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author TienDat
 */
public class NhanVien {

    private String MaNV;
    private String Hoten;
    private String Phong;

    //constructor
    public NhanVien(String MaNV, String Hoten, String Phong) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.Phong = Phong;
    }

    //
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }
    //
    public boolean checkUser(String MaNV) 
    {
        return MaNV.equals(this.MaNV);
    }
    public Vector hienThiRow() {
        Vector row = new Vector();
        row.add(Hoten);
        row.add(this.Phong);       
        return row;
    }   

}
