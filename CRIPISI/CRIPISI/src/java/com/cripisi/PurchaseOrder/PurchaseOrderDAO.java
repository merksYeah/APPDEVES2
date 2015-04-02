package com.cripisi.PurchaseOrder;

import java.util.ArrayList;

public interface PurchaseOrderDAO {
	
	public ArrayList<PurchaseOrder> getAllPurchaseOrder();
	
	public abstract void addPurchaseOrder(PurchaseOrder p);
	
	public void deletePurchaseOrder(PurchaseOrder p);
	
	public void updatePurchaseOrderStatus(PurchaseOrder p);
	

}
