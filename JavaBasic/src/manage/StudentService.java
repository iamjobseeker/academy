package manage;

import java.util.Scanner;

public class StudentService {

	// student��� Ŭ������ �ڽ��� ����ʵ�� ������ ��
	// StudentService�� student��� Ŭ������ �����ϰ� �� 
	// ��������
	//	-�������� �����ڿ��� new�� �ʱ�ȭ����
	private Student stu;
	private Scanner sc;

	// ������ (Constructor)
	//	���� : ����ʵ� �ʱ�ȭ
	public StudentService() {
		stu = new Student();
		
		// �ν��Ͻ�ȭ �س����� �ѹ��� ȣ���ϸ� �ȴ�
		sc = new Scanner(System.in);
		System.out.println("===�������� ���α׷��Դϴ�===");
		System.out.println();
	}

	// �޼ҵ� (Method)
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
		// �����ϰ� ǥ��
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}

	private void calcAvg() { 
		
		stu.setAvg(stu.getSum()  / 3.0);
	}

	public void printStu( ) {
		System.out.println("�̸�: " + stu.getName());
		System.out.println("����: " + stu.getAge());
		System.out.println("����: " + stu.getKor());
		System.out.println("����: " + stu.getEng());
		System.out.println("����: " + stu.getMath());
		System.out.println("����: " + stu.getSum());
		System.out.printf("���: %.2f ", stu.getAvg());

	}

}
