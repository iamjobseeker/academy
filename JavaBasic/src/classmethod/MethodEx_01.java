package classmethod;

public class MethodEx_01 {

	public static void main(String[] args) {

		Method_01 m = new Method_01();

		m.method01();

		m.method02(2);  // parameter'2'�� �� �Է��ؾ� �Ѵ�

		m.method03(111, "Apple");

		int res = m.rNum();
		System.out.println("��ȯ ��: " + res);

		System.out.println(m.add(10, 20));

	}

}
