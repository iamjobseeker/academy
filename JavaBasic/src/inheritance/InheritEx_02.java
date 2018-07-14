package inheritance;

// ��Ű������ ���� �̸��� Ŭ������ �� �� ����
class Parent02 {

	// ��ӹ޾Ƶ� private�� ����� �� ����
	//	private int num = 12;

	// ��ӹ��� ��� protected�� ����� �� �ִ�
	protected int num = 13;

	protected void display() {
		System.out.println("num2: " + num);
	}
} 

class Child02 extends Parent02{
	public void display() {
		System.out.println("num: " + super.num);
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		Child02 c = new Child02();
		c.display();
		
		Parent02 p = new Parent02();
		p.display();
		// ���� main�� �ٸ� ��Ű�����
		// protected �����̶� ȣ���� �� ����
	}
}
