package interfaceEx;

interface Inter_02 {
	public void out();
}

interface Inter_03 {
	public void out();
}

class Parent {
	public void out() {
		System.out.println("부모");
	}
}

class ClassTest_01 extends Parent
			implements Inter_02, Inter_03 {
	@Override
	public void out() {
		System.out.println("자식");
	}
}

// 2개의 인터페이스를 구현(다중상속) 받을 수 있음 
// interface는 완성품이 아니기 때문
abstract class ClassTest implements Inter_02, Inter_03 {
	@Override
	public void out() {
	}
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		// abstract와 부모의 것이 아닌 override한 자식의 것이 나온다
		ClassTest_01 ct = new ClassTest_01();
		ct.out();
	}
}

// 다중상속 
class Parent1 {
	public void out() {
		
	}
}

class Parent2 {
	public void out() {
		
	}
}

// 자바는 다중상속을 금지하고 있다.
// class Child extends Parent1, Parent2{
//	
// }

