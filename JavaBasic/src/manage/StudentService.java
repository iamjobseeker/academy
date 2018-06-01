package manage;

public class StudentService {
	
	Student stu = new Student();
	
	// ������ (Constructor)
	public StudentService() {
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
		System.out.println("�̸�: " + (stu.getName()));
		System.out.println("����: " + stu.getAge());
		System.out.println("����: " + stu.getKor());
		System.out.println("����: " + stu.getEng());
		System.out.println("����: " + stu.getMath());
		System.out.println("����: " + stu.getSum());
		System.out.println("���: " + stu.getAvg());
		
	}
	
	
}
