package lab1;

class RectangleArea
{
    double length = 10.5;
    double breadth = 5.4;

    // Area of Rectangle Calculation
    public void calArea() 
    {
        double area = length * breadth;
        
        System.out.println("The area of rectangle is " + area);
    }
}

class TriangleArea
{
    double height = 5.5;
    double breadth = 3.2;

    // Area of Triangle Calculation
    public void calArea() 
    {
        double area = (height * breadth);

        System.out.println("The area of rectangle is " + area);
    }
}

public class Area
{
    public static void main(String[] args) 
    {
        // Creating object of Rectangle Class
        RectangleArea areaRec = new RectangleArea();
        areaRec.calArea(); // Calling calArea method of Rectangle Class

        // Creating object of Triangle Class
        TriangleArea areaTri = new TriangleArea();
        areaTri.calArea();  // Calling calArea method of Triangle Class
    }
}
