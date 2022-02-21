import java.util.*;

class Exercise2
{
	public static String[] sortString(String arr[])
	{
		Arrays.sort(arr);
		
		int arrLen = arr.length;

		if(arrLen%2 == 0)
		{
			for(int i=0;i<arrLen/2;i++)
			{
				arr[i] = arr[i].toUpperCase();
			}
		}
		else
		{
			for(int i=0;i<(arrLen/2)+1;i++)
			{
				arr[i] = arr[i].toUpperCase();
			}
		}
		
		return arr;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String arr[] = new String[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		
		String str[] = sortString(arr);

		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	}
}