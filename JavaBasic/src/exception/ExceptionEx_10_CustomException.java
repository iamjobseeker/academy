package exception;

// 짝수 아닐 경우 예외 처리하는
// 새로운 exception을 정의하였다 
class EvenException extends Exception {
	
	@Override
	public String getMessage() {
		return "짝수가 아닌 숫자를 입력했음"; 
	}
}

class CheckEven {

	// 홀수를 입력하면 예외 발생 
	public void check (int num) throws EvenException {
		
		if( num%2!=0) {  // 홀수
			throw new EvenException();
		}
		
		// 짝수
		System.out.println("짝수입니다");
	} 
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {

		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13);
		} catch (EvenException e) {
			// 재사용성을 가지게 된다  good point 
			System.out.println(e.getMessage()); 
			
//			System.out.println("홀수를 입력함"); 
		}
	}
}

