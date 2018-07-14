package overloading;

class Overloading_01 {
	private int x;
	private int y;

	public void display() {
		System.out.println("["+x+","+y+"]");
	}

	// int�� �������� 2���� �Է¹ް�
	// ������� x, y�� �ʱ�ȭ�Ͽ� ���

	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("["+x+","+y+"]");
	}

	//	System.our.println(x+y);

	public void display(double d) {}
	public void display(String s) {}

	// �����ε� �ȵ�
	// ����Ÿ���� �����ε� ���ǰ� ������
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

		System.out.println("���̴�: "+ol02.getLength(112233)+"����");

		System.out.println("���̴�: "+ol02.getLength(123.574335)+"����");
		
		System.out.println("false���̴�: "+ol02.getLength(false)+"����");
	}

}

class Overloading_02{

	// �������� ����(���ڼ�)���ϱ�
	// 11233 -> 6
	public int getLength(int num) {

		// String.valueOf(5000); -> "5000"

		String str = String.valueOf(num);

		return str.length();
	}


	// String�� ���� �޼ҵ� (?)
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

