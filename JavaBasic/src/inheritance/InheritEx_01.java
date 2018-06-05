package inheritance;

class Parent{
	String name;
	int num;	
	int age;

	// �޼ҵ嵵 ����� �ȴ�.
	public void display() {
		System.out.println("�θ� Ŭ���� �޼ҵ�");
	}
}

class Child extends Parent { 
	int score; // parent���� ���� child���� �����ϴ� �ڵ�

	public void print() { 
		
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");

		display(); // Ŭ���� �߰�ȣ �������� ����� ������ �νĵȴ�
		
		this.display(); // this : �ڽ��� Ŭ������ ��Ī

		super.display(); // super : �θ�Ŭ���� ���� ��ü
		
	}

	@Override // ������̼�, annotation
	// �ּ�, ���� + ������� (��ġ���� ������ error�� ǥ����)
	public void display() {
		// ������ �޼ҵ�
		// �θ� Ŭ�������� ���� �޼ҵ带 �������Ͽ� ����Ѵ�.
		System.out.println("������ �޼ҵ�");
	}

} 

public class InheritEx_01 {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.num = 111;
		System.out.println(p.num);

		Child c = new Child();
		c.num=222;
		System.out.println(c.num);

		System.out.println("--------");
		p.display();
		c.display(); 

		System.out.println("--------");
		c.print();

	}
}
