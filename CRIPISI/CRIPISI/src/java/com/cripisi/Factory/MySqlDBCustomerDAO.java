/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Customer.Customer;
import com.cripisi.Customer.CustomerDAO;
import com.cripisi.User.User;
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
        try {   
            
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_GET_CUSTOMER_FORMDETAILS );
            pstmt.setInt(1, one.getUserId());
            rs = pstmt.executeQuery();
            while(rs.next()){
                Customer two = new Customer();
                two.setCustomerTin(rs.getInt("customerTin"));
                two.setCompanyAddress(rs.getString("companyAddress"));
                searches.add(two);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDbUserDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
        return searches.get(0);
    }
}
