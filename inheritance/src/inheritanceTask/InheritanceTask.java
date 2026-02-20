package inheritanceTask;

//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask {
	String name;
	int age;
	String address;
	String phoneNumber;
	
	public PersonTask() {;}
	public PersonTask(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}


	void work() {
		System.out.println("일을 한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}

//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
class StudentTask extends PersonTask {
	String instaID;
	
	public StudentTask() {;}

	public StudentTask(String name, int age, String address, String phoneNumber, String instaID) {
		super(name, age, address, phoneNumber);
		this.instaID = instaID;
	}
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}


//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
class EmployeeTask extends PersonTask{
	int secretMoney;
	
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phoneNumber, int secretMoney) {
		super(name, age, address, phoneNumber);
		this.secretMoney = secretMoney;
	}
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}

//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask {
   public static void main(String[] args) {
	   System.out.println("1. 사람");
	   PersonTask person = new PersonTask("홍길동", 20, "서울시 강남구", "010-1234-5678");
	   person.work();
	   person.sleep();
	   person.eat();
	   System.out.println();
	   
	   System.out.println("2. 학생");
	   StudentTask student = new StudentTask("장보고", 19, "경기도 하남시", "010-5678-1234", "shopping.Jang");
	   student.work();
	   student.sleep();
	   student.eat();
	   System.out.println();
	   
	   System.out.println("3. 직장인");
	   EmployeeTask employee = new EmployeeTask("장그래", 22, "경기도 수원시", "010-1111-2222", 200_000);
	   employee.work();
	   employee.sleep();
	   employee.eat();
	   
   }
}
