import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile
{
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model)
	{
		ArrayList<String> al = new ArrayList<>();

		if(mobiles.containsKey(company))
		{
			al = mobiles.get(company);
			al.add(model);
			mobiles.put(company,al);
		}
		else
		{
			al.add(model);
			mobiles.put(company,al);
		}
		return "model successfully added";
	}

	public ArrayList<String> getModels(String company)
	{
		ArrayList<String> al = new ArrayList<>();

		if(mobiles.containsKey(company)==false || mobiles.get(company)==null)
		{
			return null;
		}
		al = mobiles.get(company);
		return al;
	}

	public String buyMobile(String company, String model)
	{
		ArrayList<String> al = new ArrayList<>();
		al = mobiles.get(company);
		if(mobiles.containsKey(company)==true && al.contains(model)==true)
		{
			int j=0;

			if(al.contains(model))
			{
				j=al.indexOf(model);
				al.remove(j);
			}
			mobiles.put(company,al);
			return "mobile sold successfully";
		}
		return "item not available";
	}
}

public class Source 
{
	public static void main(String args[] ) throws Exception 
	{
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}