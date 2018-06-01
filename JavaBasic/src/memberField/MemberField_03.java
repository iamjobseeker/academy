package memberField;

public class MemberField_03 {

	private int num = 777;  // 인스턴스 변수
	private static int num2 = 55;

	// var - 매개변수
	public void method(int var) {

		// 지역변수, Local Variables
		// method 내부에서만 사용할 수 있음
		int num = 101;


		System.out.println(this.num);  // 인스턴스 변수

		// 중괄호 기준으로 가까이 있는 변수를 사용한다
		System.out.println(num);  // 지역 변수
	}

	static void method2(int var) {
//		System.out.println(num);	// 인스턴스 변수
		System.out.println(num2);	// 클래스 변수
	}

}
