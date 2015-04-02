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
    
    public ArrayList<Product> getList(Product oneProduct)
    {
        ResultSet rs = null;
        ArrayList<Product> searches = new ArrayList<>();
       String query = "Select * from products where productCode = ?";
       PreparedStatement pstmst;
        try {
            pstmst = DBConnectionFactory.getInstance().getConnection().prepareStatement(query);
             pstmst.setString(1,oneProduct.getProductCode());
             pstmst.setString(2,oneProduct.getProductName());
             rs = pstmst.executeQuery();
             while(rs.next())
             {
                 Product two = new Product();
                 two.setProductName(rs.getString("productname"));
                 two.setProductCode(rs.getString("productCode"));
                 two.setSupplierID(rs.getString("supplierid"));
                 two.setPackageType(rs.getString("packagetype"));
                 two.setNetWeightPerPackage(Integer.parseInt(rs.getString("netweightperpackage")));
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return searches;
       
    }
    
}
