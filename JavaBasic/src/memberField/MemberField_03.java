package memberField;

public class MemberField_03 {

	private int num = 777;  // �ν��Ͻ� ����
	private static int num2 = 55;

	// var - �Ű�����
	public void method(int var) {

		// ��������, Local Variables
		// method ���ο����� ����� �� ����
		int num = 101;


		System.out.println(this.num);  // �ν��Ͻ� ����

		// �߰�ȣ �������� ������ �ִ� ������ ����Ѵ�
		System.out.println(num);  // ���� ����
	}

	static void method2(int var) {
//		System.out.println(num);	// �ν��Ͻ� ����
		System.out.println(num2);	// Ŭ���� ����
	}

}
