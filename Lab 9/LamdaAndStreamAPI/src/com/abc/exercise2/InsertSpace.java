package com.abc.exercise2;

public class InsertSpace 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		space obj = (str) -> 
		{
			for (int i = 0; i < str.length(); i++) 
			{
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("java");
		System.out.println(str2);
	}
}
