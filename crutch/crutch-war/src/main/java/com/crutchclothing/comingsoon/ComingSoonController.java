package com.crutchclothing.comingsoon;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComingSoonController {
	
	@RequestMapping(value="/comingsoon", method = RequestMethod.GET)
	public String getMovie(ModelMap model) {
		System.out.println("TEST");
		model.addAttribute("message", "test");
 
		return "comingsoon";
 
	}

}
