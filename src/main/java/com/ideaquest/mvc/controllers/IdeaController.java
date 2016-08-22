package com.ideaquest.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideaquest.mvc.dao.IdeaDAO;

@Controller
@RequestMapping("/idea")
public class IdeaController {
	
	@Autowired
	private IdeaDAO ideas;
	
	@RequestMapping("/find")
	public String find(Model model){
		
		model.addAttribute("ideas", ideas.findAll());
		return "ideas";
	}
	
	@RequestMapping(value="/{ideaID}")
	public String findIdea(Model model, @PathVariable Long ideaID){ //matching up path name variables
		
		model.addAttribute("idea", this.ideas.find(ideaID));
		return "idea";
	}

}
