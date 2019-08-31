package project2.in.dao;


import java.util.List;


import project2.in.model.Category;


public interface Categorydao 

{
	
public boolean addCategory(Category category);
	
public boolean deleteCategory(Category category);
	
public boolean updateCategory(Category category);
	
public Category getCategory(int categoryId);
	
public List<Category> listCategories();
	
	

}
