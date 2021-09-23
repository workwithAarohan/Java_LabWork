package lab1;

import java.io.*;

public class ReadFile 
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader file = new BufferedReader(
                new FileReader(
                    "E:\\Files\\7thSem\\AdvanceJava\\file.txt")
            );

            String s;

            while((s = file.readLine()) != null)
            {
                System.out.println(s);
            }
            file.close();
        }
        catch(Exception e)
        {
            return;
        }
    }
}