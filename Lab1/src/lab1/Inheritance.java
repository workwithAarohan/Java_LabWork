package lab1;

class Staff
{
    String code;
    String name;

    // Passing value using Constructor
    Staff(String Code, String Name)
    {
        code = Code;
        name = Name;
    }

    public void details() 
    {
        System.out.print(
            "\nCode: " + code + "\tName: " + name
            );    
    }
}

class Teacher extends Staff
{
    String subject;
    String publication;

    // Passing value using Constructor
    Teacher(
        String Code, 
        String Name, 
        String Subject,
        String Publication) 
    {
        super(Code, Name);
        subject = Subject;
        publication = Publication;
    }

    public void subjectDetails() 
    {
        System.out.println(
            "\tSubject: " + subject + "\tPublication: " + publication
            );    
    }
    
}

class Officer extends Staff
{
    double grade;

    // Passing value using Constructor
    Officer(
        String Code, 
        String Name, 
        double Grade) 
    {
        super(Code, Name);
        grade = Grade;
    }

    public void gradeDetails() 
    {
        System.out.print("\tGrade: " + grade); 
    }
    
}

public class Inheritance 
{
    public static void main(String[] args) 
    {
        // Creating Teacher Class object
        Teacher obj1 = new Teacher(
            "TCH01", 
            "Trilokya Raj Ojha", 
            "Advance Java", 
            "Anything Publication");

        // Calling Staff Class Method with Teacher object
        obj1.details(); 
        // Calling Teacher Class Method
        obj1.subjectDetails();  
        
        // Creating Officer Class object
        Officer obj2 = new Officer(
            "OFR10",
            "Aarohan Nakarmi",
            8.9);
        
        // Calling Staff Class Method with Officer object
        obj2.details(); 
        // Calling Officer Class Method
        obj2.gradeDetails();    
    }
}
