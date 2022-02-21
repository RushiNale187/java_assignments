class Activity
{
  String string1;
  String string2;
  String operator;

  Activity(String string1,String string2,String operator)
  {
    this.string1 = string1;
    this.string2 = string2;
    this.operator = operator;
  }
}

public class Source 
{
  public String handleException(Activity a)
  {
    String result = "";

    try
    {
      if((a.string1.equals(null)) || (a.string2.equals(null)))
      {
        throw new NullPointerException("Null values found");
      }
      if(!(a.operator.equals("+")) && !(a.operator.equals("-")))
      {
        throw new Exception("default exception"+a.operator);
      }
    }
    catch(NullPointerException npe)
    {
      result = "Null values found";
      return result;
    }
    catch(Exception e)
    {
      result = "default exception"+a.operator;
      return result;
    }
    return "No Exception Found";
  }

  public String doOperation(Activity a)
  {
    String result = "";

    switch(a.operator)
    {
      case "+": result = a.string1+a.string2;
                break;
      case "-": result = a.string1.replace(a.string2,"");
                break;
    }
    return result;
  }

	public static void main(String args[] ) throws Exception 
  {
    //Write your own main to check the program...
	}
}