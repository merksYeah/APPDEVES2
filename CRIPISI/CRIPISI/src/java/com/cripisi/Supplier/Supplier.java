package com.cripisi.Supplier;

/**
 * @author Number 2
 *
 */
public class Supplier {
	private int supplierID;
	private String supplierName;
	private String contact_num;
	private int supplier_indicator;
	private String supplierEmail;
        
        
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getContact_num() {
		return contact_num;
	}
	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}
	public int getSupplier_indicator() {
		return supplier_indicator;
	}
	public void setSupplier_indicator(int supplier_indicator) {
		this.supplier_indicator = supplier_indicator;
	}
        public String getSupplier_Email(){
                return supplierEmail;
        }
        public void setSupplier_Email(String suppEmm){
                this.supplierEmail = suppEmm;
        }
}
