package lab1;

import java.io.*;

public class WriteFile 
{
    public static void main(String[] args) {
        try
        {
            BufferedWriter writeFile = new BufferedWriter(
                new FileWriter(
                    "E:\\Files\\7thSem\\AdvanceJava\\newfile.txt")
            );
             
            writeFile.write("This is awesome.");
            writeFile.close();
        }
        catch(Exception e)
        {
            return;
        }
    }
}
