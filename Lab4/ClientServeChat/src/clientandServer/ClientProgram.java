package clientandServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram 
{
    public static void main(String[] args) throws IOException
    {
        Socket clientSocket = new Socket("localhost", 1254);

        Scanner inputFromServer = new Scanner(clientSocket.getInputStream());
        PrintWriter outputToServer = new PrintWriter(clientSocket.getOutputStream(),true);

        Scanner inputFromClient = new Scanner(System.in);

        String receivedMSG, sendMSG;

        do
        {
            receivedMSG = inputFromServer.nextLine();
            System.out.println("Server: " + receivedMSG );
            System.out.print("Client: ");
            sendMSG = inputFromClient.nextLine();
            outputToServer.println(sendMSG);
        }while(receivedMSG.equals("goodbye")!=true);

        inputFromServer.close();
        outputToServer.close();
        clientSocket.close();
    }
}
