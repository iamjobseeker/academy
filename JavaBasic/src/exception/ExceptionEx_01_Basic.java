package exception;

public class ExceptionEx_01_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i=0;
		while(true) { 
			
			// 예외처리코드 
			if(i>=arr.length) {
				System.out.println("인덱스는 " + arr.length + "보다 크면 안 됩니다.");
				break;
			}
							
			arr[i] = i+1;
			System.out.println(arr[i]);
			
			i++;
		}
		
	}

}
