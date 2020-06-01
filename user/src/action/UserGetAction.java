package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserGetService;

public class UserGetAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.print("조회할 사용자의 no를 입력해 주세요. : ");
		int no = sc.nextInt();
		
		UserGetService service = new UserGetService();
		UserVO vo = service.getUser(no);
		
		System.out.println("\n================ 사용자 정보 ================");
		System.out.print(vo.getNo()+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getBirthday()+"\t");
		System.out.print(vo.getAddress()+"\n\n");
		
	}

}
