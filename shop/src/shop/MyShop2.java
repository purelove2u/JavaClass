package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {
	private String title;	// 상점 이름 보관
	private User[] users = new User[2];
	private Product[] product = new Product[5];
	private Scanner sc = new Scanner(System.in);
	private Product[] carts = new Product[10];
	private String selUser; // 메인화면에서 선택된 사용자 값 담는 변수
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public void genUser() {
		// User 객체를 사용하여 쇼핑몰 이용자 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}
	@Override
	public void genProduct() {
		//CellPhone, SmartTV 객체를 사용하여 제품 생성
		product[0] = new CellPhone("갤럭시노트10", 1000000, "SKT");
		product[1] = new CellPhone("아이폰11", 1500000, "KT");
		product[2] = new CellPhone("샤오미", 500000, "LGU+");
		product[3] = new SmartTV("삼성UHD", 1500000, "4K");
		product[4] = new SmartTV("LGOLED", 3000000, "8K");
	}
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("===========================");
//		System.out.println("[0]"+users[0].getName()+"("+users[0].getPayType()+")");
//		System.out.println("[1]"+users[1].getName()+"("+users[1].getPayType()+")");
		int i = 0;
		for(User user : users) {
			System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
		}
		System.out.println("[x]종  료");
		System.out.print("선택 : ");
		String input = sc.next();
		System.out.println("## " + input + " 선택 ##");	//input : 0, 1, x
		
		// 0, 1 이면 productList 메소드를 호출
		// x 이면 프로그램 종료
		switch (input) {
		case "0": case "1":
			selUser = input;
			productList();
			break;
		case "x":
			System.out.println("프로그램을 종료합니다.");;
			break;
		default:
			System.out.println("입력 값을 확인해 주세요");
			start();
			break;
		}
	}
	
	public void productList() {
		System.out.println(title + " : 상품목록 - 상품선택");
		System.out.println("===========================");
		int i = 0;
		for(Product prod : product) {
			System.out.printf("[%d]", i++);
			prod.printDetail();
		}
		
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택 : ");
		String sel = sc.next();
		// 상품번호가 입력되면 장바구니에 해당상품 담기
		// h가 입력되면 메인화면 보여주기
		// c가 입력되면 checkOut() 호출
		switch(sel) {
		case "h" :
			start();
			break;
		case "c" :
			checkOut();
			break;
		case "0" : case "1" : case "2" : case "3" : case "4":
			for(int j = 0 ; j < carts.length ; j++) {
				if(carts[j] == null) {
					carts[j] = product[Integer.parseInt(sel)];
					System.out.println("상품이 장바구니에 담겼습니다.");
					break;
				}
			}
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요.");
			productList();
		}
	}
		
	public void checkOut() {
		System.out.println(title + " : 체크아웃 ");
		System.out.println("===========================");
		int i = 0;
		int sum = 0;
		for(Product p : carts) {
			if(p != null) {
				System.out.printf("[%d]%s(%d)\n", i, p.getPname(), p.getPrice());
				sum += p.getPrice();
				i++;				
			}
		}
		System.out.println("===========================");
		System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + sum + "원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택 : ");
		String input2 = sc.next();
		switch (input2) {
		case "p" :
			productList();
			break;
		case "q" :
			System.out.println("결재되었습니다.");
			break;
		default:
			System.out.println("입력값을 확인하세요.");
			checkOut();
			break;
		}
	}
}
