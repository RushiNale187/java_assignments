import java.util.*;

class ArrayListOps 
{
   public ArrayList<Integer> makeArrayListInt(int n)
   {
	   ArrayList<Integer> al = new ArrayList<>();

	   for(int i=0;i<n;i++)
	   {
		   al.add(0);
	   }
	   return al;
   }

   public ArrayList<Integer> reverseList(ArrayList<Integer> list)
   {
	   ArrayList<Integer> rev = new ArrayList<>();

	   for(int i=list.size()-1;i>=0;i--)
	   {
		   rev.add(list.get(i));
	   }
	   return rev;
   }

   public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   if(list.get(i)==m)
		   {
			   list.set(list.indexOf(m),n);
		   }
	   }
	   return list;
   }
}
public class Source
{
	public static void main(String[] args) 
	{

	}
}