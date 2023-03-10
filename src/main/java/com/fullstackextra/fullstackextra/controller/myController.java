package com.fullstackextra.fullstackextra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fullstackextra.fullstackextra.Service.service;
import com.fullstackextra.fullstackextra.entities.Problem;


@Controller
public class myController {
	
//	@GetMapping("/")
//	private String home() {
//		return "Welcome to the home page"; 
//	}
	
	@Autowired 
	private service servi;
	
	
	@RequestMapping("/")
	public String getAllProblem(Model model) {
		List<Problem> problem = this.servi.getAllProblems();
		model.addAttribute("problem",problem);
		
		return "home";
		
	}
	
	@RequestMapping("/form")
	public String addingProblem() {
		
		return "form";
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String handleform(@ModelAttribute("problem") Problem problem, Model model) {
		servi.addProblem(problem);
		model.addAttribute("problem", new Problem());
		return "form"; 
	}
	
	@RequestMapping("/update/{updateId}")
	public String updateProblem(@PathVariable int updateId, Model model) {
		
		Problem problem = this.servi.getProblem(updateId);
		model.addAttribute("prob", problem);
		
		return "update_form"; 
	}
	
	@RequestMapping("/delete/{deleteId}")
	public String deleteProblem(@PathVariable int deleteId) {
		
		this.servi.deleteProblem(deleteId);
		
		return "redirect:/"; 
		
	}
	
	
	
	
	

}
