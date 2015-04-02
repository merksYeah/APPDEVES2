package com.cripisi.PurchaseOrder;

import java.sql.Date;

public class PurchaseOrder {
	
	private int PurchaseOrderID;
	private int employeeID;
	private Date order_date;
	private int supplierID;
	private int status;
	
	
	public int getPurchaseOrderID() {
		return PurchaseOrderID;
	}
	public void setPurchaseOrderID(int purchaseOrderID) {
		PurchaseOrderID = purchaseOrderID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
