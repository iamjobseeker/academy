package condition.loop;

public class DoWhileEx_01 {

	public static void main(String[] args) {
		
		// do-while 반복문
		// while문의 변형
		
//		 do {
//				반복할 코드
//		 } while(조건식);
		
		do {
			System.out.println("출력이 안되나?");
		} while(false); 
		
//		실행해보고 조건 검사를 한다

		int i=0;
		do {
			System.out.println(i);
			i++;
		} while(i<5);
		
		
	}
	
}
