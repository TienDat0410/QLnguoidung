/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNhanVien;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author TienDat
 */
public class MyConnection {
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            String url = "jdbc:mysql://localhost:3306/qlnhanvien?user=root&password=";
            Connection con = DriverManager.getConnection(url);           
            return con;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
