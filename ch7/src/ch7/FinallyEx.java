package ch7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("new.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally { //Exception이 발생하든지, 안하던지 무조건 실행되는 블럭
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileInputStream in = new FileInputStream("file.txt")){
			
		}catch(Exception e) {
			
		}
	}
}
