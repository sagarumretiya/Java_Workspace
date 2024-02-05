package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bo.Bo;
import com.model.Person;

@Controller
public class MyController 
{

	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert")
	public String insert(HttpServletRequest request,HttpServletResponse resp,ModelMap map)
	{
		Person p = new Person();
		p.setName(request.getParameter("name"));
		p.setEmail(request.getParameter("email"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.insertdata(p);
		return "show";
	}
	
	@RequestMapping(value="/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/index")
	public String index2()
	{
		return "index";
	}
	
	@RequestMapping(value="/query")
	public String query()
	{
		return "query";
	}
	
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest request, HttpServletResponse resp,ModelMap map)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.deletedata(id);
		
		return "show";
	}
	
	@RequestMapping(value="/edit")
	public String edit(HttpServletRequest request,HttpServletResponse resp,ModelMap map)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		Person p = bo.getPersonById(id);
		map.addAttribute("p",p);
		return "update";
	}

	@RequestMapping(value="/update")
	public String update(HttpServletRequest request,HttpServletResponse resp,ModelMap map)
	{
		Person p = new Person();
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setName(request.getParameter("name"));
		p.setEmail(request.getParameter("email"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		bo.updatedata(p);
		return "show";
	}
		
}