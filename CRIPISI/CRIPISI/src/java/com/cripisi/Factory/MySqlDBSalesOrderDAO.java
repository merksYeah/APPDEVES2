/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Customer.Customer;
import com.cripisi.Product.Product;
import com.cripisi.SalesOrder.SalesOrder;
import com.cripisi.SalesOrder.SalesOrderDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Dea
 */
public class MySqlDBSalesOrderDAO implements SalesOrderDAO{
     
    private static final String SQL_GET_ALL_ORDERED_PRODUTS="select * from products_has_sales_order where salesorderid=?";
    private static final String SQL_NEW_SALES_ORDER="insert into salesorder(customer_tin, deliver_to, order_date) values (?,?,?)";
    private static final String SQL_ADD_PRODUCTS_TO_SALES_ORDER="insert into salesorder_has_product (productCode, salesorderid, orderQuantity) values(?,?,?)";
    private static final String SQL_GET_ALL_SALES_ORDER="select * from salesorder where clientid=?";
    private static final String SQL_UPDATE_SALES_ORDER="update salesorder set status=?";
    private static final String SQL_GET_CUSTOMER_ORDERS = "select SalesOrderId,deliver_to,date_issued,order_date,date_delivered,statusCode from salesorder where customer_tin = ?";
    private static final String SQL_GET_ORDER_ORDERDETAILS ="SELECT productCode,orderQuantity FROM salesorder_has_product where SalesOrderId = ?";
    
    @Override
    public ArrayList<Product> getOrderedProducts(SalesOrder so){
        ResultSet rs = null;
        ArrayList<Product> productsList = new ArrayList<>();
        try {
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_GET_ALL_ORDERED_PRODUTS);
            pstmt.setInt(1, so.getOrder_id());
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                Product prod = new Product();
                prod.setProductCode(rs.getString("ProductID"));
                prod.setQuantity(rs.getInt("OrderQty"));
                productsList.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
       return productsList;
    }
    
    @Override
    public int newSalesOrder(SalesOrder so) {
        ResultSet rs = null;
        boolean value = false;
        int key = 0;
        Connection conn = MySqlDbDAOFactory.createConnection();
        try {
                conn.setAutoCommit(false);
                PreparedStatement pstmt = conn.prepareStatement(SQL_NEW_SALES_ORDER,PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setInt(1, so.getCustomer_tin());
                pstmt.setString(2, so.getDeliver_to());
                pstmt.setDate(3, so.getOrder_date());
                pstmt.executeUpdate();
                rs = pstmt.getGeneratedKeys();
                conn.commit();
                if(rs.next()){
                value = true;
                key = rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    conn.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
       
        if(value){
             return key;
        }
        else
            return 0;
       
        }
    
    
    @Override
    public void addProducts(SalesOrder so){
        String[] product = so.getProducts();
        String[] quantity = so.getQuantity();
        Connection conn = MySqlDbDAOFactory.createConnection();
        try {            
             PreparedStatement pstmt = conn.prepareStatement(SQL_ADD_PRODUCTS_TO_SALES_ORDER);
               conn.setAutoCommit(false);
                for (int i=0; i<product.length; i++){
                    pstmt.setString(1, product[i]);
                    pstmt.setInt(2, so.getOrder_id());
                    pstmt.setInt(3, Integer.parseInt(quantity[i]));
                    pstmt.addBatch();
            }
               	pstmt.executeBatch();
        	conn.commit();

            } catch (SQLException ex) {
                Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    conn.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
    }

    @Override
    public ArrayList<SalesOrder> getAllSalesOrder() {
    ResultSet rs = null;
        ArrayList<SalesOrder> salesOrderList = new ArrayList<>();
        try {   
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_GET_ALL_SALES_ORDER);
            rs = pstmt.executeQuery();
            while(rs.next()){
                SalesOrder so = new SalesOrder();
                so.setOrder_id(rs.getInt("SalesOrderID"));
                so.setClientID(rs.getInt("clientID"));
                so.setDeliver_to(rs.getString("deliver_to"));
                so.setComments(rs.getString("comments"));                        
               // so.setFlag(rs.getInt("flag"));
                salesOrderList.add(so);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(SalesOrder.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         return salesOrderList;
    }
    
    public void updateSalesOrder(SalesOrder so){
        try {
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_UPDATE_SALES_ORDER );
            //pstmt.setInt(1, so.getStatus());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDBEmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBEmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    @Override
    public ArrayList<SalesOrder> getSalesOrdersByCustomer(Customer one) {
        ResultSet rs = null;
         ArrayList<SalesOrder> orderList = new ArrayList<SalesOrder>();
          Connection conn = MySqlDbDAOFactory.createConnection();
           try {            
             PreparedStatement pstmt = conn.prepareStatement(SQL_GET_CUSTOMER_ORDERS );
                pstmt.setInt(1,one.getCustomerTin());
               	rs = pstmt.executeQuery();
                while(rs.next()){
                    SalesOrder two = new SalesOrder();
                    two.setOrder_id(rs.getInt("SalesOrderId"));
                    two.setDeliver_to(rs.getString("deliver_to"));
                    two.setDate_issued(rs.getDate("date_issued"));
                    two.setOrder_date(rs.getDate("order_date"));
                    two.setDate_delivered(rs.getDate("date_delivered"));
                    two.setStatusCode(rs.getString("statusCode"));
                    orderList.add(two);
                }
        	

            } catch (SQLException ex) {
                Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    conn.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
           return orderList;
    }

    @Override
    public ArrayList<Product> getOrderDetailsByOrder(SalesOrder so) {
       ResultSet rs = null;
         ArrayList<Product> productList = new ArrayList<Product>();
          Connection conn = MySqlDbDAOFactory.createConnection();
           try {            
             PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ORDER_ORDERDETAILS );
                pstmt.setInt(1,so.getOrder_id());
               	rs = pstmt.executeQuery();
                while(rs.next()){
                    Product two = new Product();
                    two.setProductCode(rs.getString("productCode"));
                    two.setQuantity(rs.getInt("orderQuantity"));
                    productList.add(two);
                }
        	

            } catch (SQLException ex) {
                Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    conn.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDBSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
           return productList;
    }
}
