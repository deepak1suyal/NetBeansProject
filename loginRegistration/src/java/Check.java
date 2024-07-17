
import DB.DBCon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsuya
 */
public class Check {
    
    public static boolean login(String u,String p){
    try{
        String user=u;
        String pass=p;
        DBCon db=new  DBCon();
        db.pstmt=db.con.prepareStatement("Select*from register where uname=? and password=?");
        db.pstmt.setString(1, user);
        db.pstmt.setString(2, pass);
        db.rst=db.pstmt.executeQuery();
        return db.rst.next();
        
        }
        catch(Exception e){
             e.printStackTrace();
       }
        return false;
   }
    
    
}
