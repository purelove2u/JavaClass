package serializ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializaationEx {
	public static void main(String[] args) {
		//Person 객체를 파일에 쓰고 읽기
		Person p1 = new Person("홍길동", "엔지니어", "서울");
		Person p2 = new Person("성춘향", "선생님", "강원");
		
		try(FileOutputStream fos = new FileOutputStream("d:\\temp\\serial.dat");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("d:\\temp\\serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			os.writeObject(p1);
			os.writeObject(p2);
			
			// 객체 파일 읽기
			for(int i=0; i<2; i++) {
				Person person = (Person) ois.readObject();
				System.out.println(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
