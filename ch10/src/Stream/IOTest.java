package Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 출력하는 프로그램 작성
		// 조건 : 키보드에서 q가 입력되기 전까지 계속 받아들이도록 한다.

		try(Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("d:\\temp\\iotest.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			System.out.println("파일에 쓸 데이터를 입력해주세요.");
			System.out.println("그만두려면 q를 입력해주세요");
			
			String input = "";
			
			do {
				System.out.print(">>");
				input = sc.nextLine();
				if(!input.equals("q")) {
					bw.write(input);
					bw.newLine();
				}
				
			}while(!input.equals("q"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
