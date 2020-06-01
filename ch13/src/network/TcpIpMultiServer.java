package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultiServer {

		private HashMap<String, DataOutputStream> clients;
		public TcpIpMultiServer() {
			clients = new HashMap<String, DataOutputStream>();
			Collections.synchronizedMap(clients);
		}

	public static void main(String[] args) {
		new TcpIpMultiServer().start();
	}
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "]");
				
				ServerReceiver sReceiver = new ServerReceiver(socket);
				sReceiver.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class ServerReceiver extends Thread{
		private Socket socket;
		private DataOutputStream dos;
		private DataInputStream dis;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("@ " + name + " 님 입장");
				
				clients.put(name, dos);
				System.out.println("서버 접속자 수 : " + clients.size() + "명");
				
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				clients.remove(name);
				sendToAll("@ " + name + " 님 퇴장");
				System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + " 접속 종료 ]");
				System.out.println("서버 접속자 수 : " + clients.size() + " 명");
			}
		}
		
		public void sendToAll(String msg) {
			Iterator<String> it = clients.keySet().iterator();
			while(it.hasNext()) {
				DataOutputStream dos = clients.get(it.next());
				try {
					dos.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
