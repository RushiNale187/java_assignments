class StringMan2
{
	public static int checkString(String str)
	{
		int num = Integer.parseInt(str);
		int sum = 0;

		if(num > 9)
		{
			while(num>0)
			{
				int digit = num%10;
				sum = sum + digit;
				num = num/10;
			}
			return sum;
		}
		return num;
	}
	
	public static void main(String args[])
	{
		String str = "2";
		
		int num = checkString(str);

		System.out.println(num);
	}
}