package apiTest;

// Math�� java.lang�� ���ϴ� Ŭ������ ���� import���� �ʾƵ� ����� �� �ִ�

public class MathEx {

	public static void main(String[] args) {
		
		System.out.println("PI: " + Math.PI);

		// -10�� ���밪
		System.out.println(Math.abs(-10));
		
		// 3.7�� �ø���
		System.out.println(Math.ceil(3.7));
		// * Math.round :�ݿø�
		
		// 3.7�� ������
		System.out.println(Math.floor(3.7));
		
		// 2.1�� 3������
		System.out.println(Math.pow(2.1, 3));
		
		// 0.0(����) ~ 1.0(����) ������ ����(����)
		System.out.println("0~1���� ����: " + Math.random());
		System.out.println("1~100���� ����: "+(int)(Math.floor(Math.random()*100)+1));
		
		// �ڿ���� e�� 3.3����
		System.out.println(Math.exp(3.3));
		
		// -3.7�� �ø���
		System.out.println(Math.ceil(-3.7));
		
		// -3.7�� ������
		System.out.println(Math.floor(-3.7));

	}

}
