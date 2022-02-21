import java.util.*;

class Exercise3
{
	public static int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int rev = 0;

			while(arr[i] > 0)
			{
				int digit = arr[i]%10;
				rev = rev*10 + digit;
				arr[i] = arr[i]/10;
			}
			arr[i] = rev;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		int res[] = getSorted(arr);
	
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}