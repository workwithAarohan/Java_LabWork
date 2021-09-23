package lab1;

import java.io.*;

public class ReadWrite 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader readFile = new BufferedReader(
                new FileReader(
                    "E:\\Files\\7thSem\\AdvanceJava\\file.txt")
            );

            BufferedWriter writeFile = new BufferedWriter(
                new FileWriter(
                    "E:\\Files\\7thSem\\AdvanceJava\\newestfile.txt")
            );

            String s;

            while((s = readFile.readLine()) != null)
            {
                System.out.println(s);
                writeFile.write(s +"\n");
            }
            
            readFile.close();

            writeFile.close();
        }
        catch(Exception e)
        {
            return;
        }
    }
}
