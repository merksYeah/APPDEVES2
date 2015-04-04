/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

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
public class ProductDB {
    
    public void addItem(Product two)
    {
        String query = "insert into product(productCode, supplierID, productName, package, netWeightPerPackage, quantity) values(?,?,?,?,?,?)";
        try {
            PreparedStatement pstmst = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmst.setString(1, two.getProductCode());
            pstmst.setString(2, two.getSupplierID());
            pstmst.setString(3, two.getProductName());
            pstmst.setString(4, two.getPackageType());
            pstmst.setInt(5, two.getnetweight());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Product> getList()
    {
        ResultSet rs = null;
        ArrayList<Product> searches = new ArrayList<>();
       String query = "Select * from product";
       PreparedStatement pstmst;
        try {
            pstmst = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
             rs = pstmst.executeQuery();
             while(rs.next())
             {
                 Product two = new Product();
                 two.setProductName(rs.getString("productName"));
                 two.setProductCode(rs.getString("productCode"));
                 two.setQuantity(Integer.parseInt(rs.getString("quantity")));
                 two.setPackageType(rs.getString("package"));
                 two.setNetWeightPerPackage(Integer.parseInt(rs.getString("net_weight_per_package")));
                 searches.add(two);
                 
             }
             
             DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return searches;
       
    }
    
    public ArrayList<Product> searchList(Product one)
    {
        ResultSet rs = null;
        ArrayList<Product> searches = new ArrayList<>();
       String query = "Select * from product where productName LIKE ? or productCode LIKE ?";
       PreparedStatement pstmst;
        try {
            pstmst = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
            pstmst.setString(1, "%" + one.getProductName() + "%");
            pstmst.setString(2, "%" + one.getProductCode() + "%");
             rs = pstmst.executeQuery();
             while(rs.next())
             {
                 Product two = new Product();
                 two.setProductName(rs.getString("productName"));
                 two.setProductCode(rs.getString("productCode"));
                 two.setQuantity(rs.getInt("quantity"));
                 two.setPackageType(rs.getString("package"));
                 two.setNetWeightPerPackage(rs.getInt("net_weight_per_package"));
                 searches.add(two);
                 
             }
             //System.out.println(searches.get(0).getProductName());
             DBConnectionFactory.getInstance().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return searches;
       
    }
    
}
