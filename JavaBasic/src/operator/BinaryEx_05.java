package operator;

public class BinaryEx_05 {

	public static void main(String[] args) {

		// 시프트 연산자, shift operator
		// <<, >>, >>>
		
		int num = 7;
		System.out.println( num << 1);
		System.out.println( num << 2);
		System.out.println( num << 3);
		System.out.println( num << 4);
		
		System.out.println("-----");
		
		System.out.println( num >> 1);
		System.out.println( num >> 2);
		System.out.println( num >> 3);
		System.out.println( num >> 4);
		
		System.out.println("-----");
		
		num = -23;
		System.out.println(num >>2);
		
		System.out.println(num >>> 2);
		
		
	}
	

}
