package sockets;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


  public Server(int port) {
    //Start server and wait for connection
    try {
      ServerSocket server = new ServerSocket(port);
      System.out.println("Server started");

      System.out.println("Waiting for client");

      //Initialization
      Socket socket = server.accept();
      System.out.println("Client accepted");

      //Take input from client
      DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

      //String to store input
      String line = "";
      //Read until encounter 'Over'
      while (!line.equals("Over")){
        try{
          line = input.readUTF();
          System.out.println(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      //Close connection
      System.out.println("Closing connection....");
      socket.close();
      input.close();
      System.out.println("Connection Closed!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Server server = new Server(5000);

  }
}
