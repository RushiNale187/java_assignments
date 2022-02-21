import java.util.*;

class Exercise6
{
	public static int calculateDifference(int n)
	{
		int sumOfSquare = 0;
		int sum = 0;
		
		for(int i = 1;i<=n;i++)
		{
			int temp = (int)Math.pow(i,2);
			sumOfSquare = sumOfSquare + temp;

			sum = sum + i;
		}
		return sumOfSquare - (int)Math.pow(sum,2);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter an Integer value :");
		int n = sc.nextInt();

		int res = calculateDifference(n);
	
		System.out.println("Difference is :"+res);
	}
}