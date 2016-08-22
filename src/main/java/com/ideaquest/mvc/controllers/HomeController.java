package com.ideaquest.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideaquest.mvc.dao.IdeaDAO;
import com.ideaquest.mvc.model.Idea;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private IdeaDAO ideas;
	
	@RequestMapping("/")
	public String goHome(Model model){
		
		model.addAttribute("idea", new Idea());
		return "home";
	}
	
	@RequestMapping("/ideas")
	public String ideas(){
		return "ideas";
	}


}
