package lab1;

public class ExceptionHandling 
{
    public void ArithmeticException() 
    {
        try
        {
            int num1 = 30, num2 = 0;

            System.out.println ("Output = " + num1/num2);
        }
        catch(ArithmeticException e)
        {
            System.out.println (
                "You cannot divide a number by zero");
        }
        
    }

    public void ArrayIndexOutOfBoundsException() 
    {
        try
        {
            int array[]= {1,2,3,4,5};
            
            System.out.println(array[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println (
                "ArrayIndexOutOfBoundsException: Data not found."
            );
        }
    }

    public void NullPointerException()
    {
        try
        {
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("This is NullPointerException.");
        }
    }

    public void NumberFormatException() 
    {
        try
        {
            int num = Integer.parseInt ("String") ;
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception occurred.");
        }
    }
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();

        obj.ArithmeticException();
        obj.ArrayIndexOutOfBoundsException();
        obj.NullPointerException();
        obj.NumberFormatException();
    }
}
