package operator;

public class BinaryEx_06 {

	public static void main(String[] args) {
		// 비트단위 논리연산자
		// bitwise logical operator
		
		int num1 = 21;
		int num2 = 24;
		
		// 21 -> 0001 0101
		// 24 -> 0001 1000
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2); 
		// 암호화를 위해 xor가 사용된다
		
	}

}
