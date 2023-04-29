class Test extends Thread
{
    String name;
    int sleepDuration;
    public Test(String name,int sleepDuration)
    {
        this.name = name;
        this.sleepDuration = sleepDuration;
    }
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println(this.name);
        
        try{
            Thread.sleep(sleepDuration);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    }
}

public class ThreadEx_10 {
    public static void main(String[] args) {
        Test t1 = new Test("Good Morning",1000);
        Test t2 = new Test("Hello",2000);
        Test t3 = new Test("Welcome",3000);
        t1.start();
        t2.start();
        t3.start();
    }
}
