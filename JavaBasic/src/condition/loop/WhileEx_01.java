package condition.loop;

public class WhileEx_01 {
	
	public static void main(String[] args) {
		
		// 반복문 while
		
		// while(조건식) {
		// 		조건식이 true이면 반복되는 문장
		// }
		
//		while(true) { // 무한 Loop
//			System.out.println("Hello");
//		}
		
//		초기식;
//		while(조건식) {
//			// 수행코드
//		
//			증감식;
//		}
		
		int i=0;
		for(; i<10;) {
			System.out.print(i+" ");
		
			i++;
		}
		
		System.out.println("\n");
		int i1=0;
		while(i1<10) {
			System.out.println("i: "+i1);
			i1++;
		}
		
	}

}
