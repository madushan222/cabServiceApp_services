/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shanr
 */
public class DBUtil {
   static final String DB_URL = "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "";
   
   public boolean addAdmin(Admin admin){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("INSERT INTO user (fName,lName,nic,dob,email,username,password,userType,mobile,branchId) VALUES ('"+admin.getfName()+"','"+admin.getLname()+"','"+admin.getNic()+"','"+admin.getDob()+"','"+admin.getEmail()+"','"+admin.getUsername()+"','"+admin.getPassword()+"','ADMIN','"+admin.getMobile()+"','"+admin.getBranchId()+"')");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
   
    public List<Admin> getAdmins(){
       List<Admin> admins = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userType = 'ADMIN'");
            
            while(resultSet.next())
            {
                Admin adm = new Admin();
                adm.setUserId(resultSet.getInt("userId"));
                adm.setfName(resultSet.getString("fName"));
                adm.setfName(resultSet.getString("fName"));
                adm.setLname(resultSet.getString("lName"));
                adm.setDob(resultSet.getString("dob"));
                adm.setEmail(resultSet.getString("email"));
                adm.setMobile(resultSet.getInt("mobile"));
                adm.setNic(resultSet.getString("password"));
                adm.setBranchId(resultSet.getInt("branchId"));
                admins.add(adm);
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return admins;
   }

   public boolean deleteAdmin(int userId){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("DELETE FROM user WHERE userId = '"+userId+"'");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
   
   public Admin getAdmin(int userId){
       Admin admin = new Admin();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userId = '"+userId+"'");
            
            resultSet.next();
            admin.setUserId(resultSet.getInt("userId"));
            admin.setfName(resultSet.getString("fName"));
            admin.setLname(resultSet.getString("lName"));
            admin.setDob(resultSet.getString("dob"));
            admin.setEmail(resultSet.getString("email"));
            admin.setMobile(resultSet.getInt("mobile"));
            admin.setNic(resultSet.getString("nic"));
            admin.setBranchId(resultSet.getInt("branchId"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
                    
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return admin;
   }
   
    public boolean updateAdmin(Admin admin){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("UPDATE user SET fName = '"+admin.getfName()+"',lName = '"+admin.getLname()+"',nic = '"+admin.getNic()+"',dob = '"+admin.getDob()+"',email = '"+admin.getEmail()+"',username = '"+admin.getUsername()+"',password = '"+admin.getPassword()+"',mobile = '"+admin.getMobile()+"',branchId = '"+admin.getBranchId()+"' WHERE userId = '"+admin.getUserId()+"'");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
}
