package Test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// int형 배열을 선언 후 사용자의 입력에 맞춰 배열을 생성한다.
		//int arr[] = new int[5];
		// 배열선언 
		int arr[] = null;
//		// 배열생성
//		arr = new int[5];
//		//배열 초기화
//		arr[0] = 15;
//		arr[1] = 20;
		
		// 생성된 배열요소의 초기화를 위해 사용자로부터 값을 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.println("생성하고자 하는 배열의 크기 : ");
		int size = sc.nextInt();
		
		arr = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			System.out.printf("%d 번째 요소 입력 : ", (i+1));
			arr[i] = sc.nextInt(); 
		}
		// 배열 전체 요소를 출력
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("생성된 배열 요소");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
