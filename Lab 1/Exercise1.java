import java.util.*;

class Exercise1
{
	public static int sumOfTheCubesOfDigits(int num)
	{
		int sum = 0;
		
		while(num>0)
		{
			int digit = num%10;
			int temp = (int)(Math.pow(digit,3));
			sum = sum + temp;
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number:");
		int num = sc.nextInt();

		int res = sumOfTheCubesOfDigits(num);

		System.out.println("Sum is :"+res);
	}
}