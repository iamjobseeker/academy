package abstractEx;

abstract class Person {
	public String name; //�̸�
	
	// �߻�޼ҵ�
	public abstract void out() ;
}

class Professor extends Person {
	public String major; //����
	
	public Professor(String major) {
		this.major = major;
	}
	
	@Override
	public void out() {
		System.out.println("�����Դϴ�");
		System.out.println(major +"�� �����߽��ϴ�");
	}
	
}

class Student extends Person {
	public String subject; //����
	
	public Student(String subject) {
		this.subject = subject; 
	}
	
	@Override
	public void out() {
		System.out.println("�л��Դϴ�");
		System.out.println(subject+"������ ��� �ֽ��ϴ�");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
		// person�̶�� ������ Ÿ���� �迭
		Person[] arr = new Person[2];
		
		arr[0] = new Student("�ڹ�");
		arr[1] = new Professor("��ǻ�Ͱ���");
		
		arr[0].out();
		arr[1].out();
	}

}
