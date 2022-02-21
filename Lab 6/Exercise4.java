import java.util.*;

class Exercise4
{
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Double> students)
	{
		HashMap<Integer,String> map = new HashMap<>();

		String medal = "";
		
		Set<HashMap.Entry<Integer, Double>> set = students.entrySet();
		
		Iterator<HashMap.Entry<Integer,Double>> i = set.iterator();
		
		while(i.hasNext())
		{
			HashMap.Entry<Integer, Double> entry = i.next();
			Integer regNum = entry.getKey();
			Double marks = entry.getValue();
			
			if(marks >= 90)
				medal = "Gold";
			else if(marks >= 80 && marks < 90)
				medal = "Silver";
			else if(marks >= 80 && marks < 90)
				medal = "Bronze";
			else
				continue;
			
			map.put(regNum,medal);
		}
		return map;
	}

	public static void main(String args[])
	{
		HashMap<Integer,Double> students = new HashMap<>();

		students.put(101,91.70);
		students.put(102,89.60);
		students.put(103,75.80);
		
		HashMap<Integer,String> hashmap = getStudents(students);
		System.out.println(hashmap);
	}
}