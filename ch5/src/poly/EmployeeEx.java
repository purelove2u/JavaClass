package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Worker worker = new Worker();
				
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		worker.work(employee);
		//work(employee);
		
		
		Ceo ceo = new Ceo();
		ceo.setName("심청이");
		ceo.setPosition("사장님");
		worker.work(ceo);
		//work(ceo);
		
		Adminstrator admin = new Adminstrator();
		admin.setName("김정우");
		admin.setPosition("관리자");
		worker.work(admin);
		//work(admin);
		
		PartTime part = new PartTime();
		part.setName("김알바");
		part.setPosition("알바");
		worker.work(part);
		//work(part);
	}
	// 부모요소의 method인 work 하나만 불러옴
//	public static void work(Employee employee) {
//		employee.work();
//	}
//	public static void ceo(Ceo ceo) {
//		ceo.work();
//	}
//	public static void Adminstrator(Adminstrator admin) {
//		admin.work();
//	}
//	public static void PartTime(PartTime part) {
//		part.work();
//	}
}
