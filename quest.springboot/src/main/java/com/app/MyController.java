package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class MyController {
	
	private IUserRepoService userService;
	
	//Auto wiring - Injection
	@Autowired
	public void setUserService(IUserRepoService userService) {
		this.userService = userService;
	}
	
	//Home page
	@RequestMapping(value="")
	public ModelAndView firstpage() {
		return new ModelAndView("home");
	}
	
	//Adding new user option
	@RequestMapping(value = "/addUser")
	public ModelAndView addUser() {
		ModelAndView model = new ModelAndView("addUser");
		return model;
	}
	
	//Listing User option
	@RequestMapping(value = "/listUser",method=RequestMethod.GET)
	public ModelAndView listUser() {
		
		// If No User has registered, redirect to "NoUsers Registered" Page
		if(userService.counter()== 0) {
			return new ModelAndView("nousers");
		}
		
		//List the users
		else {
			ModelAndView model = new ModelAndView("listUser");
			model.addObject("list", userService.listAllUsers());
			return model;
		}
		}
	
	//For registering a new user
	@RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView userRegister(@ModelAttribute("user")User user){
    	ModelAndView model = new ModelAndView("add");
    	if(user!=null){
    	userService.saveUser(user);
    	model.addObject("warning", "User Registration Success");
    	}
    	else{
    	model.addObject("danger","Something is Wrong" );
    	}
    	return new ModelAndView("redirect:/home");
    }
	
}
