/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNhanVien;

import java.util.Vector;

/**
 *
 * @author TienDat
 */
public class NhanvienBC extends NhanVien{  
    private String Hesoluong;
    private int Namct;
    //
    public NhanvienBC(String MaNV, String Hoten, String Phong, String Hesoluong, int Namct) 
    {
        super(MaNV, Hoten, Phong);
        this.Hesoluong = Hesoluong;
        this.Namct = Namct;
    }
    
    public NhanvienBC(String MaNV, String Hoten, String Phong) 
    {
        super(MaNV, Hoten, Phong);
    }
    @Override
    public Vector hienThiRow() {
        Vector row = new Vector();
        super.hienThiRow();
        row.add(this.Hesoluong);
        row.add(this.Namct);
        return row;
    }   
    
}
