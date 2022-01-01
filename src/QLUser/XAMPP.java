/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLUser;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TienDat
 */
public class XAMPP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/qltaikhoan?user=root&password=";
        try(Connection conn = DriverManager.getConnection(url))
        {
            System.out.println("thành công");
            System.out.print(conn.getCatalog());
        } catch (Exception e) {
            Logger.getLogger(XAMPP.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }
    
}
