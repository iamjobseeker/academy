package condition.loop;

public class ExtEx_01 {
	
	public static void main(String[] args) {
		
		// break
		// 		if를 제외한 제어문을 중단시킨다
		//		break코드가 포함된 중괄호의 제어문
		
		// continue
		//		반복문에서 적용됨
		//		다음 반복을 진행한다
		//		for - 증감문으로 이동
		//		while - 조건문으로 이동
		//		do-while - 조건문로 이동
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		System.out.println("------");
		
		for(int i=0; i<10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
	}

}
