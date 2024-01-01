package com.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.model.Person;

public class MyDao extends HibernateDaoSupport
{

		//insert
		public void insertdata(Person p)
		{
			getHibernateTemplate().save(p);
		}
		
		//View
		@SuppressWarnings("unchecked")
		public List<Person>viewdetails()
		{
			return (List<Person>) getHibernateTemplate().find("from Person");
		}
		
		//update
		public void updatedata(Person p)
		{
			getHibernateTemplate().update(p);
		}
		
		//delete
		public void deletedata(int id)
		{
			HibernateTemplate template=getHibernateTemplate();
			Person p=template.get(Person.class,id);
			getHibernateTemplate().delete(p);
		}
		
		//Edit
		public Person getPersonById(int id)
		{
			HibernateTemplate template=getHibernateTemplate();
			Person p=template.get(Person.class,id);
			return p;
		}
		
		
}
