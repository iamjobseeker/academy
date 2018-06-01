package manage;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		StudentService ss;
		
		ss = new StudentService();
		
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
		
		ss.calcSum();
		
		ss.calcAvg();
		
		System.out.println("\t===결과===\n");
		
		ss.printStu();
		
	}

}