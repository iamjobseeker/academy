package condition.loop;

public class ForEx_04 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 총합을 구하자
		
		// 반복횟수 : 10번
		// 반복구간 : 1~10
		
		// 초기식 : int i = 1;
		// 조건식 : i<=10;
		// 증감식 : i++
		
		int total = 0 ; // 총합
		//수행코드: total += i;
		
		for (int i=1; i<=10; i++) {
			total+=i;
		}
		System.out.println("1~10의 총합: " + total);
		
		
		
		
		
		
		
		
		
	}
	
}
