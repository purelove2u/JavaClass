package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Receiver extends Thread {
	
	Socket socket;
	InputStream in;
	DataInputStream dis;
	String name;
	
	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(dis != null) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
