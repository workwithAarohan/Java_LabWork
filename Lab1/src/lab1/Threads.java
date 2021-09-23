package lab1;

public class Threads extends Thread
{
    public void run() 
    {
        // Using currentThread() and getName() method of Thread Class
        System.out.println(
            "Current Thread is " 
            + Thread.currentThread().getName());    
    }
    public static void main(String[] args) 
    {
        // Objects of Threading Class
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        Threads t3 = new Threads();

        // Executing start() of Thread Class
        t1.start();
        t2.start();
        t3.start();
    }    
}
