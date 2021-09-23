package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculation
{
    int firstNum, secondNum;

    Calculation(int num1, int num2)
    {
        firstNum = num1;
        secondNum = num2;
    }

    public void Addition() 
    {
        int add = firstNum + secondNum;
        System.out.println(
            firstNum + " + " + secondNum + " = " + add);    
    }

    public void Subtraction() 
    {
        int sub = firstNum - secondNum;
        System.out.println(
            firstNum + " - " + secondNum + " = " + sub);   
    }

    public void Multiplication() 
    {
        int mul = firstNum * secondNum;
        System.out.println(
            firstNum + " * " + secondNum + " = " + mul);    
    }

    public void Division() 
    {
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
        BufferedReader inp = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter First number: ");
        int num1 = Integer.parseInt(inp.readLine());

        System.out.print("Enter Second number: ");
        int num2 = Integer.parseInt(inp.readLine());

        // Creating object for Calculation class
        Calculation obj = new Calculation(num1,num2);


        obj.Addition();
        obj.Subtraction();
        obj.Multiplication();
        obj.Division();
          
    }    
}
