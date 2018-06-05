package inheritance;

class Parent04{
	public void display() {
		System.out.println("부모클래스");
	}
}

class Child04 extends Parent04{
	@Override
	public void display() {
		System.out.println("자식클래스");
	}
	
	public void out() {
		System.out.println("자식 메소드 out");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		// 부모
		Parent04 p = new Parent04();
		p.display();  
		
		System.out.println("-------");
		
		// 자식
		Child04 c = new Child04();
		c.display();

		System.out.println("-------");
		
		// parent04에 child04를 대입
		// 자식클래스의 필드, 메소드가 사용된다
		// 자식클래스 타입을 부모클래스 타입으로 자동형변환, 반대로는 안됨
		// Parent04 pc =(Parent04) new Child04();
		// 자바는 동적 바인딩을 사용한다
		//  정적				동적
		Parent04 pc = new Child04();
		pc.display();
		
		// pc.out();
		// 호출 안됨. 데이터타입을 보고 결정함
		// Parent04.out() 이 존재하지 않으므로 
		( (Child04)pc ).out();

	}

}
