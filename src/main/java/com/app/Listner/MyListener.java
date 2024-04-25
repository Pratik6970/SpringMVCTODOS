package com.app.Listner;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.app.entities.Todos;


public class MyListener implements ServletContextListener {
	
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("contextInitialized here");
		
		List<Todos>list=new ArrayList<Todos>();
		
		ServletContext context= sce.getServletContext();
		context.setAttribute("list", list);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

}
