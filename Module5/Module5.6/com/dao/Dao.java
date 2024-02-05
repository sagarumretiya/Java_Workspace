package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{
	
	//insert
	public void insertdata(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
	//view
	
	@SuppressWarnings("unchecked")
	public List<Person> viewdata()
	{
		List<Person> getlist = this.getHibernateTemplate().find("from Person");
		
		return getlist;
	}
	
	
	//update
	public void updatedata(Person p)
	{
		this.getHibernateTemplate().update(p);
	}
	//delete
	public void deletedata(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		getHibernateTemplate().delete(p);
	}

	//edit
		public Person getPersonById(int id)
		{
			HibernateTemplate template=getHibernateTemplate();
			Person p=template.get(Person.class,id);
			return p;
		}
}
