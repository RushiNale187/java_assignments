import java.util.regex.Pattern;
import java.util.regex.Matcher;

class StringMan3_1
{
	public static String pattern(String s1)
	{
		String str = "";

		String[] res = s1.split(" ");

		for (int i=0;i<res.length;i++)
		{
			boolean b1=Pattern.matches("c.m.*",res[i]);
			
			if(b1==true)
			{
				str = str + res[i] + " ";
			}
		}
		return str;
	}

	public static void main(String[] args)
	{
		String res = pattern("My company name is capgemini");

		System.out.println(res);
	}
}