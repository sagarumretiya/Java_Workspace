package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.MyBo;
import com.model.Person;

@Controller
public class MyController 
{

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p =new Person();
		p.setFirstname(request.getParameter("firstname"));
		p.setLastname(request.getParameter("lastname"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		p.setAddress(request.getParameter("address"));
		p.setGender(request.getParameter("gender"));
		p.setPassword(request.getParameter("password"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) a.getBean("bo");
		bo.insertdata(p);
		
		
		return "show";
	}
	
	@RequestMapping(value="/delete", method =RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.deletedata(id);
		
		return "show";
	}
	
	@RequestMapping(value="/edit", method =RequestMethod.POST)
	public String edit(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		Person p = bo.getPersonById(id);
		map.addAttribute("p", p);
		
		return "update";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p =new Person();
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setFirstname(request.getParameter("firstname"));
		p.setLastname(request.getParameter("lastname"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) a.getBean("bo");
		bo.updatedata(p);
		
		return "show";
	}

}