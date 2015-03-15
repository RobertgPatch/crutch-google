package com.crutchclothing.comingsoon;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class ComingSoonController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String defaultController(ModelMap model) {
		return "comingsoon";
	}
	@RequestMapping(value="/comingsoon", method = RequestMethod.GET) 
	public String getMovie(ModelMap model) {
		
		model.addAttribute("message", "Crutch Clothing Online Store Coming Soon!!!!"); 

		return "comingsoon"; 
 	} 


}
