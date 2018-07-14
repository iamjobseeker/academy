package classmethod;

public class MethodEx_01 {

	public static void main(String[] args) {

		Method_01 m = new Method_01();

		m.method01();

		m.method02(2);  // parameter'2'를 꼭 입력해야 한다

		m.method03(111, "Apple");

		int res = m.rNum();
		System.out.println("반환 값: " + res);

		System.out.println(m.add(10, 20));

	}

}
