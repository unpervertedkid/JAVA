package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;



public class Client {

  public Client(String address, int port) {
    //Establish a connection
    //Initialize  socket and input and output streams
    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream output = null;
    try {
      socket = new Socket(address, port);
      System.out.println("Connected");

      //Take input from terminal
      input = new DataInputStream(System.in);

      //Send output to socket
      output = new DataOutputStream(socket.getOutputStream());

    } catch(IOException uhe){
      System.out.println(uhe);
    }

    //String to read input from console
    String line = "";
    //Read until 'over' is input
    while(!line.equals("Over")){
      try {
        line = input.readLine();
        output.writeUTF(line);

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    //Close connection
    System.out.println("Closing connection....");
    try{
      input.close();
      output.close();
      socket.close();

      System.out.println("Connection Closed!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Client connection = new Client("127.0.0.1",5000);
  }
}
