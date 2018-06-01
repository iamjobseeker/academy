package constructor;

class Constructor_02{
	private int num1;
	private int num2 = 200;

	public Constructor_02() {
		this(100, 200);  
		// 다른 생성자 중에서 int형 두개를 받는 생성자를 찾아서 넣어준다.
		// this 생성자는 항상 가장 먼저 호출해야 한다.

		System.out.println("디폴트 생성자");
	}

	public Constructor_02(int n1, int n2) {
		num1 = n1;
		this.num2 = n2;
	}

	public void out() {
		System.out.println(num1+","+num2);
	}

}

public class ConstructorEx_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons = new Constructor_02();
		cons.out();	
		
	}

}
