package com.abc.exercise1;

public class Power 
{
	PowerInterface a = (x, y) -> 
	{
		return (int) (Math.pow(x,y));
	};
	
	public static void main(String[] args) 
	{
		PowerInterface i = (x, y) -> 
		{
			return (int) (Math.pow(x,y));
		};
		System.out.println(i.a(2, 2));
	}
}
