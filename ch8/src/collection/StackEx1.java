package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		// 스택에 요소 담기
		stack.push("사과");
		stack.push("배");
		stack.push("포도");
		stack.push("키위");
		// 요소 가져오기
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + "\t");
		}
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("박보검");
		queue.offer("송중기");
		queue.offer("방탄");
		queue.offer("워너원");
		
		while(!queue.isEmpty()){
			System.out.println(queue.poll() + "\t");
		}
	}
}
