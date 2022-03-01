package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculation
{
    public static int firstNum, secondNum;


    // int firstNum, secondNum;

    // Calculation(int num1, int num2)
    // {
    //     firstNum = num1;
    //     secondNum = num2;
    // }

    public static void input() throws NumberFormatException, IOException
    {
        BufferedReader inp = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter First number: ");
        firstNum = Integer.parseInt(inp.readLine());

        System.out.print("Enter Second number: ");
        secondNum = Integer.parseInt(inp.readLine());
    }

    public void Addition() throws NumberFormatException, IOException
    {
        System.out.println("**** Addition Operation ****");
        input();

        int add = firstNum + secondNum;
        System.out.println(
            firstNum + " + " + secondNum + " = " + add);    
    }

    public void Subtraction() throws NumberFormatException, IOException 
    {
        System.out.println("**** Subtraction Operation ****");
        input();
        
        int sub = firstNum - secondNum;
        System.out.println(
            firstNum + " - " + secondNum + " = " + sub);   
    }

    public void Multiplication() throws NumberFormatException, IOException 
    {
        System.out.println("**** Multiplication Operation ****");
        input();

        int mul = firstNum * secondNum;
        System.out.println(
            firstNum + " * " + secondNum + " = " + mul);    
    }

    public void Division() throws NumberFormatException, IOException 
    {
        System.out.println("**** Division Operation ****");
        input();
        try 
        {
            System.out.println(
                firstNum + " / " + secondNum + " = " + 
                firstNum/secondNum);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Can't divide number by 0.");
        }
    }
}

public class ReadInput 
{
    public static void main(String[] args) throws IOException 
    {
        // Creating object for Calculation class
        Calculation obj = new Calculation();

        obj.Addition();
        obj.Subtraction();
        obj.Multiplication();
        obj.Division();
          
    }    
}
