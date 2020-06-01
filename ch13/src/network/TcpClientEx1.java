package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientEx1 {
	public static void main(String[] args) {
		// 클라이언트가 서버에 요청하기 위한 소켓 생성
		Socket socket = null;
		String serverIp = "192.168.0.9";
		
		System.out.println("[연결 요청]");
		try {
			socket = new Socket(serverIp, 5001);
			System.out.println("[연결 성공]");
			
			// 서버로 메시지 보내기
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("집에 가고 싶다........");
			
			// 서버가 보내는 메시지를 읽기 위한 스트림 생성
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println(dis.readUTF());
			
			dis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
