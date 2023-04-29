class Test1 implements Runnable
{
    String name;
    int sleepDuration;
    public Test1(String name,int sleepDuration)
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

public class ThreadRunnableEx {
    public static void main(String[] args) {
        Test1 t1 = new Test1("Good Morning",1000);
        Test1 t2 = new Test1("Hello",2000);
        Test1 t3 = new Test1("Welcome",3000);
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
