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
public class NhanVienHD extends NhanVien {
    private double LuongHD;
    private String LoaiHD;   
    public NhanVienHD(String MaNV, String Hoten, String Phong) {
        super(MaNV, Hoten, Phong);
    }
    public NhanVienHD(String MaNV, String Hoten, String Phong, double LuongHD, String LoaiHD) {
        super(MaNV, Hoten, Phong);
        this.LuongHD = LuongHD;
        this.LoaiHD = LoaiHD;
    }
    @Override
    public Vector hienThiRow() {
        Vector row = new Vector();
        super.hienThiRow();
        row.add(this.LuongHD);
        row.add(this.LoaiHD);
        return row;
    }   
}
