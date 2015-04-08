package com.cripisi.Supplier;

import java.util.ArrayList;

public interface SupplierDAO {
    
    public ArrayList<Supplier> getList();
    
    public ArrayList<Supplier> searchSupplier(Supplier S);
    
    public void newSupplier(Supplier s);
    
    public void updateSupplierInfo(Supplier s);
    
    public void deleteSupplierInfo(Supplier s);
}