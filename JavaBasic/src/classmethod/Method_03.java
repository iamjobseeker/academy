package classmethod;

public class Method_03 {

	public void mul10(int[] a) {
		for(int i=0; i<5; i++) {
			a[i]*=10;
		}

	}

	public void print(int[] a) {
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}

	// �����迭�� ��� ����� 10�踦 ������ ���ο� �迭 ��ȯ
	
	public int[] mul10_v2(int[] a) {
		int[] result = new int[a.length];
		for(int i=0; i<result.length; i++) {
			result[i]=a[i]*10;
			System.out.println(result[i]);
		}
		
		return result;
	}

}


