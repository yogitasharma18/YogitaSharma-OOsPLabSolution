package com.greatlearning.service;

import java.lang.reflect.Array;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	String emailAddress;
	public String generatePassword()
	{
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
		char pass[] = new char[8];
		Random rnd = new Random();
		for (int i = 0; i < 8; i++)
		{
			pass[i] = chars.charAt(rnd.nextInt(chars.length()));
		}
		return new String(pass);
		
	}

	public String generateEmailAddress(Employee emp)
	{
		emailAddress = (emp.getFirstName().toLowerCase())+(emp.getLastName().toLowerCase())+"@"+emp.getDeptName()+".abc.com";
		return emailAddress;		
	}
	
	public String showCredentials(Employee emp, String email, String pass)
	{
		System.out.println("Dear " + emp.getFirstName() + "your generated credentials are as follows");
		System.out.println("Email --> "+emailAddress);
		System.out.println("Pasword --> "+pass);
		return emailAddress;
		
	}
}
