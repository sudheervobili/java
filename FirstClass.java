import java.util.*;
public class FirstClass
{
  public static void main(String[] args)
  {
    
	Second sc = new Second();
	System.out.println("The sum of x and y = "+sc.getvalue(10,20));
      
  }
}
class Second
{
  
  int getvalue(int x,int y)
  {
      return x+y;
  }
}
    