package com.bo;

import java.util.List;

import com.dao.MyDao;
import com.model.Person;

public class MyBo 
{
	MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}
	
	//insert
	public void insertdata(Person p)
	{
		myDao.insertdata(p);
	}
	
	//View
	public List<Person>viewdetails()
	{
		return myDao.viewdetails();
	}
	
	//update
	public void updatedata(Person p)
	{
		myDao.updatedata(p);
	}
	
	//delete
	public void deletedata(int id)
	{
		myDao.deletedata(id);
	}
	
	public Person getPersonById(int id)
	{
		return myDao.getPersonById(id);
	}	
	
}