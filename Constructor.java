public class Constructor
{
   Constructor()
   { 
      System.out.println("Hii This is default constructor");
   }
   Constructor(int a,int b,int c)
   {
      int res = a+b+c;
      System.out.println(res);
   }
     public static void main(String[] args)
     {
       Constructor obj = new Constructor();
       Constructor obj1 = new Constructor(10,20,30);
       System.out.println();
     }
}