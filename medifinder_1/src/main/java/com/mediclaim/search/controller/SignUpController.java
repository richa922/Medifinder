package com.mediclaim.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediclaim.model.Doctor;
import com.mediclaim.signup.service.SignUpService;

@Controller
@RequestMapping("/services/signUp")
public class SignUpController {

	@Autowired
	SignUpService signUpService;
	
	@RequestMapping(value = "/doctor", method = RequestMethod.POST)
	public @ResponseBody boolean getDisease(@RequestBody Doctor doctor) {
		signUpService.signUpDoctor(doctor);
		return  true;
	}
}