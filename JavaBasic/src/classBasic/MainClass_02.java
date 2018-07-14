package classBasic;

public class MainClass_02 {
	// 멤버필드
	int num1 = 111;
	int num2 = 222;

	//	num1 = 10;  수행이 안됨

	public static void main(String[] args) {
		MainClass_02 mc = new MainClass_02();
		mc.out();  // 아래쪽 메소드 호출
	}

	public void out() {
		System.out.println(num1+", "+num2);

		
	}

}
