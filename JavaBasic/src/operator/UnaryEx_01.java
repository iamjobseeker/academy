package operator;
//단항 연산자
public class UnaryEx_01 {

	public static void main(String[] args) {
		
		int num=15;
		System.out.println("before: " + num);
		System.out.println("run: " + num++);
		System.out.println("after: " + num);
				
		System.out.println("------------");
		
		num = 15;
		System.out.println("before: " + num);
		System.out.println("run: " + ++num);
		System.out.println("after: " + num);

	}

}
