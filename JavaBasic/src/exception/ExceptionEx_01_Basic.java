package exception;

public class ExceptionEx_01_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i=0;
		while(true) { 
			
			// ����ó���ڵ� 
			if(i>=arr.length) {
				System.out.println("�ε����� " + arr.length + "���� ũ�� �� �˴ϴ�.");
				break;
			}
							
			arr[i] = i+1;
			System.out.println(arr[i]);
			
			i++;
		}
		
	}

}
