import java.util.*;
public class Flames
{
    public static void main(String[] args)
    {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name1 : ");
        str1 =  sc.next();
        System.out.println("Enter name2 : ");
        str2 = sc.next();
        System.out.println("name1 : "+str1);
        System.out.println("name2 : "+str2);
        Flames obj = new Flames();
        obj.str_to_char(str1,str2);
    }
    void str_to_char(String str1,String str2)
    {
        int ch1 = str1.length();
        int ch2 = str2.length();
        char[] Name1 = new char[ch1];
        char[] Name2 = new char[ch2];
        int count1=0;
        int count2=0;
        int total;
        for(int i=0;i<str1.length();i++)
        {
            Name1[i] = str1.charAt(i);
        }
        /*for(char x:Name1)
        {
            System.out.println(x);
        }*/
        for(int i=0;i<str2.length();i++)
        {
            Name2[i] = str2.charAt(i);
        }
        /*for(char y : Name2)
        {
            System.out.println(y);
        }*/
        if(Name1.length>Name2.length){
        for(int i=0;i<Name1.length;i++)
        {
            for(int j=0;j<Name2.length;j++)
            {
                if (Name1[i] == Name2[j])
                {
                    Name1[i] = Name2[j] =  '*';
                }
            }
        }
        }
        else
        {
            for(int j=0;j<Name2.length;j++)
            {
                for(int i=0;i<Name1.length;i++)
                {
                    if (Name1[i] == Name2[j])
                    {
                        Name1[i] = Name2[j] = '*';
                    }
                }   
        }

        }
        for(char x : Name1)
        {
            System.out.print(x);
            
        }
        System.out.println();
        for(char y : Name2)
        {
            System.out.print(y);
        }
        //counting no.of remaing characters in Name1
        int ch3 = Name1.length;
        int ch4 = Name2.length;
        for(int i = 0;i<ch3;i++)
        {   if((Name1[i]>='A'&&Name1[i]<='Z')|| (Name1[i]>='a'&& Name1[i]<='z'))
            {
                 count1 = count1+1;
           
         }
        }
        //System.out.println(count1);
        for(int i = 0;i<ch4;i++)
        {
            if((Name2[i]>='A'&&Name2[i]<='z')||(Name2[i]>='a'&&Name2[i]<='z'))
            {
                count2 = count2+1;
            }
        }
        //System.out.println(count2);
        total = count1+count2;
        //System.out.println(total); 
    }
    void check_flames(int total)
    {
        char[] flames = new char[]{'F','L','A','M','E','S'};
        for(int i=0;i<total.length;i++)
        {
            
        }
    }
}
