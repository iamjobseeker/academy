package condition;

public class SwitchEx_02 {
	public static void main(String[] args) {
		
		int num = 2;
		switch(num*10) {
		case 10:
			System.out.println("값은: 10");
			break; // 제어문 중단
			
		case 20:
			System.out.println("값은: 20");
			break; // 제어문 중단
			
		case 30:
			System.out.println("값은: 30");
			break; // 제어문 중단
			
		default:
			System.out.println("디폴트, 적당한 값 없음");
		}
		
		
	}

}
