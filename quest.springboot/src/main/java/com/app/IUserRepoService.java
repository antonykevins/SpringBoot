package com.app;

public interface IUserRepoService {
	   
	//To list all Users 
	   public Iterable<User> listAllUsers();

	 //To register a User
	   public User saveUser(User user);
	   
	 //To count available users 
	   public long counter();

}
