import java.util.*;

class Testing1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string of numbers :");
		String str = sc.nextLine();
	
		Bucket b1 = new Bucket(null,0,0);

		transfer(str,b1);
	}
	
	public int transfer(String str,Bucket bkt)
	{
		int num = 0;
		String res = "";

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				res = res + ch;
				int number = Integer.parseInt(res);
				num = number;
			}	
		}
		return num;
	}
	
	public int countChars(String str, char c) 
	{
		int count = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(c == ch)
			{
			 	count++; 
			}
		}
		return count;
	}

	String reverse(String data)
	{	
		char ch[] = data.toCharArray();
		String rev = "";

		for(int i=data.length()-1;i>=0;i--)
		{
			rev = rev + ch[i];
		}
		return rev;				
	}
}

class Bucket1
{
	private String data;
	private int counter;
	private int value;
	
	public Bucket1(String data,int counter,int value) 
	{
		this.data = data;
		this.counter = counter;
		this.value = value;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public int getCounter() 
	{
		return counter;
	}

	public void setCounter(int counter) 
	{
		this.counter = counter;
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}
}