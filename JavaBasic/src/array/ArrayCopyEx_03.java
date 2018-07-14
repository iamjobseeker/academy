package array;

public class ArrayCopyEx_03 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};  // Source
		int[] arr2;  // Destination
		
		// ���� ���� (deep copy)
		// ���� ����� ���빰�� ���ο� ������ �����ϴ� ��
		
		// 1. Destination�� ���� Ȯ��
		//		new����ؼ� ���ο� �����Ҵ�
		
//		arr2=new int[3];
		arr2=new int[arr1.length];
		
		// 2. System Ŭ������ API�޼ҵ带 �̿��ؼ� ���빰 ����
		// System.arraycopy(
		//		�����̸�, ���������ε���, �纻�̸�, �纻�����ε���, ����);
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		System.out.println("-----���� ��-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		arr1[1] = 8888;
		
		System.out.println("-----���� ��-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
	}
}
