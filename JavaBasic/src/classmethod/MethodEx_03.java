package classmethod;

				 //Executor
public class MethodEx_03 {
	
	public static void main(String[] args) {
		
		Method_03 m = new Method_03();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		m.mul10(arr);	// �迭�� ��� ��� 10��
		m.print(arr);	// �迭�� ��� ��� ���
		
		int[] arr2 = {6, 7, 8, 9, 10};
		
		// �����迭�� �״�� �ΰ�
		// �����迭�� ��� ����� 10�踦 ������
		// ���ο� �迭 ��ȯ
					
		int[] result = m.mul10_v2(arr2);
		
	}

}
