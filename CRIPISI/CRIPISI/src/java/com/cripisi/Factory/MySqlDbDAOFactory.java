/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Employee.EmployeeDAO;

import com.cripisi.User.UserDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deathman28
 */
public class MySqlDbDAOFactory extends DAOFactory {
       private static final String username="root";
       private static final String password="omegaman123";
       private static final String url="jdbc:mysql://localhost:3306/mydb";
       private static final String driverName="com.mysql.jdbc.Driver";  
    
       public static Connection createConnection() {
           try {
            Class.forName(driverName);
            Connection conn = 
                    DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MySqlDbDAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
       
    /**
     *
     * @return
     */
    @Override
  public UserDAO getUserDAO() {
    // OracleDbCustomerDAO implements CustomerDAO
    return new MySqlDbUserDAO();
  }
  
       @Override
  public EmployeeDAO getEmployeeDAO(){
      return new MySqlDBEmployeeDAO();
  }
  
    
}
