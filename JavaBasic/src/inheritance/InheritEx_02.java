package inheritance;

// 패키지에는 같은 이름의 클래스가 올 수 없다
class Parent02 {

	// 상속받아도 private은 사용할 수 없다
	//	private int num = 12;

	// 상속받은 경우 protected를 사용할 수 있다
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
		// 만약 main이 다른 패키지라면
		// protected 설정이라서 호출할 수 없다
	}
}
