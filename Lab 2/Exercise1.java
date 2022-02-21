import java.util.*;

class Exercise1
{
	public static int getSecondSmallest(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int secMin = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				secMin = min;
				min = arr[i];
			}
			if(arr[i] > min && arr[i] < secMin)
			{
				secMin = arr[i];
			}
		}
		return secMin;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
	
		int res = getSecondSmallest(arr);

		System.out.println("Second smallest element is:"+res);
	}
}