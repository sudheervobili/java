import java.util.*;
public class Flames {
    
    
    
    public static void main(String[] args)
    {
        String name1;
        String name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name1 : ");
        name1 = sc.next();
        System.out.println("Enter name2 : ");
        name2 = sc.next();
        System.out.println("Name1 : "+name1);
        System.out.println("Name2 : "+name2);
        Flames obj = new Flames();
        obj.str_to_char(name1,name2);
    }
    void str_to_char(String name1,String name2)
    {
        int size1 = name1.length();
        int size2 = name2.length();
        char[] Name1 =  new char[size1];
        char[] Name2 = new char[size2];
        for(int i=0;i<size1;i++)
        {
            Name1[i] = name1.charAt(i);
        }
        /*for(char x: Name1)
        {
            System.out.println(x);
        }*/
        for(int i=0;i<size2;i++)
        {
            Name2[i] = name2.charAt(i);
        }
        /*for(char x: Name2)
        {
            System.out.println(x);
        }*/
    }
    void compare(char Name1,char Name2)
    {
        for(int i=0;i<Name1.length();i++)
        {
            for(int j=0;j<Name2.length();j++)
            {
                if(Name1[i] == Name2[j])
                {

                }
            }
        }
    }
    
}

