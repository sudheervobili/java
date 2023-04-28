class MyThread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread2");
            try {
                Thread.sleep(2000);
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
        }

    }
} 
class MyThread1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1");
            try {
                Thread.sleep(460);
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
        }

    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        MyThread2 t2 =  new MyThread2();
        MyThread1 t1 =  new MyThread1();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        try{
            th1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        th2.start();
    }
}
