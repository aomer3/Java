package y.notes.networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		
		try {
			//Create server socket 
			ServerSocket serverSocket = new ServerSocket(8082);
			
			//Start listening for client connections
			//socket allows you to listen to the client, receive data from the client and send data back to the client (if need be)
			System.out.println("Waiting for client to connect on port 8082...");
			Socket socket = serverSocket.accept();
			System.out.println("Connection established.");
			
			//Reads input from client
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			//Reads input and returns as String
			String data = dis.readUTF();

			System.out.println("Data received: " + data);
			dis.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
