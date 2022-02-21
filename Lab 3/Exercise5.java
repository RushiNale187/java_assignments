import java.util.*;
import java.io.*;

class Exercise5
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file name :");
		String str = sc.nextLine();

		int lineCount = 1, wordCount = 0;
		char ch;

		FileInputStream fs = new FileInputStream(str);

		int charCount = fs.available();

		for(int i=0;i<charCount;i++)
		{
			ch = (char)fs.read();
	
			if(ch == ' ' || i == charCount-1)
			{
				wordCount++;
			}
			else if(ch == '\n')
			{
				lineCount++;
			}
		}

		System.out.println("No.of characters ="+charCount);
		System.out.println("No.of Lines ="+lineCount);
		System.out.println("No.of words ="+wordCount);		
	}
}