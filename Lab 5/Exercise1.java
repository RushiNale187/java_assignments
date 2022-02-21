import java.util.*;

class Exercise1
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age :");
		int age = sc.nextInt();
		
		try
		{
			Validate.validate(age);
		}
		catch(AgeInvalidException e)
		{
			System.out.println(e);
		}
	}
}

class AgeInvalidException extends Exception
{
	public AgeInvalidException(String errormsg)
	{
		super(errormsg);
	}
}

class Validate
{
	static void validate(int age) throws AgeInvalidException
	{
		if(age < 15)
			throw new AgeInvalidException("Age is below 15");
	}
}