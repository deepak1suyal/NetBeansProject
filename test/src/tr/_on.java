/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dsuya
 */
public class con {
    public Connection co;
    public static void main(String[] args){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
   Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root","root");
    if(co!=null){
        System.out.println("successfully connected");
    }
    }   catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(con.class.getName()).log(Level.SEVERE, null, ex);
        }}
}
