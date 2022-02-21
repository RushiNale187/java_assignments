class StringMan1
{
	public static String concatAdd(String str1,String str2)
	{
		String s=str1+str2;
		String res="";
		String[] str=s.split(" ");

		for(int i=0;i<str.length;i++)
		{
			res=res+str[i];	
		}
		return res;
	}

	public static String reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);

		return sb.reverse().toString();
	}

	protected static int paddlingIndex(String str1,String str2)
	{
		for(int i=0;i<=str1.length()-str2.length();i++)
		{
			String sub = str1.substring(i,str2.length()+i);
			
			if(sub.equals(str2))
				return i;
		}
		return -1;		
	}

	public static boolean isDigit(String str)
	{
		int len=str.length();
		 
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);

			if(ch<'0' || ch>'9')
				return false;	
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println("Concated String :"+concatAdd("  Core  ","  Java  "));
		System.out.println("Reversed String :"+reverse("CoreJava"));
		System.out.println("Paddling Index  :"+paddlingIndex("CoreJava","Java"));
		System.out.println("Digit or Not    :"+isDigit("100"));
	}
}