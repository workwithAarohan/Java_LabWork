package lab1;

class Areas
{
    double length, breadth;

    // Initializing variable for Rectangle 
    Areas()
    {
        length = 10.5;
        breadth = 5.4;
    }

    // Area of Rectangle
    public void calArea() 
    {
        double area = length * breadth;
        System.out.println("The area of rectangle is " + area);
    }

    // Area of Triangle
    public void calArea(double height, double breadth)
    {
        double area = (height * breadth)/2;
        System.out.println("The area of triangle is " + area);
    }
}

public class MethodOverloading
{
    public static void main(String[] args) throws Exception 
    {
        // Creating object for Area class and calling constructor
        Areas area = new Areas();

        // Method Overloading 
        area.calArea(); 
        area.calArea(5.5,3.2);

    }
}

