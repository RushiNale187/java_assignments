import java.util.*;

class Exercise3
{
	public static Map<Integer,Integer> getSqueres(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],arr[i]*arr[i]);
		}
		return map;
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

		Map<Integer,Integer> map = getSqueres(arr);
		System.out.println(map);
	}
}