package com.cripisi;

import db.DBConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SupplierDAOImpl implements SupplierDAO{
	
	private static final String SQL_GET_ALL_SUPPLIER_LIST = "SELECT * FROM supplier WHERE SUPPLIERID = ?";
	private static final String SQL_UPDATE_SUPPLIER = "UPDATE supplier SET supplierID = ?, supplierName = ?, contact_num = ?, supplier_indication = ?, supplier_priority_supp_priority_code = ?";
	private static final String SQL_ADD_NEW_SUPPLIER = "INSERT INTO supplier VALUES(supplierID, supplierName, contact_num, supplier_indicator, supplier_priority) VALUES(?,?,?,?,?)";
	private static final String SQL_DELETE_SUPPLIER = "DELETE FROM supplier WHERE userId = ?";
	private static final String SQL_SEARCH_SUPPLIER = "SELECT supplierID, supplierName, contact_num FROM supplier WHERE supplierID = ?";
	
	@Override
	public ArrayList<Supplier> getList() {
		ResultSet rs = null;
        ArrayList<Supplier> supplierList = new ArrayList<>();
        try {   
            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_GET_ALL_SUPPLIER_LIST);
            rs = pstmt.executeQuery();
            while(rs.next()){
                Supplier supp = new Supplier();
                supp.setSupplierID(rs.getInt("supplierID"));
                supp.setSupplierName(rs.getString("supplierName"));
                supp.setContact_num(rs.getInt("contact_num"));
                supp.setSupplier_indicator(rs.getInt("supplier_indication"));
                supp.setSupplier_priority(rs.getInt("supplier_priority_supp_priority_code"));
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(SupplierDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
	                 Logger.getLogger(SupplierDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            pstmt.setInt(3, s.getContact_num());
            pstmt.setInt(4, s.getSupplier_indicator());
            pstmt.setInt(5, s.getSupplier_priority());
            pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                DBConnectionFactory.getInstance().getConnection().close();
             } catch (SQLException ex) {
                 Logger.getLogger(SupplierDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	}
	
	@Override
	public void updateSupplierInfo(Supplier s) {
		 try {
	            PreparedStatement pstmt = DBConnectionFactory.getInstance().getConnection().prepareStatement(SQL_UPDATE_SUPPLIER);
	            pstmt.setInt(1, s.getSupplierID());
	            pstmt.setString(2,s.getSupplierName());
	            pstmt.setInt(3,s.getContact_num());
	            pstmt.setInt(4,s.getSupplier_indicator());
	            pstmt.setInt(5,s.getSupplier_priority());
	            pstmt.executeQuery();
	        } catch (SQLException ex) {
	            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
	        }finally{
	             try {
	                 DBConnectionFactory.getInstance().getConnection().close();
	             } catch (SQLException ex) {
	                 Logger.getLogger(SupplierDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
                 Logger.getLogger(SupplierDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	}



}
