package com.rohith.webapp.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rohith.webapp.model.Todo;
import com.rohith.webapp.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	// @ResponseBody - used to display the texts inside the return
	public String showTodos(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo", new Todo(0, (String) model.get("name"), "Default Desc",
				new Date(), false));
		return "todo";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	// @ResponseBody - used to display the texts inside the return
	public String deleteTodos(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()){
			return "todo";
		}
		
		service.addTodo((String) model.get("name"), todo.getDesc(), new Date(),
				false);
		return "redirect:/list-todos";
	}

}
