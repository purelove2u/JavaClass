package lambda;

public class LamdaTest1 {
	int max(int a, int b) {
		return a > b ? a: b;
	}
	
	/*  방법 ①
	 *  (int a, int b) -> {
		       return a > b ? a: b;
	    }
	 * 
	 *  방법 ② 실행할 문장이 하나라면 중괄호 생략 가능
	 *  (int a, int b) ->  return a > b ? a: b;
	 *  
	 *  방법 ③ 
	 *  (a,b) ->  return a > b ? a: b;
	 */
	
	
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	/*  
	 *  (String name, int i) -> {
			System.out.println(name + "=" + i);
		}
	 * 
	 * 
	 *  (String name, int i) ->  System.out.println(name + "=" + i);
		
	 *  
	 *  (name,i) ->  System.out.println(name + "=" + i);	 * 
	 * 
	 */
	
	int square(int x) {
		return x * x;
	}
	/*
	 *  (int x) -> {
			return x * x;
		}
	 * 
	 *  (int x) -> 	return x * x;
		
	 *   (x) -> return x * x;
	 * 
	 */
	
	int roll() {
		return (int)(Math.random()*6);
	}
	
	/*
	 *  () -> {
		return (int)(Math.random()*6);
	    }
	 * 
	 * 
	 *  () -> return (int)(Math.random()*6);
	    
	 *  () -> (int)(Math.random()*6);
	 */
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
	
	/*
	 *    (int[] arr) -> {
			int sum = 0;
			for(int i:arr)
				sum+=i;
			return sum;
		  }
	 * 
	 * 
	 * 
	 */
	
}










