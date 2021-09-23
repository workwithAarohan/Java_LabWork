package java_connectivity;

import java.sql.*;
import java.util.Scanner;

public class Java_Connectivity 
{
    private static Connection con = null;
    
    public Java_Connectivity() throws ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String DB_URL = "jdbc:mysql://localhost:3306/java_connectivity";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";
            
            con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            
            if(con!=null)
            {
                System.out.println("Database connection successful.");
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    
    public void ChooseOperation(Scanner sc)
    {
        System.out.println("Press 1 to READ from Users");
        System.out.println("Press 2 to INSERT in Users");
        System.out.println("Press 3 to UPDATE in Users");
        System.out.println("Press 4 to DELETE from Users");
        
        System.out.print("Enter any of above number: ");
        String choice = sc.nextLine();
        
        switch (choice)
        {
            case "1" -> READ();

            case "2" -> CREATE(sc);

            case "3" -> UPDATE(sc);

            case "4" -> DELETE(sc);

            default -> {
            }
        }
    }
    
    public static void READ()
    {
        try
        {
            String query = "SELECT * FROM users";
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) 
            {
                System.out.print("Roll No.: " + rs.getString("roll_no"));
                System.out.print(",\tName: " + rs.getString("name"));
                System.out.println(", \t\tAddress: " + rs.getString("address"));
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        } 
    }
    
    public static void CREATE(Scanner sc)
    {
        try
        {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter address: ");
            String address = sc.nextLine();
            
            String query = "INSERT INTO users (name,address)" 
                    + "VALUES (?,?)";
     
            PreparedStatement pst = con.prepareStatement(query);
        
            pst.setString(1,name);
            pst.setString(2,address);
        
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) 
            {
                System.out.println("A new user was inserted successfully!");
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }       
    }
    
    public static void UPDATE(Scanner sc)
    {
        try
        {
            System.out.print("Enter Roll No: ");
            String roll_no = sc.nextLine();

            System.out.print("Enter name to update: ");
            String new_name = sc.nextLine();

            System.out.print("Enter address to update: ");
            String new_address = sc.nextLine();

            String query = "UPDATE users SET name=?, address=? WHERE roll_no =?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, new_name);
            pst.setString(2, new_address);
            pst.setString(3, roll_no);

            int rowUpdated = pst.executeUpdate();
            if(rowUpdated >0)
            {
                System.out.println("Update successful.");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
    public static void DELETE(Scanner sc)
    {
        try
        {
            System.out.print("Enter roll_no: ");
            String roll_no = sc.nextLine();
            
            String query = "DELETE FROM users WHERE roll_no=?";
            PreparedStatement  pst = con.prepareStatement(query);
            
            pst.setString(1,roll_no);
            
            int rowDeleted = pst.executeUpdate();
            
            if (rowDeleted >0)
            {
               System.out.println("Data deleted successfully.");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
   
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        Java_Connectivity obj = new Java_Connectivity();
        
        Scanner sc = new Scanner(System.in);
        
        String res = "n";
        
        do
        {
            obj.ChooseOperation(sc);

            System.out.print("Do you want to continue more? (y/n): ");
            res = sc.nextLine();
        } while ("Y".equals(res.toUpperCase()));
        
        con.close();
    }
}