package project2.in.dao;


import project2.in.model.Userdetail;


public interface Userdetaildao 

{
	
public boolean addUserdetail(Userdetail userdetail);
	
	
public boolean updateUserdetail(Userdetail userdetail);
	
	
public Userdetail getUserdetail(String username);
	
	

}
