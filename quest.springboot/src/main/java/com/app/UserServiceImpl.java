package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserRepoService{
	
	private IUserRepo userRepo;
	
	//Spring Setter Injection
	@Autowired
	public void setUserRepo(IUserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	//To list the available users
	@Override
	public Iterable<User> listAllUsers() {
		return userRepo.findAll();
	}
	
	//To register the user
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	//To count the users , if is 0 then redirect to "NoUsers Registered Page"
	@Override
	public long counter() {
		return userRepo.count();
	}

	
}
