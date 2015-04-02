/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Factory;

import com.cripisi.Product.Product;
import com.cripisi.Product.ProductDAO;
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
class MySqlDbProductDAO implements ProductDAO{

    public static final String SQL_ADD_ITEM= "insert into product(productCode, supplierID, productName, package, netWeightPerPackage, quantity) values(?,?,?,?,?,?)";
    public static final String SQL_GET_LIST="Select * from product";
    public static final String SQL_SEARCH_LIST="Select * from product where productName LIKE ? or productCode LIKE ?";
    public static final String SQL_UPDATE_PRODUCT_DETAILS="update product set quantity=?";
    
    @Override
    public void addItem(Product two) {
    try {
            PreparedStatement pstmst = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_ADD_ITEM);
            pstmst.setInt(1, two.getProductCode());
            pstmst.setString(2, two.getSupplierID());
            pstmst.setString(3, two.getProductName());
            pstmst.setString(4, two.getPackageType());
            pstmst.setInt(5, two.getnetweight());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @Override
    public ArrayList<Product> getList() {
       ResultSet rs = null;
        ArrayList<Product> searches = new ArrayList<>();
       PreparedStatement pstmst;
        try {
            pstmst = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_GET_LIST);
             rs = pstmst.executeQuery();
             while(rs.next())
             {
                 Product two = new Product();
                 two.setProductName(rs.getString("productName"));
                 two.setProductCode(rs.getInt("productCode"));
                 two.setQuantity(Integer.parseInt(rs.getString("quantity")));
                 two.setPackageType(rs.getString("package"));
                 two.setNetWeightPerPackage(Integer.parseInt(rs.getString("netweightperpackage")));
                 searches.add(two);
                 
             }
             
             MySqlDbDAOFactory.createConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return searches;
    }

    @Override
    public ArrayList<Product> searchList(Product one) {
       ResultSet rs = null;
        ArrayList<Product> searches = new ArrayList<>();
       PreparedStatement pstmst;
        try {
            pstmst = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_SEARCH_LIST);
            pstmst.setString(1, "%" + one.getProductName() + "%");
            pstmst.setString(2, "%" + one.getProductCode() + "%");
             rs = pstmst.executeQuery();
             while(rs.next())
             {
                 Product two = new Product();
                 two.setProductName(rs.getString("productName"));
                 two.setProductCode(rs.getInt("productCode"));
                 two.setQuantity(rs.getInt("quantity"));
                 two.setPackageType(rs.getString("package"));
                 two.setNetWeightPerPackage(rs.getInt("netweightperpackage"));
                 searches.add(two);
                 
             }
             //System.out.println(searches.get(0).getProductName());
             MySqlDbDAOFactory.createConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return searches;
       
    }

    @Override
    public void updateProduct(Product one) {
        try {
            PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement( SQL_UPDATE_PRODUCT_DETAILS);
            pstmt.setInt(1, one.getQuantity());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 MySqlDbDAOFactory.createConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDbProductDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
}
