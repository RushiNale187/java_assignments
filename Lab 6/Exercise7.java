import java.util.*;

class Exercise7
{
	public static int[] getSorted(int arr[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int res = 0;


			while(arr[i] > 0)
			{
				int digit = arr[i]%10;
				res = res*10 + digit;
				arr[i] = arr[i]/10;
			}
			arr[i] = res;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String args[])
	{
		int arr[] = {77,23,34,45,56};
		
		int res[] = getSorted(arr);

		for(int i:res)
			System.out.println(i);
	}
}