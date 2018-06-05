package inheritance;

class Parent{
	String name;
	int num;	
	int age;

	// 메소드도 상속이 된다.
	public void display() {
		System.out.println("부모 클래스 메소드");
	}
}

class Child extends Parent { 
	int score; // parent에는 없고 child에만 존재하는 코드

	public void print() { 
		
		System.out.println("자식 클래스 메소드");

		display(); // 클래스 중괄호 기준으로 가까운 것으로 인식된다
		
		this.display(); // this : 자신의 클래스를 지칭

		super.display(); // super : 부모클래스 참조 객체
		
	}

	@Override // 어노테이션, annotation
	// 주석, 설명 + 검증기능 (일치하지 않으면 error를 표시함)
	public void display() {
		// 재정의 메소드
		// 부모 클래스에서 받은 메소드를 재정의하여 사용한다.
		System.out.println("재정의 메소드");
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
