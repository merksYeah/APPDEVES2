package com.cripisi.Factory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

import com.cripisi.PurchaseOrder.PurchaseOrder;
import com.cripisi.PurchaseOrder.PurchaseOrderDAO;
import com.sun.istack.internal.logging.Logger;

public class MySqlDBPurchaseOrderDAO implements PurchaseOrderDAO {
	
	 private static final String SQL_GET_ALL_PURCHASE_ORDER = "select * from PurchaseOrder";
	
	 
	 private static final String SQL_ADD_PURCHASE_ORDER = "insert INTO PurchaseOrder(PurchaseOrderID, employeeID, order_date, supplierID, status) values (?,?,?,?,?) ";
	 private static final String SQL_DELETE_PURCHASE_ORDER = "delete from PurchaseOrder where PurchaseOrderID = ?";
	 private static final String SQL_UPDATE_PURCHASE_ORDER_STATUS="update PurchaseOrder set status=? where PurchaseOrderID = ?";

	@Override
	public ArrayList<PurchaseOrder> getAllPurchaseOrder() {
		ResultSet rs = null;
		ArrayList<PurchaseOrder> purchaseOrderList = new ArrayList<>();
		try{
			PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_GET_ALL_PURCHASE_ORDER);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				PurchaseOrder po = new PurchaseOrder();
				po.setPurchaseOrderID(rs.getInt("PurchaseOrderID"));
				po.setEmployeeID(rs.getInt("employeeID"));
				po.setOrder_date(rs.getDate("order_date"));
				po.setSupplierID(rs.getInt("supplierID"));
				po.setStatus(rs.getInt("Status"));
				purchaseOrderList.add(po);
			} 
		} catch(SQLException ex){
			Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		} finally{
			try{
				MySqlDbDAOFactory.createConnection().close();
			} catch(SQLException ex){
				Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
			}
		}
		return purchaseOrderList;
	}

	@Override
	public void addPurchaseOrder(PurchaseOrder p) {
		try{
			PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_ADD_PURCHASE_ORDER);
			pstmt.setInt(1, p.getPurchaseOrderID());
			pstmt.setInt(2,  p.getEmployeeID());
			pstmt.setDate(3, p.getOrder_date());
			pstmt.setInt(4, p.getSupplierID());
			pstmt.setInt(5, p.getStatus());
			
			pstmt.executeQuery();
		} catch(SQLException ex){
			Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		} finally{
			try{
				MySqlDbDAOFactory.createConnection().close();
			} catch(SQLException ex){
				Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
			}
		}
		
	}
	
	@Override
	public void updatePurchaseOrderStatus(PurchaseOrder p) {
		try{
			PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_UPDATE_PURCHASE_ORDER_STATUS);
			pstmt.setInt(1, p.getStatus());
			pstmt.executeQuery();
		} catch(SQLException ex){
			Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		} finally{
			try{
				MySqlDbDAOFactory.createConnection().close();
			} catch(SQLException ex){
				Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
			}
			
		}
		
		
	}

	@Override
	public void deletePurchaseOrder(PurchaseOrder p) {
		
		try{
			PreparedStatement pstmt = MySqlDbDAOFactory.createConnection().prepareStatement(SQL_DELETE_PURCHASE_ORDER);
			pstmt.setInt(1, p.getPurchaseOrderID());
			pstmt.executeQuery();
		} catch(SQLException ex){
			Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
		} finally{
			try{
				MySqlDbDAOFactory.createConnection().close();
			}	catch(SQLException ex){
				Logger.getLogger(MySqlDBPurchaseOrderDAO.class.getName(), null).log(Level.SEVERE, null, ex);
			}
		}
	}

	

}
