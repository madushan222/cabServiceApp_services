/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import static icbt.DBUtil.DB_URL;
import static icbt.DBUtil.PASS;
import static icbt.DBUtil.USER;
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
public class DBVehicle {
   static final String DB_URL = "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "";
   
    public boolean addCategory(Vehicle vehicle){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("INSERT INTO vehicle_type (type) VALUES ('"+vehicle.getCategory()+"')");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
    
  public List<Vehicle> getCategories(){
       List<Vehicle> categories = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM vehicle_type");
            
            while(resultSet.next())
            {
                Vehicle cat = new Vehicle();
                cat.setTypeId(resultSet.getInt("typeId"));
                cat.setCategory(resultSet.getString("type"));
                categories.add(cat);
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return categories;
   }
  
  public boolean deleteCategory(int typeId){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("DELETE FROM vehicle_type WHERE typeId = '"+typeId+"'");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
}
