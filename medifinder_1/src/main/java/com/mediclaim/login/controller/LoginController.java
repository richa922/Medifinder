package com.mediclaim.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediclaim.login.service.LoginService;
import com.mediclaim.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public boolean getMedicine(@RequestBody User user) {
		return loginService.getAuthenticate(user.getUsername(), user.getPassword());
	}
}