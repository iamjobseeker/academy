package inheritance;

class Parent05{
	public void display() {
		System.out.println("�θ� Ŭ����");
	}
}

// class�� final�� ������ ����� �� �� ����
final class Child05 extends Parent05{
	
	// method�� final�� ������ �� �̻� override �� �� ����
	@Override
	public final void display() {
		System.out.println("�ڽ� Ŭ����");
	}
}

// ����� 1:1 ����
// parent�� Grandchild�� ������ ��ġ�� �ʴ´�
//class GrandChild05 extends Child05{
//	public void display() {
//		
//	}
//}

public class InheritEx_05 {
	public static void main(String[] args) {
		
	}
}
