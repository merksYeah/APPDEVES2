package com.cripisi.Factory;

import com.cripisi.Supplier.Supplier;
import com.cripisi.Supplier.SupplierDAO;

import db.DBConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MySqlDBSupplierDAO implements SupplierDAO{
	
	private static final String SQL_GET_ALL_SUPPLIER_LIST = "SELECT * FROM supplier";
	private static final String SQL_UPDATE_SUPPLIER = "UPDATE supplier SET supplierID = ?, supplierName = ?, contact_num = ?, supplier_indication = ?, supplierEmail=?";
	private static final String SQL_ADD_NEW_SUPPLIER = "INSERT INTO supplier VALUES(supplierID, supplierName, contact_num, supplier_indicator, supplierEmail) VALUES(?,?,?,?,?)";
	private static final String SQL_DELETE_SUPPLIER = "DELETE FROM supplier WHERE userId = ?";
	private static final String SQL_SEARCH_SUPPLIER = "SELECT supplierID, supplierName, contact_num FROM supplier WHERE supplierID = ?";
        private static final String SQL_INSERT_PRODUCT_INTOSUPPLIERLIST = "INSERT INTO product_has_supplier (productCode,supplierTin) values(?,?)";
	
	@Override
	public ArrayList<Supplier> getList() {
		ResultSet rs = null;
        ArrayList<Supplier> supplierList = new ArrayList<>();
         Connection conn = MySqlDbDAOFactory.createConnection();
        try {   
            PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ALL_SUPPLIER_LIST);
            rs = pstmt.executeQuery();
            while(rs.next()){
                Supplier supp = new Supplier();
                supp.setSupplierID(rs.getInt("supplierTin"));
                supp.setSupplierName(rs.getString("supplierName"));
                supp.setContact_num(rs.getString("contact_num"));
                supplierList.add(supp);            
                }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 conn.close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         return supplierList;
	}

	@Override
	public ArrayList<Supplier> searchSupplier(Supplier s) {
			ResultSet rs = null;
	        ArrayList<Supplier> supplierList = new ArrayList<>();
	        try {
	            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_SEARCH_SUPPLIER);
	            pstmt.setInt(1, s.getSupplierID());
	            rs = pstmt.executeQuery();
	            while(rs.next())
	            {
	                Supplier supp = new Supplier();
	                supp.setSupplierID(rs.getInt("supplierID"));
	                supp.setSupplierName(rs.getString("supplierName"));
	                supplierList.add(supp);
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
	        }finally{
	             try {
	                DBConnectionFactory.getInstance().getConnection().close();
	             } catch (SQLException ex) {
	                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
	             }
	        }
	       return supplierList;
	}

	@Override
	public void newSupplier(Supplier s) {
		try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_ADD_NEW_SUPPLIER);
            pstmt.setInt(1, s.getSupplierID());
            pstmt.setString(2, s.getSupplierName());
            pstmt.setString(3, s.getContact_num());
            pstmt.setInt(4, s.getSupplier_indicator());
            pstmt.setString(5, s.getSupplier_Email());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	}
	
	@Override
	public void updateSupplierInfo(Supplier s) {
		 try {
	            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_UPDATE_SUPPLIER);
	            pstmt.setInt(1, s.getSupplierID());
	            pstmt.setString(2,s.getSupplierName());
	            pstmt.setString(3,s.getContact_num());
	            pstmt.setInt(4,s.getSupplier_indicator());
                    pstmt.setString(5,s.getSupplier_Email());
	            pstmt.executeQuery();
	        } catch (SQLException ex) {
	            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
	        }finally{
	             try {
	                 DBConnectionFactory.getInstance().getConnection().close();
	             } catch (SQLException ex) {
	                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
	             }
	        }
	}

	@Override
	public void deleteSupplierInfo(Supplier s) {
		try {
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_DELETE_SUPPLIER );
            pstmt.setInt(1, s.getSupplierID());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	}

    @Override
    public void updateSupplierProductList(Supplier so) {
         Connection conn = MySqlDbDAOFactory.createConnection();
         String productCode [] = so.getProductCode();
        try {
            conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT_PRODUCT_INTOSUPPLIERLIST);
            
            for(int i=0 ; i < productCode.length; i++)
            {
                pstmt.setString(1, productCode[i]);
                pstmt.setInt(2,so.getSupplierTin());
                 pstmt.addBatch();
            }
            pstmt.executeBatch();
           conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                conn.close();
             } catch (SQLException ex) {
                 Logger.getLogger(MySqlDBSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
        
        



}
