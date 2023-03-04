import java.util.*;
public class ConstructorOverloading1
{
  int sno;
  String name;
  String branch;
  ConstructorOverloading1(int sno,String name,String branch)
  {
     this.sno = sno;
     this.name = name;
     this.branch = branch;
     System.out.println("s.no:"+sno);
     System.out.println("Name:"+name);
     System.out.println("Branch:"+branch);
  }
  ConstructorOverloading1()
  { 
    System.out.println("default constructor");
  }
   public static void main(String[] args)
   { 
      ConstructorOverloading1 co = new ConstructorOverloading1 ();
      ConstructorOverloading1 co1 = new ConstructorOverloading1 (1,"sudheer","cse");
   }
}
