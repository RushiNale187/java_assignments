import java.util.*;

class Exercise4
{
	static int count = 0;

	public static int[] modifyArray(int arr[])
	{
		int n = arr.length;
        	int[] brr = new int[n];
         
        	int i = 0, j = 0;
		
		brr[count] = arr[0];
		count++;

        	for (i=1; i<n; i++)
		{
			for (j=0; j<i; j++)
			{
			        if (arr[i] == arr[j])
				{
                			break;
				}
			}
			if(j == i)
			{
				brr[count] = arr[i];
				count++;
			}
		}      
        	return brr;
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

		int res[] = modifyArray(arr);
	
		for(int i=0;i<count;i++)
		{
			System.out.print(res[i]+" ");
		}
	}	
}