package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Java");
		list.add("JDBC");
		list.add("mysql");
		list.add(2,"mybatis");
		
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Java");
		set.add("JDBC");
		set.add("mysql");
		//set.add(2,"mybatis");	// index가 없음 오류
		set.add("mybatis");
		
		System.out.println(set);
		
	}

}
