import java.util.Scanner;

class Exercise3
{
	public static String alterString(String str)
	{
		char arr[] = str.toCharArray();
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 'a' && arr[i] != 'A' && 
			   arr[i] != 'e' && arr[i] != 'E' && 
			   arr[i] != 'i' && arr[i] != 'I' && 
			   arr[i] != 'o' && arr[i] != 'O' && 
			   arr[i] != 'u' && arr[i] != 'U'   )
			{
				arr[i] = ++arr[i];
			}
		}
		return new String(arr);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String res = alterString(str);
		
		System.out.println("Res = "+res);
	}
}