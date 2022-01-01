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
public class AccessNhanVien {
    private NhanVien nhanvien[];
    //so luong user hien dang duoc luu dia chi trong danh sach
    private int n;
    private int MAXN;
    //ham khoi tao

    public AccessNhanVien(int MAXN) {
        //Ham khoi tao nhan tham so so luong user toi da      
        this.MAXN = MAXN;
        nhanvien = new NhanVien[MAXN];
        n = 0;
    }
    //ham them user vao danh sach quan ly

    public void AddNV(NhanVien nv) {
        nhanvien[n] = nv;
        n++;
    }
    //ham tao user va luu dia chi user vao danh sach de quan ly 

    public void AddNV(String Manv, String hoten, String phong) {
        nhanvien[n] = new NhanVien(Manv, hoten, phong);
        n++;
    }

//    public Vector timKiem(String Manv)
//    {
//        return 0;
//    }
    
}
