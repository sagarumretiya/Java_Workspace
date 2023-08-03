package com.a317;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FramesEx
{
	JFrame frame;
	JLabel lfirstname,llastname,lemail,lpass,lconfirmpass,lerror;
	JTextField tffirstname,tflastname,tfemail,tfpass,tfcpass;
	JButton btnsave;
	
	void FileEntry()
	{
		try {
			FileOutputStream f= new FileOutputStream("D://eclipse-workspace/test.txt");
			
			f.write(("\nYour first name is : "+tffirstname.getText().toString()).getBytes());
			f.write(("\nYour last name is : "+tflastname.getText().toString()).getBytes());
			f.write(("\nYour email is : "+tfemail.getText().toString()).getBytes());
			f.write(("\nYour password is : "+tfpass.getText().toString()).getBytes());
			f.write(("\nYour confirm password is : "+tfcpass.getText().toString()).getBytes());
			f.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public FramesEx() 
	{
		frame =new JFrame("Student Registration Form");
		
		
		lfirstname =new JLabel("Firstname: ");
		lfirstname.setBounds(27, 35, 100, 14);
		
		llastname =new JLabel("Lastname: ");
		llastname.setBounds(27, 70, 100, 14);
		
		lemail =new JLabel("Email: ");
		lemail.setBounds(27, 105, 100, 14);
		
		
		lpass =new JLabel("Password: ");
		lpass.setBounds(27, 140, 100, 14);
		
		
		lconfirmpass =new JLabel("Confirm Password: ");
		lconfirmpass.setBounds(27, 175, 120, 14);
		
		tffirstname =new JTextField();
		tffirstname.setBounds(141, 35, 186, 20);
		
		tflastname =new JTextField();
		tflastname.setBounds(141, 68, 186, 20);
		
		tfemail =new JTextField();
		tfemail.setBounds(141, 101, 186, 20);
		
		tfpass =new JTextField();
		tfpass.setBounds(141, 134, 186, 20);
		
		tfcpass =new JTextField();
		tfcpass.setBounds(141, 170, 186, 20);
		
		btnsave =new JButton("SAVE");
		btnsave.setBounds(83, 230, 89, 23);
		
		lerror = new JLabel("Error, pass not same as confirm pass");
		lerror.setBounds(27,250,120,15);
		
		btnsave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				frame.remove(lerror);
				frame.repaint();
				String pass = tfpass.getText().toString();
				String cpass = tfcpass.getText().toString();	
				
				if(pass.equals(cpass))
				{
					FileEntry();
				}
				else
				{
					frame.add(lerror);
					frame.repaint();
				}
			}
		});

		frame.add(lfirstname);
		frame.add(llastname);
		frame.add(lemail);
		frame.add(lpass);
		frame.add(lconfirmpass);
		frame.add(tffirstname);
		frame.add(tflastname);
		frame.add(tfemail);
		frame.add(tfpass);
		frame.add(tfcpass);
		frame.add(btnsave);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
		
	public static void main(String[] args) 
	{
		new FramesEx();
	}
}