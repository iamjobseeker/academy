package array;

public class ArrayEx_01 {
	
	public static void main(String[] args) {
		
		// �迭= -> ������ ����
		
		// int�� ���� ����
		int num;
		
		// int�� ������ �� ����
		num = 123;
		
		System.out.println(num);
		
		// int�� �迭���� ����
		int[] arr;
		
		// int�� �迭 ����
		arr=new int[5];
		
		// int�� �迭 �����ϸ� �����ϱ�
		int[] arr2=new int[100];
		
		// �迭 ������ �� ����
		arr[0]=1;
		arr[1]=2;
		arr[4]=3;
		
		// �迭�� ���
		System.out.println(arr[1]);
		System.out.println(arr2[0]);
		
		// �迭���� ���
		System.out.println(arr);
		
		
	}

}
