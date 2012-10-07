package com.vaannila.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vaannila.domain.User;
import com.vaannila.service.UserService;

@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {

	private UserService userService;

	public UserController()	{
		setCommandClass(User.class);
		setCommandName("user");
		//this.setFormView("userForm");
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		User user = (User) command;
		userService.add(user);
		return new ModelAndView("userSuccess","xyz",user);
	}
	
	
}
