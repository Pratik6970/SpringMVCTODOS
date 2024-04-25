package com.app.entities;


public class Todos {
	
	private String todoTitle;
	
	private String todoContent;
	
	private double todoprice;
	
	public Todos() {
		System.out.println("TODO Call here");
	}

	public Todos(String todoTitle, String todoContent, double todoprice) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.todoprice = todoprice;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoContent() {
		return todoContent;
	}

	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}

	public double getTodoprice() {
		return todoprice;
	}

	public void setTodoprice(double todoprice) {
		this.todoprice = todoprice;
	}

	@Override
	public String toString() {
		return "Todos [todoTitle=" + todoTitle + ", todoContent=" + todoContent + ", todoprice=" + todoprice + "]";
	}

	
	


	





	

	

}
