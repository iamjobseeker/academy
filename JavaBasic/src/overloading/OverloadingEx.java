package overloading;

class Overloading_01 {
	private int x;
	private int y;

	public void display() {
		System.out.println("["+x+","+y+"]");
	}

	// int형 전달인자 2개를 입력받고
	// 멤버핖드 x, y를 초기화하여 출력

	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("["+x+","+y+"]");
	}

	//	System.our.println(x+y);

	public void display(double d) {}
	public void display(String s) {}

	// 오버로딩 안됨
	// 리턴타입은 오버로딩 조건과 무관함
	//	public int display() {}

}

public class OverloadingEx {

	public static void main(String[] args) {

		Overloading_01 ol01 = new Overloading_01();

		System.out.println("ol01.display();");
		ol01.display();

		System.out.println("ol01.display(10, 10);");
		ol01.display(10, 10);

		System.out.println("------------");

		Overloading_02 ol02 = new Overloading_02();

		System.out.println("길이는: "+ol02.getLength(112233)+"글자");

		System.out.println("길이는: "+ol02.getLength(123.574335)+"글자");
		
		System.out.println("false길이는: "+ol02.getLength(false)+"글자");
	}

}

class Overloading_02{

	// 데이터의 길이(문자수)구하기
	// 11233 -> 6
	public int getLength(int num) {

		// String.valueOf(5000); -> "5000"

		String str = String.valueOf(num);

		return str.length();
	}


	// String의 정적 메소드 (?)
	// String.valueOf(str);

	String str = "Apple";
	//	str.valueOf(obj);

	public int getLength(double num) {

		String str = String.valueOf(num);

		return str.length();
	}
	
	
	public int getLength(boolean b) {
		
		String str = String.valueOf(b);
		
		return str.length();

	}

}

