package lab1;

public class TryCatch
{
    public static void catchMeIfYouCan(int num1, int num2) 
    {
        try 
        {
          System.out.println("Num1/Num2: " + num1/num2);
        } 
        catch (Exception e) 
        {
          System.out.println("Please check your code.");  
        }
        finally
        {
            System.err.println("Done.");
        }
    }
    public static void checkNum(int num1,int num2) 
    {
        if(num2 == 0)
        {
            throw new ArithmeticException("Can't go pass this.");
        }
        else
        {
            System.out.println(num1/num2);
        }
    }
    public static void main(String[] args) throws Exception
    {
        System.out.println("From try-catch-finally statement.");
        // Try-catch-finally statement
        catchMeIfYouCan(5,0);

        System.out.println("\nFrom throw statement.");
        // Throw statement
        checkNum(5,0);
    }  
}
