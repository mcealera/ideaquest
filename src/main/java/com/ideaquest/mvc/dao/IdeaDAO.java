package com.ideaquest.mvc.dao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.ideaquest.mvc.model.Idea;;

public class IdeaDAO {
	
	private List<Idea> Ideas = new LinkedList<>();
	
	public IdeaDAO(){
		Idea javaIdea = this.createIdea("Java Idea", "This is a Java Idea" );
		Idea javascriptIdea = this.createIdea("Javascript Idea", "This is a Javascript Idea");
		Idea htmlIdea = this.createIdea("HTML Idea", "This is an HTML Idea");
		
		this.Ideas.addAll(Arrays.asList(new Idea[]{javaIdea, javascriptIdea, htmlIdea}));
	}
	
	public List<Idea> findAll(){
		return this.Ideas;
	}
	
	public Idea find(Long IdeaId){
		return this.Ideas.stream().filter(p -> {
			return p.getIdeaID().equals(IdeaId);
		}).collect(Collectors.toList()).get(0);
	}

	private Idea createIdea(String title, String description) {
		Idea Idea = new Idea();
		Idea.setIdeaName(title);
		Idea.setIdeaID(1L);
		Idea.setGenDate("2015");
		Idea.setIdeaDesc(description);
		return Idea;
	}

}
