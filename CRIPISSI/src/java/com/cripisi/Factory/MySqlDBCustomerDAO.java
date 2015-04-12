/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Customer.Customer;
import com.cripisi.Customer.CustomerDAO;
import com.cripisi.User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deathman28
 */
public class MySqlDBCustomerDAO implements CustomerDAO {
     private static final String SQL_GET_CUSTOMER_FORMDETAILS = "select customerTin, companyAddress from customer where userId = ?";
    
    @Override
    public Customer getCustomerOrderDetails(Customer one) {
       ResultSet rs = null;
       ArrayList<Customer> searches = new ArrayList<Customer>();
       Connection conn = MySqlDbDAOFactory.createConnection();
        try {   
            conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement( SQL_GET_CUSTOMER_FORMDETAILS );
            pstmt.setInt(1, one.getUserId());
            rs = pstmt.executeQuery();
            while(rs.next()){
                Customer two = new Customer();
                two.setCustomerTin(rs.getInt("customerTin"));
                two.setCompanyAddress(rs.getString("companyAddress"));
                searches.add(two);
            }
            conn.commit();
        } catch (SQLException ex) {
           try {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
               conn.rollback();
           } catch (SQLException ex1) {
               Logger.getLogger(MySqlDBCustomerDAO.class.getName()).log(Level.SEVERE, null, ex1);
           }
        }finally{
             try {
                 conn.close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDbUserDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
        return searches.get(0);
    }
}
