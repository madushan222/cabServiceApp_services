/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author shanr
 */
public class DBUtil {
   static final String DB_URL = "jdbc:mysql://localhost:3306/gocheeta";
   static final String USER = "root";
   static final String PASS = "";
   
   public boolean addAdmin(Admin admin){
       int rowAffected = 0;
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("INSERT INTO 'user' VALUES ("+admin.getfName()+",'"+admin.getLname()+","+admin.getNic()+","+admin.getDob()+","+admin.getEmail()+","+admin.getUsername()+","+admin.getPassword()+","+admin.getMobile()+","+admin.getBranchId()+")");
            
        }catch(Exception e){
            System.out.print(e);
        }
       return rowAffected > 0;
   }
}
