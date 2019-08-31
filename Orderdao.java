package project2.in.dao;


import project2.in.model.Orderdetail;


public interface Orderdao 

{

	
public boolean paymentProcess(Orderdetail orderdetail);
	
public boolean updateCartItemStatus(String username,int orderId);
	

}
