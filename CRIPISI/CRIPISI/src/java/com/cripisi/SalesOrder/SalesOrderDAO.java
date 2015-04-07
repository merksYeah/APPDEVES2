/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.SalesOrder;

import com.cripisi.Customer.Customer;
import com.cripisi.Product.Product;
import java.util.ArrayList;
/**
 *
 * @author Dea
 */
public interface SalesOrderDAO {
    
    public ArrayList<Product> getOrderedProducts(SalesOrder so);
    
    public int newSalesOrder(SalesOrder so);
    
    public void addProducts(SalesOrder so);
    
    public ArrayList<SalesOrder> getAllSalesOrder();
    
    public void updateSalesOrder(SalesOrder so);
    
    public ArrayList<SalesOrder> getSalesOrdersByCustomer(Customer one);
    
    public ArrayList<Product> getOrderDetailsByOrder(SalesOrder so);
}