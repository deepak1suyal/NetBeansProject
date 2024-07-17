/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author dsuya
 */
package DB;
import java.sql.*;
public class DBCon {
    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
     public ResultSet rst;
     public DBCon()
     {
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
     } 
     catch(Exception e){
     e.printStackTrace();
     }
     }
     
}
