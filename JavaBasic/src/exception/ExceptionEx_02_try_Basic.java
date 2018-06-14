package exception;

public class ExceptionEx_02_try_Basic {
	public static void main(String[] args) {

		int [] arr = new int [3];

		try {
				for(int i=0; true; i++) {
					arr[i]=i+1; 
					System.out.println(arr[i]);
				}
				// 예외가 발생한 try를 중단하고 catch는 계속한다
				// Exception클래스에서 ArrayIndexOutofBounds에 대한 정보를 e에 대입한다
				// Exception대신 ArrayIndexOutofBoundsException이라고 적어도 됨
			} catch (Exception e) {
				System.out.println("+ + + 인덱스 벗어남 + + + ");
				
				// 에러정보 출력 메소드
//				e.printStackTrace();
			}
			// 예외발생해도 프로그램이 중단되지 않으므로 출력된다
			System.out.println("프로그램 종료");
	}

}
