package inheritance;

class Parent04{
	public void display() {
		System.out.println("�θ�Ŭ����");
	}
}

class Child04 extends Parent04{
	@Override
	public void display() {
		System.out.println("�ڽ�Ŭ����");
	}
	
	public void out() {
		System.out.println("�ڽ� �޼ҵ� out");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		// �θ�
		Parent04 p = new Parent04();
		p.display();  
		
		System.out.println("-------");
		
		// �ڽ�
		Child04 c = new Child04();
		c.display();

		System.out.println("-------");
		
		// parent04�� child04�� ����
		// �ڽ�Ŭ������ �ʵ�, �޼ҵ尡 ���ȴ�
		// �ڽ�Ŭ���� Ÿ���� �θ�Ŭ���� Ÿ������ �ڵ�����ȯ, �ݴ�δ� �ȵ�
		// Parent04 pc =(Parent04) new Child04();
		// �ڹٴ� ���� ���ε��� ����Ѵ�
		//  ����				����
		Parent04 pc = new Child04();
		pc.display();
		
		// pc.out();
		// ȣ�� �ȵ�. ������Ÿ���� ���� ������
		// Parent04.out() �� �������� �����Ƿ� 
		( (Child04)pc ).out();

	}

}
