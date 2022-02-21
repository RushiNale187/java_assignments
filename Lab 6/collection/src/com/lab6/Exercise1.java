package com.lab6;

import java.util.*;

public class Exercise1
{
	public static List<String> getValues(HashMap<Integer,String> map)
	{
		List<String> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}
	
	public static void main(String args[])
	{
		HashMap<Integer,String> hashmap = new HashMap<>();
		
		hashmap.put(3,"abc");
		hashmap.put(2,"xyz");
		hashmap.put(1,"pqr");
		hashmap.put(4,"lmn");

		List<String> list = getValues(hashmap);
	
		System.out.println(list);
	}
}