package operator;
// 관계연산자
public class BinaryEx_02 {
	
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
	
		System.out.println("---예외---");
		//boolean
		System.out.println(true == true);
//		System.out.println(true < true);
		// 0: false: off
		// 1: true: on
		// boolean은 숫자로 취급되지 않는다
		
		//참조형에 관계연산을 함부로 하면 안 됨
		
	}

}
