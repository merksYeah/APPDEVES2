/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Product;

/**
 *
 * @author deathman28
 */
public class Product {
    private String productCode;
    private String supplierID;
    private String productName;
    private String packageType;
    private int netweight,quantity;

    public int getNetweight() {
        return netweight;
    }

    public int getMSRP() {
        return MSRP;
    }

    public void setNetweight(int netweight) {
        this.netweight = netweight;
    }

    public void setMSRP(int MSRP) {
        this.MSRP = MSRP;
    }
    private int MSRP;
    
    /*private int productCode;
      private String productName;
      private String productcol;
    */
    public void setProductCode(String newProductCode)
    {
        productCode = newProductCode;
    }
    
    public void setSupplierID(String newSupplierID)
    {
        supplierID = newSupplierID;
    }
    
    public void setProductName(String newProductName)
    {
        productName = newProductName;
    }
    
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
    
    public void setPackageType(String newPackageType)
    {
        packageType = newPackageType;
    }
    
    public void setNetWeightPerPackage(int newNetWeightPerPackage)
    {
        netweight = newNetWeightPerPackage;
    }
    
    public String getProductCode()
    {
        return productCode;
    }
    
    public String getSupplierID()
    {
        return supplierID;
    }
    
    public String getPackageType()
    {
        return packageType;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public int getnetweight()
    {
        return netweight;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}

