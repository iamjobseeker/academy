package apiTest;

// Math는 java.lang에 속하는 클래스로 따로 import하지 않아도 사용할 수 있다

public class MathEx {

	public static void main(String[] args) {
		
		System.out.println("PI: " + Math.PI);

		// -10의 절대값
		System.out.println(Math.abs(-10));
		
		// 3.7의 올림값
		System.out.println(Math.ceil(3.7));
		// * Math.round :반올림
		
		// 3.7의 내림값
		System.out.println(Math.floor(3.7));
		
		// 2.1의 3제곱값
		System.out.println(Math.pow(2.1, 3));
		
		// 0.0(포함) ~ 1.0(제외) 사이의 난수(랜덤)
		System.out.println("0~1사이 랜덤: " + Math.random());
		System.out.println("1~100사이 랜덤: "+(int)(Math.floor(Math.random()*100)+1));
		
		// 자연상수 e의 3.3제곱
		System.out.println(Math.exp(3.3));
		
		// -3.7의 올림값
		System.out.println(Math.ceil(-3.7));
		
		// -3.7의 내림값
		System.out.println(Math.floor(-3.7));

	}

}
