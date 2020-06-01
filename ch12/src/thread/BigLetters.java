package thread;

public class BigLetters {

	public static void main(String[] args) {
		// 멀티쓰레드로 같이 돌아갈 객체 생성하기
		//Runnable r1 = new SmallLetters();
		//Thread t1 = new Thread(r1);
		//Thread t1 = new SmallLetters2();
		//Thread t1 = new NumLetters();
		Thread t1 = new SmallLetters2();
		t1.start();	// 스레드 시작하기
		System.out.println("Thread 1 Name : " + t1.getName());
		
		Thread t2 = new NumLetters();
		t2.start();
		System.out.println("Thread 2 Name : " + t2.getName());
		// 대문자 A-Z까지 출력하기
		for(char ch='A'; ch <= 'Z' ; ch++) {
			System.out.print(ch + "\t");
		}
		System.out.println("main Thread Name : " + Thread.currentThread().getName());
	}
}
