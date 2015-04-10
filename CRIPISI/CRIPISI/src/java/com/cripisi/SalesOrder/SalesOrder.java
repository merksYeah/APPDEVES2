/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.SalesOrder;

import com.cripisi.Product.Product;
import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author Dea
 */
public class SalesOrder {
    private int order_id;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    private int customer_tin;
    private String statusCode;

    public void setCustomer_tin(int customer_tin) {
        this.customer_tin = customer_tin;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    

    public int getCustomer_tin() {
        return customer_tin;
    }

    public String getStatusCode() {
        return statusCode;
    }

   
    private Date order_date;

    public Date getDate_issued() {
        return date_issued;
    }

    public void setDate_issued(Date date_issued) {
        this.date_issued = date_issued;
    }
    private Date date_issued;
    private String deliver_to;
    private Date date_delivered;
    private String comments;
    private String[] products;
    private String[] quantity;
    private int flag;

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

   
    public String[] getQuantity() {
        return quantity;
    }

    public void setQuantity(String[] quantity) {
        this.quantity = quantity;
    }
 



    public int getClientID() {
        return customer_tin;
    }

    public void setClientID(int clientID) {
        this.customer_tin = clientID;
    }

   

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }


    public String getDeliver_to() {
        return deliver_to;
    }

    public void setDeliver_to(String deliver_to) {
        this.deliver_to = deliver_to;
    }

    public Date getDate_delivered() {
        return date_delivered;
    }

    public void setDate_delivered(Date date_delivered) {
        this.date_delivered = date_delivered;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
    public int getFlag(){
        return flag;
    }
    
    public void setFlag(int flag){
        this.flag=flag;
    }
    
}
