/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author PogiMerks
 */
public class UserDB {
    
    public void register(Damn oneUser){
        try {
            String query = "insert into users(name,password,email) values (?,?,?) ";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, oneUser.getName());
            pstmt.setString(2, oneUser.getPassword());
            pstmt.setString(3, oneUser.getEmail());
            pstmt.executeUpdate();
            System.out.println("Connected");
            DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean authenticate(Damn oneUser){
         boolean valid = false; 
         try {   
           
             String query = "select * from users where name = ? and password = ? and active = 1";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, oneUser.getName());
            pstmt.setString(2, oneUser.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                valid = true;
            }
            DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return valid;
    }
    
    public ArrayList<Damn> getList(Damn oneUser){
        ResultSet rs = null;
        ArrayList<Damn> searches = new ArrayList<>();
        try {   
            //DBConnectionFactory db = new DBConnectionFactory1();
             String query = "select * from users where name = ? and password = ?";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, oneUser.getName());
            pstmt.setString(2, oneUser.getPassword());
            rs = pstmt.executeQuery();
            while(rs.next()){
                Damn two = new Damn();
                two.setName(rs.getString("name"));
                two.setPassword(rs.getString("password"));
                searches.add(two);
            }
            
           DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return searches;
    }
  
}


