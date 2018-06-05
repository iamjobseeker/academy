package manage;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		// Student를 관리하는 기능제공 클래스
		// Student 생성자가 시작된다
		StudentService ss = new StudentService();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요. ");
		String name = input.nextLine();

		System.out.print("나이를 입력해주세요. ");
		int age = input.nextInt();
		
		ss.insertInfo(name, age);
		
		System.out.print("국어점수를 입력해주세요.");
		int kor = input.nextInt();
		System.out.print("영어점수를 입력해주세요.");
		int eng = input.nextInt();
		System.out.print("수학점수를 입력해주세요.");
		int math = input.nextInt();
		
		ss.insertScore(kor, eng, math);
		
		System.out.println("\n\t===결과===\n");
		
		ss.printStu();
		
	}

}