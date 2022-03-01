package clientandServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram 
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(1254);
        Socket clientSocket = serverSocket.accept();
        Scanner inputFromClient = new Scanner(clientSocket.getInputStream());
        PrintWriter outputToClient = new PrintWriter(clientSocket.getOutputStream(), true);
        Scanner inputFromServer = new Scanner(System.in);

        String receivedMSG, sendMSG;

        do
        {
            System.out.print("Server: ");
            sendMSG = inputFromServer.nextLine();
            outputToClient.println(sendMSG);
            receivedMSG = inputFromClient.nextLine();
            System.out.println("Client: " + receivedMSG);
        }while(receivedMSG.equals("goodbye")!=true);

        outputToClient.close();
        inputFromClient.close();
        clientSocket.close();
        serverSocket.close();
    }
}
