package manage;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		StudentService ss;
		
		ss = new StudentService();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸��� �Է����ּ���. ");
		String name = input.nextLine();
		System.out.print("���̸� �Է����ּ���. ");
		int age = input.nextInt();
		
		ss.insertInfo(name, age);
		
		System.out.print("���������� �Է����ּ���.");
		int kor = input.nextInt();
		System.out.print("���������� �Է����ּ���.");
		int eng = input.nextInt();
		System.out.print("���������� �Է����ּ���.");
		int math = input.nextInt();
		
		ss.insertScore(kor, eng, math);
		
		ss.calcSum();
		
		ss.calcAvg();
		
		System.out.println("\t===���===\n");
		
		ss.printStu();
		
	}

}