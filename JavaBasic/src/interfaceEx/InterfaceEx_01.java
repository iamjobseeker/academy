package interfaceEx;

interface Inter_02 {
	public void out();
}

interface Inter_03 {
	public void out();
}

class Parent {
	public void out() {
		System.out.println("�θ�");
	}
}

class ClassTest_01 extends Parent
			implements Inter_02, Inter_03 {
	@Override
	public void out() {
		System.out.println("�ڽ�");
	}
}

// 2���� �������̽��� ����(���߻��) ���� �� ���� 
// interface�� �ϼ�ǰ�� �ƴϱ� ����
abstract class ClassTest implements Inter_02, Inter_03 {
	@Override
	public void out() {
	}
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		// abstract�� �θ��� ���� �ƴ� override�� �ڽ��� ���� ���´�
		ClassTest_01 ct = new ClassTest_01();
		ct.out();
	}
}

// ���߻�� 
class Parent1 {
	public void out() {
		
	}
}

class Parent2 {
	public void out() {
		
	}
}

// �ڹٴ� ���߻���� �����ϰ� �ִ�.
// class Child extends Parent1, Parent2{
//	
// }

