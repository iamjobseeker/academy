package interfaceEx;

interface InterA {
	String str = "a";
	public void getA();
	
}

interface InterB {
	public void getB(); 
}

// 인터페이스간 여러개 상속 가능
interface InterC extends InterA, InterB {
	public void getC(); 
}

// class Child implements InterA, InterB, InterC 
// 보다 깔끔하게 정리하기

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

