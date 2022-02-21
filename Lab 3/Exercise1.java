import java.util.*;

class Exercise1
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
	
		StringTokenizer st1 = new StringTokenizer(str);

		int sum = 0;

		while(st1.hasMoreTokens())
		{
			String token = st1.nextToken();
			System.out.println(token);
			int n = Integer.parseInt(token);
			sum = sum + n;
		}
		System.out.println("Sum :"+sum);
	}
}