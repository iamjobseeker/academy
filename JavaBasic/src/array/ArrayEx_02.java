package array;

public class ArrayEx_02 {

	public static void main(String[] args) {

		// ������ ����� ���ÿ� �ʱ�ȭ
//		int num = 123;

		// �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] arr= {1,2,3,4,5};

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// ��� ��� ����
		
		System.out.println("\n---------------");
		
		for (int j=0;j<arr.length;j++) {
			arr[j]=(j+1)*10;
			System.out.print(arr[j]+" ");
		}
		
		
		
		
		
	

	}

}


