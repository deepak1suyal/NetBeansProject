/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsuya
 */
public class regis {
    public static void insert(String u,String p,String g){
    try{
            String user=u;
            String pass=p;
            String gm=g;
          


            DB.DBCon d =new DB.DBCon();
          
            d.pstmt=d.con.prepareStatement("insert into register values(?,?,?)");
            d.pstmt.setString(1, user);
            d.pstmt.setString(2, gm);
            d.pstmt.setString(3, pass);
           
            d.pstmt.executeUpdate();
            
            
            
             
          
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
