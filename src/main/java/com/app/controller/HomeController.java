package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entities.Todos;

@Controller
public class HomeController {
	
	@Autowired
	 ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model map)
	{
		System.out.println("Home is called here"+getClass().getName());
		map.addAttribute("page", "home");
		List<Todos> list = (List<Todos>) context.getAttribute("list");
		map.addAttribute("todos", list);
		return "Home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model map)
	{
		Todos t = new Todos();
		System.out.println("add todo call here");
		map.addAttribute("page", "add");
		map.addAttribute("todos", t);
		return "Home";
	}
	
	@RequestMapping(value = "/saveTodos", method = RequestMethod.POST)
	public String savetodo(@ModelAttribute("todos") Todos t, Model map)
	{
		System.out.println("Savetodo call here");
		System.out.println(t);
		List<Todos> list = (List<Todos>) context.getAttribute("list");
		list.add(t);
		map.addAttribute("msg", "Successfully added");
		return "Home";
	}
}
