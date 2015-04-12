package com.cripisi.Supplier;

/**
 * @author Number 2
 *
 */
public class Supplier {
	private int supplierTin;

    public void setSupplierTin(int supplierTin) {
        this.supplierTin = supplierTin;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public int getSupplierTin() {
        return supplierTin;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }
	private String supplierName;
	private String contact_num;
	private int supplier_indicator;
	private String supplierEmail;

    public String[] getProductCode() {
        return productCode;
    }

    public void setProductCode(String[] productCode) {
        this.productCode = productCode;
    }
        private String[] productCode;
        
        
	public int getSupplierID() {
		return supplierTin;
	}
	public void setSupplierID(int supplierID) {
		this.supplierTin = supplierID;
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
