package interfaceEx;

interface InterA {
	String str = "a";
	public void getA();
	
}

interface InterB {
	public void getB(); 
}

// �������̽��� ������ ��� ����
interface InterC extends InterA, InterB {
	public void getC(); 
}

// class Child implements InterA, InterB, InterC 
// ���� ����ϰ� �����ϱ�

class Child implements InterC {
	
	@Override
	public void getC() {
		
	}
	
	@Override
	public void getB() {
		
	}
	
	@Override
	public void getA() {
		
	}
	
}

public interface InterfaceEx_02 {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.getA();
		c.getB();
		c.getC();
		
		System.out.println();
		
	}

}

