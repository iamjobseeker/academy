package operator;
//산술연산자
public interface BinaryEx_01 {
	public static void main(String[] args) {
		
		int num1 = 17;
		int num2 = 4;
		//대입연산자 '=' :오른쪽 항의 값을 왼쪽 항의 변수에 저장한다
		int result = num1+num2;
		System.out.println("결과: " + result);
		
		System.out.println("------");
		//연산하는 피연산자의 자료형은 항상 같아야한다
		//연산 결과값과 피연산자의 자료형은 같다
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println((double)num1 / (double)num2);
		System.out.println(num1%num2);	
		//double 데이터의 나머지 연산
		System.out.println(num1%(double)num2);
		
		System.out.println("--예외상황--");
//		System.out.println(11/0);
		
		System.out.println(12.34/0);
		
	}

}
