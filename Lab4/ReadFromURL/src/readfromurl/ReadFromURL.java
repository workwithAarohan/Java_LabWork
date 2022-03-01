package readfromurl;

import java.io.*;
import java.net.*;

public class ReadFromURL 
{
    public static void main(String[] args) 
    {
        StringBuilder content = new StringBuilder();
    
        try 
        {
            URL url = new URL("https://sumanchapagain725.com.np/");
            
//            URLConnection urlcon = url.openConnection();
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
//            InputStream stream = urlcon.getInputStream();
            
            String line;
            
            while((line = bufferedReader.readLine())!= null)
            {
//                content.append(line + "\n");
                System.out.println(line);
            }
            bufferedReader.close();
            
//            System.out.println(content.toString());
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
    
}
