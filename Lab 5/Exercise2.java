class Exercise2
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(null,"ajay",null);
		//Employee e1 = new Employee("sachin","ramesh","tendulkar");

		try
		{
			Employee.validateName(e1.firstName, e1.middleName, e1.lastName);
		}
		catch(InvalidNameException  e)
		{
			System.out.println(e);
		}
	}
}

class Employee
{
	String firstName;
	String middleName;
	String lastName;

	Employee(String firstName,String middleName,String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
		
	static void validateName(String firstName,String middleName,String lastName) throws InvalidNameException
	{
		if(firstName == null && lastName == null)
		{
			throw new InvalidNameException("Name is invalid");
		}
		else
		{
			System.out.println("Name is valid");
		}
	}
}

class InvalidNameException extends Exception
{
	InvalidNameException(String errormsg)
	{
		super(errormsg);
	}
}
