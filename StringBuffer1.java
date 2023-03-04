public class StringBuffer1
{
  public static void main(String[] args)
  {
    StringBuffer sb = new StringBuffer("Sudheer");
    System.out.println(sb);
    sb.append(" Vobilisetty");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.replace(1,8,"rudheer");
    System.out.println(sb);
    sb.delete(0,12);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.deleteCharAt(0);
    System.out.println(sb);
    
  }
}