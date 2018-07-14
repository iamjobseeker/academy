package manage;

import java.util.Scanner;

public class StudentService {

	// student라는 클래스를 자신의 멤버필드로 가지게 됨
	// StudentService가 student라는 클래스를 포함하게 됨 
	// 참조형임
	//	-참조형은 생성자에서 new로 초기화해줌
	private Student stu;
	private Scanner sc;

	// 생성자 (Constructor)
	//	목적 : 멤버필드 초기화
	public StudentService() {
		stu = new Student();
		
		// 인스턴스화 해놓으면 한번만 호출하면 된다
		sc = new Scanner(System.in);
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
		calcSum();
		calcAvg();
	}

	private void calcSum() {
		// 간략하게 표현
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}

	private void calcAvg() { 
		
		stu.setAvg(stu.getSum()  / 3.0);
	}

	public void printStu( ) {
		System.out.println("이름: " + stu.getName());
		System.out.println("나이: " + stu.getAge());
		System.out.println("국어: " + stu.getKor());
		System.out.println("영어: " + stu.getEng());
		System.out.println("수학: " + stu.getMath());
		System.out.println("총점: " + stu.getSum());
		System.out.printf("평균: %.2f ", stu.getAvg());

	}

}
