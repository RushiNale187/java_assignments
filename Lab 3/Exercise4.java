import java.util.Scanner;

class Exercise4
{
	public static int modifyNumber(int num)
	{
		String str = Integer.toString(num);
		
		int i = 0, newNum = 0;
		
		for(i=0;i<str.length()-1;i++)
		{
			int a = Integer.parseInt(String.valueOf(str.charAt(i)));
			int b = Integer.parseInt(String.valueOf(str.charAt(i+1)));
			int diff = Math.abs(a-b);
			newNum = newNum*10 + diff;
		}
		newNum = newNum*10 + Integer.parseInt(String.valueOf(str.charAt(i)));
		return newNum;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
	
		int res = modifyNumber(num);

		System.out.println("modified number = "+res);
	}	
}