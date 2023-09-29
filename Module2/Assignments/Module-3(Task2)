package com.a218;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class TaskTwo implements ActionListener,ListSelectionListener
{

	JFrame mainframe;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	JTextField tf1,tf2,tf3,tf4;
	JRadioButton radio1,radio2;
	JTable j;
	JScrollPane sp;
	Connection con;
	ResultSet rs;
	Vector<Vector<String>> data;
	
	
	
	void connectDB()
	{
		String url = "jdbc:mysql://localhost:3306/test";
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public TaskTwo()
	{
		mainframe= new JFrame();
		
		btn1= new JButton("Register");
		btn2= new JButton("Exit");
		btn3= new JButton("Update");
		btn4= new JButton("Delete");
		btn5= new JButton("Reset");
		btn6= new JButton("Refresh Table");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
		tf1= new JTextField(15);
		tf1.setEnabled(false);
		
		tf2= new JTextField(15);
		tf3= new JTextField(15);
		tf4= new JTextField(15);
		
		radio1= new JRadioButton("Male");
		radio2= new JRadioButton("Female");
		
		ButtonGroup btngrp= new ButtonGroup();
		btngrp.add(radio1);
		btngrp.add(radio2);

	    connectDB();
	    
	    String query = "Select * from tasktwo;";
	    
	    Statement stmt;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			data = new Vector<Vector<String>>();
			
			while(rs.next())
		    {
		    	Vector<String> temp = new Vector<String>();
		    	temp.add(rs.getString("id"));
		    	temp.add(rs.getString("name"));
		    	temp.add(rs.getString("gender"));
		    	temp.add(rs.getString("address"));
		    	temp.add(rs.getString("contact"));
		    	
		    	data.add(temp);
		    	System.out.println(temp);
		    }
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    Vector<String> columns = new Vector<String>();
	    columns.add("ID");
	    columns.add("Name");
	    columns.add("Gender");
	    columns.add("Address");
	    columns.add("Contact");
	    
		j= new JTable(new DefaultTableModel(data, columns));
		sp=new JScrollPane(j);
	        
		j.getSelectionModel().addListSelectionListener(this);
		
		mainframe.add(btn1);
		mainframe.add(btn2);
		mainframe.add(btn3);
		mainframe.add(btn4);
		mainframe.add(btn5);
		mainframe.add(btn6);
		mainframe.add(tf1);
		mainframe.add(tf2);
		mainframe.add(radio1);
		mainframe.add(radio2);
		mainframe.add(tf3);
		mainframe.add(tf4);
		mainframe.add(sp);
		mainframe.setSize(500,500);
		mainframe.setLayout(new FlowLayout());
		mainframe.setVisible(true);
		
	}
	
	public static void main(String asdf[])
	{
		new TaskTwo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1)
		{
			String name = tf2.getText().toString();
			String gender = (radio2.isSelected())? "Female" : "Male" ;
			String address = tf3.getText().toString();
			String contact = tf4.getText().toString();
			
			connectDB();
			
			String sql = "Insert into tasktwo values(null,'"+name+"','"+gender+"','"+address+"','"+contact+"')";
			
			try 
			{
				Statement stmt = con.createStatement();
				int val = stmt.executeUpdate(sql);
				if(val>0)
				{
					System.out.println("Data Inserted");
				}
				else
				{
					System.out.println("Error while inserting data");
				}
				
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == btn2)
		{
			System.exit(0);
		}
		else if(e.getSource() == btn3)
		{
			if(j.getSelectedRow() != -1)
			{
				int temp = j.getSelectedRow();
				
				String id = data.elementAt(temp).elementAt(0);
				
				String name = tf2.getText().toString();
				String gender = (radio2.isSelected())? "Female" : "Male" ;
				String address = tf3.getText().toString();
				String contact = tf4.getText().toString();
				
				connectDB();
				
				String query = "Update tasktwo set name='"+name+"', gender = '"+gender+"',address = '"+address+"',contact = '"+contact+"' where id = '"+id+"'";
				
				try
				{
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(query);
					
					if(data>0)
					{
						System.out.println("Update Successful");
					}
					else
					{
						System.out.println("Error in update");
					}
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
				
			}
		}
		else if(e.getSource() == btn4)
		{
			if(j.getSelectedRow() != -1)
			{
				int temp = j.getSelectedRow();
				
				String id = data.elementAt(temp).elementAt(0);
				
				connectDB();
				String query = "Delete from tasktwo where id= '"+id+"'";
				
				try
				{
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(query);
					
					if(data > 0)
					{
						System.out.println("Delete Successful");
					}
					else
					{
						System.out.println("Error in delete");
					}
				}
				catch(Exception e3)
				{
					e3.printStackTrace();
				}
			}
		}
		else if(e.getSource() == btn5)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			
			radio1.setEnabled(false);
			radio2.setEnabled(false);
		}
		else if(e.getSource() == btn6)
		{
			
			connectDB();
		    
		    String query = "Select * from tasktwo;";
		    
		    Statement stmt;
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery(query);
				
				data = new Vector<Vector<String>>();
				
				while(rs.next())
			    {
			    	Vector<String> temp = new Vector<String>();
			    	temp.add(rs.getString("id"));
			    	temp.add(rs.getString("name"));
			    	temp.add(rs.getString("gender"));
			    	temp.add(rs.getString("address"));
			    	temp.add(rs.getString("contact"));
			    	
			    	data.add(temp);
			    	//System.out.println(temp);
			    }
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    
		    Vector<String> columns = new Vector<String>();
		    columns.add("ID");
		    columns.add("Name");
		    columns.add("Gender");
		    columns.add("Address");
		    columns.add("Contact");
		    
			j.setModel(new DefaultTableModel(data, columns));

			
			
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(j.getSelectedRow() != -1)
		{
			tf1.setText(data.elementAt(j.getSelectedRow()).elementAt(0));
			tf2.setText(data.elementAt(j.getSelectedRow()).elementAt(1));
			
			if(data.elementAt(j.getSelectedRow()).elementAt(2) == "Male")
			{
				radio1.setEnabled(true);
			}
			else
			{
				radio2.setEnabled(true);
			}
			
			tf3.setText(data.elementAt(j.getSelectedRow()).elementAt(3));
			tf4.setText(data.elementAt(j.getSelectedRow()).elementAt(4));
		}
	}
}
