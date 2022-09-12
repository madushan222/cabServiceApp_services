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

/**
 *
 * @author shanr
 */
public class DBLogin {
   static final String DB_URL = "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "";
   
      public Login Login(Login login){
       Login lg = new Login();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE username = '"+login.getUserName()+"' AND password = '"+login.getPassword()+"'");
            
            if(resultSet.next())
            {
              lg.setUserType(resultSet.getString("userType"));
            }
            else
            {
              lg.setUserType("NONE");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return lg;
   }
}
