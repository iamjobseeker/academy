package array;

public class ArrayCopyEx_02 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};  // Source
		int[] arr2;  // Destination
		
		// ���� ���� (deep copy)
		// ���� ����� ���빰�� ���ο� ������ �����ϴ� ��
		
		// 1. Destination�� ���� Ȯ��
		//		new����ؼ� ���ο� �����Ҵ�
		
//		arr2=new int[3];
		arr2=new int[arr1.length];
		
		// 2. for�� �̿��ؼ� ���빰 (��� ���) ����

		for(int i=0; i<arr2.length; i++) {
			arr2[i]=arr1[i];
		}
			
		System.out.println("-----���� ��-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		arr1[1] = 7777;
		
		System.out.println("-----���� ��-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
	}

}
