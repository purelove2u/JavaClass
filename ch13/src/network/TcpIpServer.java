package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
	public static void main(String[] args) {
			
		// 클라이언트의 요청을 감지하는 객체
		ServerSocket serverSocket = null;
		
		// 클라이언트와 연결 객체
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비 되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("클라이언트의 연결 요청을 기다립니다.");
			// 클라이언트의 요청이 들어오면 수락 후 소켓 생성
			try {
				socket = serverSocket.accept();

				// 소켓에 내용을 출력하는 스레드 생성
				Sender sender = new Sender(socket);
				// 소켓에 내용을 읽어오는 스레드 생성
				Receiver receiver = new Receiver(socket);
				
				sender.start();
				receiver.start();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
