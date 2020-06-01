package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServerEx1 {
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			// 클라이언트의 연결 요청을 기다리면서 연결 수락을 담당하는 클래스
			server = new ServerSocket(5001);
			
			while(true) {
				System.out.println(getTime() + "[클라이언트 연결 기다리는 중]");

				// 클라이언트로부터 요청이 들어오면 수락 후 새로운 소켓 생성
				Socket socket = server.accept();
				System.out.println(getTime() + " " + socket.getInetAddress() + " 로부터 연결 요청 들어옴");
				
				// 연결된 소켓에 내용을 쓰기 위해 출력 스트림 얻기
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("호구 왔는가~~");
				
				// 클라이언트가 보내는 메시지 읽기
				InputStream in = socket.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				
				System.out.println(dis.readUTF());
				
				dos.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getTime() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
}
