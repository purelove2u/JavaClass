package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// Lotto =>
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i < 6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			list.add(num);
//		}
//		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>();
		//for(; set.size() < 6 ;){
		//while(set.size() < 6){
		while(set.size() != 6) {;
			int num = (int)(Math.random()*45 + 1);
			set.add(num);
		}
		System.out.println(set);
	}

}
