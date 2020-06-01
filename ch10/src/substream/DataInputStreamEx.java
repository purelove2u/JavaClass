package substream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamEx {
	public static void main(String[] args) {
		// 기본타입을 파일에 쓰고, 해당파일을 읽어오기
		try(FileOutputStream fos = new FileOutputStream("d:\\temp\\primitive.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("d:\\temp\\primitive.dat");
			DataInputStream dis = new DataInputStream(fis)) {
			
			//기본타입 쓰기
			dos.writeUTF("홍길동");
			dos.writeDouble(95.6);
			dos.writeInt(1);
			
			dos.writeUTF("성춘향");
			dos.writeDouble(94.6);
			dos.writeInt(2);
			
			//기본타입 읽어오기
			for(int i = 0; i < 2; i++) {
				String name = dis.readUTF();
				double jumsu = dis.readDouble();
				int num = dis.readInt();
				System.out.println(num + " : " + name + "(" + jumsu + ")");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
