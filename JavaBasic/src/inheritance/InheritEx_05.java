package inheritance;

class Parent05{
	public void display() {
		System.out.println("부모 클래스");
	}
}

// class에 final을 적으면 상속을 줄 수 없음
final class Child05 extends Parent05{
	
	// method에 final을 적으면 더 이상 override 할 수 없음
	@Override
	public final void display() {
		System.out.println("자식 클래스");
	}
}

// 상속은 1:1 관계
// parent가 Grandchild에 영향을 미치지 않는다
//class GrandChild05 extends Child05{
//	public void display() {
//		
//	}
//}

public class InheritEx_05 {
	public static void main(String[] args) {
		
	}
}
