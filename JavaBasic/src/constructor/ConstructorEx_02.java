package constructor;

class Constructor_02{
	private int num1;
	private int num2 = 200;

	public Constructor_02() {
		this(100, 200);  
		// �ٸ� ������ �߿��� int�� �ΰ��� �޴� �����ڸ� ã�Ƽ� �־��ش�.
		// this �����ڴ� �׻� ���� ���� ȣ���ؾ� �Ѵ�.

		System.out.println("����Ʈ ������");
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
