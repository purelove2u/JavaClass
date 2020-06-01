package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("hong12", "홍길동", "서울"));
		list.add(new MemberDTO("hong13", "김길동", "광주"));
		list.add(new MemberDTO("hong14", "박길동", "경기"));
		list.add(new MemberDTO("hong15", "이길동", "부산"));
		
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println();
		
		//MemberDTO가 가지고 있는 정보중에서 id가 hong14인
		//정보만 출력하고 싶다면?
		for(MemberDTO dto : list) {
			if(dto.getId().equals("hong14")) {
				System.out.println(dto);
			}
		}
		
		for(int i =0; i<list.size(); i++){
			if(list.get(i).getId().equals("hong14")){
				System.out.println(list.get(i));
			}
		}
	}
}
