package dml_query;

import java.sql.*;

public class DML_Query 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String DB_URL = "jdbc:mysql://localhost:3306/java_connectivity";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "";
            
            Connection con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            
            if(con!=null)
            {
                System.out.println("Database connection successful.");
            } 
            
            Statement stmt = con.createStatement();
            
            // DDL Statement - Create database table
            stmt.executeUpdate("CREATE TABLE employees(id INT, name VARCHAR(255))");
            
            System.out.println("New table employees Created");
            //Retrieving the data
            ResultSet rs = stmt.executeQuery("Show tables");
            System.out.println("+-------------------------------+");
            System.out.println("|          Table Name           |");
            System.out.println("+-------------------------------+");
            while(rs.next()) {
               System.out.println("|          " +rs.getString(1)+"\t\t|");
            }
            System.out.println("+-------------------------------+");
            
            con.close();
            
        } 
        catch (Exception e) 
        {
               System.out.println(e);
        }
    }
    
}
