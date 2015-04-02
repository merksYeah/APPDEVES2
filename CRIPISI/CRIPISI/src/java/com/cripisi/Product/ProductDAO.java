/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cripisi.Product;

import java.util.ArrayList;

/**
 *
 * @author Dea
 */
public interface ProductDAO {
    public void addItem(Product two);
    
    public ArrayList<Product> getList();
    
    public ArrayList<Product> searchList(Product one);
    
    public void updateProduct(Product one);
}
