package lab1;

public class Run implements Runnable
{
    @Override
    // Entry point to a new thread.
    public void run() 
    {
        System.out.println("The end.");
        
    }
    public static void main(String[] args) 
    {
        // Creating a thread using runnable
        Run obj = new Run();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("I did it.");
    }
}
