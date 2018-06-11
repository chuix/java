package com.chuix.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chuix.service.demo.GenericWelcomeService;
import com.chuix.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;

	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		// 1. Retriving the process data
		//WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Carles Huix");
		
		// 2. add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3. return logical view name
		return "WelcomeNew";

	}
}
