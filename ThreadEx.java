class MyThread extends Thread {
    String name;
    
    public MyThread(String name) {
       this.name = name;
    }
    
    public void run() {
        int i=0;
       while(i<20) {
          System.out.println(name);
          
          try {
             Thread.sleep(1000);
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
          i++;
       }
    }
 }
 public class ThreadEx {
    public static void main(String[] args) {
       MyThread thread1 = new MyThread("Thread 1(MAX priority)");
       MyThread thread2 = new MyThread("Thread 2");
       thread1.start();
       thread2.start();
       thread1.setPriority(Thread.MAX_PRIORITY);
    
    }
 }
 