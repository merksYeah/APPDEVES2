/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Product.Product;
import com.cripisi.SalesOrder.SalesOrder;
import com.cripisi.SalesOrder.SalesOrderDAO;
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
public class MySqlDbSalesOrderDAO implements SalesOrderDAO{
     
    private static final String SQL_GET_ALL_ORDERED_PRODUTS="select * from products_has_sales_order where salesorderid=?";
    private static final String SQL_NEW_SALES_ORDER="insert into salesoorder(salesorderint, clientid, status, deliver_to, comments) values (?,?,?,?,?)";
    private static final String SQL_ADD_PRODUCTS_TO_SALES_ORDER="insert into product_has_sales_order values(productid, salesorderid, orderqty) values(?,?,?)";
    private static final String SQL_GET_ALL_SALES_ORDER="select * from salesorder where clientid=?";
    private static final String SQL_UPDATE_SALES_ORDER="update salesorder set status=?";
    
    @Override
    public ArrayList<Product> getOrderedProducts(SalesOrder so){
        ResultSet rs = null;
        ArrayList<Product> productsList = new ArrayList<>();
        try {
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_GET_ALL_ORDERED_PRODUTS);
            pstmt.setInt(1, so.getSalesOrderID());
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                Product prod = new Product();
                prod.setProductCode(rs.getInt("ProductID"));
                prod.setQuantity(rs.getInt("OrderQty"));
                productsList.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
       return productsList;
    }
    
    @Override
    public void newSalesOrder(SalesOrder so) {
        try {
            
                PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_NEW_SALES_ORDER);
                pstmt.setInt(1, so.getSalesOrderID());
                pstmt.setInt(2, so.getClientID());
                pstmt.setInt(3, so.getStatus());
                pstmt.setString(4, so.getDeliver_to());
                pstmt.setString(5, so.getComments());
                pstmt.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    MySqlDbDAOFactory.createConnection().close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
    }
    
    @Override
    public void addProducts(SalesOrder so){
        ArrayList<Product> order = new ArrayList<Product>();
        order=so.getProducts();
                try {            
             PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_NEW_SALES_ORDER);
                for (int i=0; i<order.size(); i++){
                    Product prod=order.get(i);
                    MySqlDbDAOFactory.createConnection().setAutoCommit(false);
                    pstmt.setInt(1, prod.getProductCode());
                    pstmt.setInt(2, so.getSalesOrderID());
                    pstmt.setInt(3, prod.getQuantity());
                    pstmt.addBatch();
            }
               	pstmt.executeBatch();
        	MySqlDbDAOFactory.createConnection().commit();

            } catch (SQLException ex) {
                Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 try {
                    MySqlDbDAOFactory.createConnection().close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                so.setSalesOrderID(rs.getInt("SalesOrderID"));
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
                 Logger.getLogger(MySqlDbSalesOrderDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         return salesOrderList;
    }
    
    public void updateSalesOrder(SalesOrder so){
        try {
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_UPDATE_SALES_ORDER );
            pstmt.setInt(1, so.getStatus());
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
}
