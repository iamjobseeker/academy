package classmethod;

public class MethodEx_02 {
	
	public static void main(String[] args) {
		
		Method_02 m = new Method_02();
		
		m.r_itg(); 
		
		Method_02.r_two(2,"happy"); // static�� ������ �̷��� ȣ���Ҽ��� �ִ�
		
		Method_02.r_itg();
		
		System.out.println();
		
		m.r_apple(3);
		
		System.out.println();
		
		m.r_two(6, "Think positive");
		
		
		
		
		
		
		
		
	}

}
