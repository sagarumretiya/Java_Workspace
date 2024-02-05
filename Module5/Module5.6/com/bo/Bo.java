package com.bo;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.Dao;
import com.model.Person;

public class Bo 
{
	
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
		//insert
		public void insertdata(Person p)
		{
			dao.insertdata(p);
		}
	
	
		//view
	
		public List<Person> viewdata()
		{
			List<Person> getlist = dao.viewdata();
			
			return getlist;
		}
		
		
		//update
		public void updatedata(Person p)
		{
			dao.updatedata(p);
		}
		//delete
		public void deletedata(int id)
		{
			dao.deletedata(id);
		}
		
		//edit
		
		public Person getPersonById(int id)
		{
			return dao.getPersonById(id);
		}
	
	
}
