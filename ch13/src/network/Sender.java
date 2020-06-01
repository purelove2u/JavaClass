package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {
	
	Socket socket;
	OutputStream out;
	DataOutputStream dos;
	String name;
	
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				dos.writeUTF(name + sc.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
