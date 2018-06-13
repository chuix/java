package com.chuix.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chuix.service.demo.GenericWelcomeService;
//import com.chuix.service.demo.WelcomeService;

@Controller
public class WelcomeController {

	// No es necesario crear el objeto, añadimos una anotación para que spring lo haga por nosotros
	// GenericWelcomeService es una interface, la usamos para definir la propiedad porque nos da mas 
	// flexibilidad. welcomeService será el modelo
	@Autowired
	private GenericWelcomeService welcomeService;

	// Con esta anotación establecemos el patron.
	// la url http://localhost:8080/spring-mvc-demo-1/ cumple este patron
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		// 1. Retriving the process data
		//WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Carles Huix");
		
		// 2. add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3. return logical view name
		// Será el nombre de la vista que tenemos que devolver. Spring le añade el prefijo y sufijo
		// para completar una url completa.
		return "welcomeNew";

	}
}
