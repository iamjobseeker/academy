package inheritance;

class Parent03{
	protected int num;

	public Parent03() {
		System.out.println("부모 생성자");
	}

	// 부모 생성자의 overloading
	public Parent03(int num) {
		this.num = num;
		System.out.println("매개변수가 있는 부모 생성자");
	}

}

class Child03 extends Parent03{
	
	private int num;

	public Child03() {
//		super(123);	  // 부모생성자 호출
		System.out.println("자식 생성자");
		System.out.println(num);
		System.out.println(super.num); 
	}

	public Child03(int n) {
		super(n);
		System.out.println(super.num);
		System.out.println(num);
	}
}

public class InheritEx_03 {
	public static void main(String[] args) {

		Child03 c = new Child03();
		
//		Child03 c = new Child03(111);
		// 자식 생성자가 호출되면 자동적으로 부모 생성자도 호출된다
		// 부모 생성자가 먼저 호출됨

	}

}