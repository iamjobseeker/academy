package array;

public class ArrayQuiz_01 {
	
	public static void main(String[] args) {
					//0,1,2,3,4,5   arr.lengh = 6
		int [] arr = {4,5,11,2,8,0};
		int [] arr2 = new int [6];
		
		System.out.println("---------------");
		for(int i=0; i<arr.length-1; i++) {
			arr[arr.length-1]+=arr[i];
			System.out.println((i+1)+"���� ��� �ο��� ? "+arr[i]);
		}
		
		System.out.println("---------------");
		for(int j=0; j<arr.length; j++) {
			arr2[j]=arr[j]*12000;
			System.out.printf((j+1)+"���� ������: %,d��\n", arr2[j]);
//			System.out.println((j+1)+"���� ������: "+arr2[j]);
		}
		
		System.out.println();
		System.out.println("�ǹ��� ��� �� �ο��� "+arr[arr.length-1]+"�� �Դϴ�.");
		System.out.printf("�������� �� �ݾ��� %,d�� �Դϴ�.", arr2[arr2.length-1]);
//		System.out.println("�������� �� �ݾ��� "+arr2[arr2.length-1]+"�� �Դϴ�");

	}

}
