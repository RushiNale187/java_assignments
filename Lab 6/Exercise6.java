import java.util.*;

class Exercise6
{
	public static List<Integer> votesList(Map<Integer,Integer> people)
	{
		List<Integer> list = new LinkedList<>();

		Set<Map.Entry<Integer, Integer>> set = people.entrySet();
		
		Iterator<Map.Entry<Integer,Integer>> i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, Integer> entry = i.next();
			Integer id = entry.getKey();
			
			Integer age = entry.getValue();
			
			if(age > 18)
				list.add(id);
		}
		return list;
		
	}

	public static void main(String args[])
	{
		Map<Integer,Integer> people = new HashMap<>();
		
		people.put(101,25);
		people.put(102,12);
		people.put(103,43);
		people.put(104,8);

		List<Integer> list = votesList(people);
		System.out.println(list);
	}
}