package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {
	public static void main(String[] args) {

		String serverTip = "127.0.0.1";

		//서버와 통신하기 위한 소켓 생성
		try {
			System.out.println("[연결요청]");
			Socket socket = new Socket(serverTip, 7777);
			System.out.println("[연결성공]");
			
			// 소켓에 읽고 쓰기 위한 객체 생성
			Receiver receiver = new Receiver(socket);
			Sender sender = new Sender(socket);
			
			receiver.start();
			sender.start();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
