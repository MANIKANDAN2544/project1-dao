package project2.in.dao;


import java.util.List;


import project2.in.model.Product;


public interface Productdao 

{
	
public boolean addProduct(Product product);
	
public boolean deleteProduct(Product product);
	
public boolean updateProduct(Product product);
	
public Product getProduct(int productId);
	
public List<Product> listProducts();
	

}
