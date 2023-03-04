public class MethOver
{
   public int add(int a,int b)
   { 
      return a+b;
   }
   public float add(float a,float b)
   {
       return a + b;
   }
    public static void main(String[] args)
    {
       MethOver obj = new MethOver();
       System.out.println("int : "+obj.add(10,20));
       System.out.println("float : "+obj.add(2.3f,5.5f));
    }
}