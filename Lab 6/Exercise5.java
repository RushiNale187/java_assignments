import java.util.*;
  
class Exercise5
{
    public static int func1(int arr[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
  
        for (int i = 0; i < arr.length; i++)
	{
            al.add(arr[i]);
	}
        Collections.sort(al);

	int secSmallest = al.get(1);

	return secSmallest;
    }
  
    public static void main(String[] args)
    {
  
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println("Second Smallest number is:"+func1(array));
    }
}