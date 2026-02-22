package inheritancePractice;

class Employee {
//	1. private 붙이기
	private String name;
	private String department;
	
//	2. 기본 생성자 선언
	public Employee() {;}

//	3. 초기화 생성자 선언
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

//	4. getter, setter 만들기
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
//	메서드 앞에 public 붙이기
	public void work() {
		System.out.println("업무를 봅니다.");
	}
}

class Developer extends Employee {
//	상속을 받는 클래스도 똑같이 1~4번 진행
//	1. 필드에 private 붙이기
	private String mainLanguage;
	
//	2. 기본 생성자 선언
	public Developer() {;}

//	3. 초기화 생성자 선언
//	부모에 있는거 가져오기
	public Developer(String name, String department, String mainLanguage) {
//		부모 생성자 호출
		super(name, department);
		this.mainLanguage = mainLanguage;
	}
	
	@Override
	public void work() {
		System.out.println("코드를 작성하고 버그를 수정합니다.");
	}
}

class ProjectManager extends Employee {
	private String manageProject;
	
	public ProjectManager() {;}

	public ProjectManager(String name, String department, String manageProject) {
		super(name, department);
		this.manageProject = manageProject;
	}
	
	public void work() {
		System.out.println("프로젝트 일정을 관리하고 회의를 주재합니다.");
	}
}

public class InheritPractice1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Developer dev = new Developer("김개발", "백엔드", "Java");
		ProjectManager pm = new ProjectManager("이팀장", "기획팀", "Failog");
		
		System.out.println("[" + dev.getName() + " 개발자]");
		dev.work();
		System.out.println();
		
		System.out.println("[" + pm.getName() + " PM]");
		pm.work();
		
	}
}
