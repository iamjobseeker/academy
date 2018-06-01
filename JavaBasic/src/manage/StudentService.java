package manage;

public class StudentService {
	
	Student stu = new Student();
	
	// 생성자 (Constructor)
	public StudentService() {
		System.out.println("===성적관리 프로그램입니다===");
		System.out.println();
	}
	
	// 메소드 (Method)
	public void insertInfo(String name, int age) {
		stu.setName(name);
		stu.setAge(age);
	}
	
	public void insertScore(int kor, int eng, int math) {
		stu.setKor(kor);
		stu.setEng(eng);
		stu.setMath(math);		
	}
	
	public void calcSum() {
		int sum = stu.getKor()+stu.getEng()+stu.getMath();
		stu.setSum(sum);
	}
	
	public void calcAvg() { 
		double avg = ( stu.getSum() ) / 3.0;
		stu.setAvg(avg);
	}
	
	public void printStu( ) {
		System.out.println("이름: " + (stu.getName()));
		System.out.println("나이: " + stu.getAge());
		System.out.println("국어: " + stu.getKor());
		System.out.println("영어: " + stu.getEng());
		System.out.println("수학: " + stu.getMath());
		System.out.println("총점: " + stu.getSum());
		System.out.println("평균: " + stu.getAvg());
		
	}
	
	
}
