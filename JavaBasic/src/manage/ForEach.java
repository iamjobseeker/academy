package manage;

public class ForEach {
	public static void main(String[] args) {

		// for each
		//   �迭�� ��� ��Ҹ� �ѹ��� �����ϰ� ���ϰ� ���ִ� �ݺ���
		
		// for( �迭���Ÿ�� ������ : �迭�� ) {
		//
		//		�迭�� ��� ��Ҹ� ������ �ѹ��� ��� �ڵ� �ݺ�
		//
		// }

		int[] arr = {1, 2, 3, 4, 5};

		for(int num : arr) {	// �迭�� ũ�⸸ŭ �ݺ�
			System.out.println(num);
		}
		
		// ��������: �޼ҵ� �ȿ����� ���̰� �޼ҵ尡 ����Ǹ� ������� ����
		// int num�� for�� �ȿ����� ������ ���� ����
		// ������ �ٸ� ������ ����ȴ�
		for(int num:arr) {
			num*=100;
		}

		// for each���� �ַ� ��¿� ���ȴ�
		for(int num : arr) {	
			System.out.println(num);
		}

	}

}
