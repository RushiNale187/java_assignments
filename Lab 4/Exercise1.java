class Exercise1
{
	public static void main(String args[])
	{
		Person smith = new Person();
		smith.setName("Smith");
		smith.setAge(25);
		
		Account smithacc = new SavingsAccount();
		smithacc.setAccNum(87654321);
		smithacc.setBalance(2000);
		smithacc.setAccHolder(smith);
		System.out.println("Smith account with initial balance 2000 is created successfully");

		Person kathy = new Person();
		kathy.setName("Kathy");
		kathy.setAge(27);
		
		Account kathyacc = new SavingsAccount();
		kathyacc.setAccNum(87654322);
		kathyacc.setBalance(3000);
		kathyacc.setAccHolder(kathy);
		System.out.println("Kathy account with initial balance 3000 is created successfully");

		//smithacc.deposit(2000);
		smithacc.withdraw(500);
		kathyacc.withdraw(3000);
		System.out.println("Smith Acc Balance :"+smithacc.getBalance());
		System.out.println("Kathy Acc Balance :"+kathyacc.getBalance());
	}
}

class Person
{
	String name;
	float age;

	public void setName(String nm)
	{
		name = nm;
	}

	public String getName()
	{
		return name;
	}

	public void setAge(float a)
	{
		age = a;
	}

	public float getAge()
	{
		return age;
	}
}

class Account
{
	long accNum;
	double balance;
	Person accHolder;
	
	public void setAccNum(long accNo)
	{
		accNum = accNo;
	}

	public long getAccNum()
	{
		return accNum;
	}

	public void setBalance(double bal)
	{
		balance = bal;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setAccHolder(Person p)
	{
		accHolder = p;
	}

	public Person getAccHolder()
	{
		return accHolder;
	}

	void deposit(double amt)
	{
		balance = balance + amt;
		System.out.println("deposit completed");
	}
	
	void withdraw(double amt)
	{
		balance = balance - amt;
		System.out.println("Withdrawal completed");		
	}
}

class SavingsAccount extends Account
{
	final long minBalance = 500;
	
	//@Override
	void withdraw(double amt)
	{
		if((balance - amt) > minBalance)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("withdraw request rejected!");
		}	
	}
}

class CurrentAccount extends Account
{
	long overdraftLimit = 50000;

	//@Override
	void withdraw(double amt)
	{
		if(amt < overdraftLimit)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("withdraw request rejected!");
		}	
	}
}









