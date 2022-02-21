import java.util.*;

class Exercise8
{
	public static boolean checkPostiveString(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i) > str.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		boolean b = checkPostiveString(str);

		if(b)
			System.out.println(str+" is positive String");
		else
			System.out.println(str+" is not positive String");
	}
}