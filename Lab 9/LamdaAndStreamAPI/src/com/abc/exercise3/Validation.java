package com.abc.exercise3;

public class Validation 
{
	public static void main(String[] args) 
	{
		String name = "rushinale187";
		String pass = "rushi1234";
		
		Authentication p = ((username, password) -> 
		{
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		boolean b = p.checkIdentity("rushinale187", "rushi1234");
		System.out.println(b);
	}
}
