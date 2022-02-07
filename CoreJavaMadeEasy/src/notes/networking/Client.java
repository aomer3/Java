package y.notes.networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		
		try {
			//Creating client socket
			Socket socket = new Socket("localhost",8082);
			//Sending data to server
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			//Write in String (instead of byte, etc.)
			dos.writeUTF("Java sockets are cool");
			dos.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
