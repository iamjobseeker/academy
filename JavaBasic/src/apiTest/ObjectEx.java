package apiTest;

class Point implements Cloneable {
	int x;
	int y;

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		// super는 object 클래스를 의미
		//		return super.toString();

		return "Point ("+x+","+y+")";
	}

	@Override
	public boolean equals(Object obj) {

		// p2.equals(p3);
		// p3는 obj 자리에 오는 객체를 말함

		// object는 모든 클래스의 부모 클래스

		if(this.x == ( (Point)obj).getX()
				&& this.y == ((Point)obj).getY()) {
			return true;
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class ObjectEx {

	public static void main(String[] args) {

		Object o = new Object();

		System.out.println("---toString()---");
		// toString()
		// 기능: 객체에 대한 설명을 String으로 반환
		// 목적: 객체를 설명
		// 기본동작: 레퍼런스 반환 (데이터타입 @ 참조)
		//	오버라이딩 가능 

		// println() 메소드가 객체를 전달인자로 받으면
		// 자동으로 객체의 toString()을 호출한 값을 출력하도록 되어있음
		System.out.println(o.toString());
		System.out.println(o);

		Point p = new Point(10, 20);
		System.out.println(p);

		System.out.println("---equals()---");
		// 새로 new 설정을 해서 서로다른 공간으로 설정되어 있음
		Point p2 = new Point(11,22);
		Point p3 = new Point(11,22);

		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		// p2, p3에는 각각 객체자신의 주소가 담겨있음
		// ex) 0xA0(p2) != 0xB0(p3)
		System.out.println("p2==p3: "+(p2==p3));
		System.out.println("p2.equals(p3): "+(p2.equals(p3)));

		String str = "Apple";
		// "Apple"과 str은 동등하면서 동일하다
		System.out.println("문자열비교: "
				+ "Apple".equals(str));
		// 문자열을 직접 비교하면 참조값을 비교한다.

		System.out.println("---hashCode()---");
		// 참조값을 반환해주는 함수
		// toString에서의 참조 부분만 16진수 → 10진수로 반환해준다

		String str1 = new String("Apple");
		String str2 = new String("Apple");
		String str3 = new String("Banana");
		String str4 = str1 ;

		// String을 만들어놓고 다시 사용한다
		// 따라서 같은 주소를 가지게된다
		System.out.println("str1: "+str1.hashCode());
		System.out.println("str2: "+str2.hashCode());
		System.out.println("str2: "+str3.hashCode());
		System.out.println("str4: "+str4.hashCode());

		System.out.println("p: " + p.hashCode());
		System.out.println("p2: " + Integer.toHexString(p2.hashCode()));
		
		System.out.println("---getClass()");
		// 클래스타입 정보반환
		System.out.println("p.getClass(): " + p.getClass());
		System.out.println("o.getClass(): " + o.getClass());
		System.out.println("str.getClass(): " + str.getClass());
		
		System.out.println("---clone()---");
		Point p_ori = new Point(33,44);
		
		Point p_clone1 = p_ori;  // 얕은복사
		
		Point p_clone2 = new Point(p_ori.x, p_ori.y);  // 깊은복사

		Point p_clone3 = null;
		
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();  // 클론 이용한 사본생성
		}
		
		// 저장위치를 알아볼수있다
		System.out.println(p_ori.hashCode());
		System.out.println( p_clone1.hashCode());
		System.out.println( p_clone2.hashCode());
		System.out.println( p_clone3.hashCode());
		
	}

}
