package condition.loop;

public class WhileEx_02 {

	public static void main(String[] args) {
		
		// while문 이용
		
		// 1번, 0~9까지 출력
		
		// 2번, Hello 6번 출력하기
		
		// 3번, 5 4 3 2 1 0 으로 출력하기
		
		int i=0;
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		int j=0;
		while(j<6) {
			System.out.println("Hello");
			j++;
		}
		
		int k=5;
		while(k>=0) {
			System.out.print(k+" ");
			k--;
		}
		
		
	}
	
}
