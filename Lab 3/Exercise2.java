import java.util.Scanner;

class Exercise2
{
	public static String getImage(String str)
	{
		StringBuffer sb = new StringBuffer(str);
	
		return str+"|"+(sb.reverse());	
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();

		String res = getImage(str);

		System.out.println("Mirror image is :"+res);
	}
}