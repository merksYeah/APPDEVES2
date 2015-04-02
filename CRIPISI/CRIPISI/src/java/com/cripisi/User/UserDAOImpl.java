/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.User;

import db.DBConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deathman28
 */

public class UserDAOImpl implements UserDAO {
    private static final String SQL_GET_ALL_USERS  = "select * from user";
    private static final String SQL_AUTHENTICATE_A_USER  = "select * from user where username = ? and password = ? and flag = 1";
    private static final String SQL_UPDATE_ENABLE_USER  = "update user set flag = 1 where userID = ?";
    private static final String SQL_UPDATE_DISABLE_USER  = "update user set flag = 0 where userID = ?";
    private static final String SQL_CHANGE_PASSWORD_USER = "update user set password = ? where userID = ?";
    private static final String SQL_INSERT_NEW_USER = "insert into user(username,password) values (?,?)";
    private static final String SQL_GET_RIGHTS = "select a.action, a.flag"+
                                                 "from user u join user_has_group ug on u.userId = ug.userId"+
                                                  "join memberof g on g.groupId = ug.groupId"+
                                                    "join role r on r.groupId = g.groupId"+
                                                    "join action a on a.roleId = r.roleId"+
                                                    "where username = ? and password = ?";
    
    /** Get a list of user accounts for system administrators
     * @return 
     */
    @Override
    public ArrayList<User> getAllUsers(){
         ResultSet rs = null;
        ArrayList<User> userList = new ArrayList<>();
        try {   
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_GET_ALL_USERS);
            rs = pstmt.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("userID"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFlag(rs.getInt("flag"));
                userList.add(user);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         return userList;
    }
    
    /**
     * 
     *Authenticate a user account in the database via the username and password sent from the browser 
     * 
     */
     
    @Override
    public HashMap<String,Integer> login(User user1){
        boolean valid = false; 
        HashMap<String,Integer> rights = new HashMap<String,Integer>();
         try {   
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_GET_RIGHTS);
            pstmt.setString(1, user1.getUsername());
            pstmt.setString(2, user1.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                valid = true;
                rights.put(rs.getString("action"), rs.getInt("flag"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if(valid){
              return rights;
         }
         else
         {
             return null;
         }
        
    }

    /**
     * 
     * Enables a deactivated user account setting the flag column to 1 in the user table via the userID
     */    
    @Override
    public void enableUser(User user1){
        try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_UPDATE_ENABLE_USER);
            pstmt.setInt(2, user1.getUserId());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    /**
     * 
     *Disables an active user account setting the flag column to 0 in the user table via the userID
     * 
     */    
    @Override
    public void disableUser(User user1){
        try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_UPDATE_DISABLE_USER);
            pstmt.setInt(1, user1.getUserId());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    /**
     * 
     *Changes password of an active user account setting the password column to a desired password in the user table via the userID
     * 
     */   
    @Override
    public void changePassword(User user1){
         try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_CHANGE_PASSWORD_USER);
            pstmt.setString(1, user1.getPassword());
            pstmt.setInt(2, user1.getUserId());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    } 
    
    /**
     * 
     *Creates a new user account in the user table
     * 
     */   
    @Override
    public void insertUser(User user1){
        try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_INSERT_NEW_USER );
            pstmt.setString(1, user1.getUsername());
            pstmt.setString(2, user1.getPassword());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    /**
     * 
     *Searches for a user account via its unique ID
     * 
     */  
    @Override
    public User getUserById(User user1){
         ResultSet rs = null;
        ArrayList<User> searches = new ArrayList<>();
        try {   
             String query = "select * from users where name = ? and password = ?";
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmt.setString(1, user1.getUsername());
            pstmt.setString(2, user1.getPassword());
            rs = pstmt.executeQuery();
            while(rs.next()){
                User two = new User();
                two.setUsername(rs.getString("name"));
                two.setPassword(rs.getString("password"));
                searches.add(two);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        
    }
         return searches.get(0);
    }
    
}
