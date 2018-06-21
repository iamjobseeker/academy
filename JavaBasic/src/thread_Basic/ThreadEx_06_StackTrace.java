package thread_Basic;

class ThreadDemo extends Thread {

	@Override
	public void run() {
		runMethod1();
	}

	public void runMethod1() {
		runMethod2();
	}

	public void runMethod2() {
		runMethod3();
	}

	public void runMethod3() {

		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class ThreadEx_06_StackTrace {
	public static void main(String[] args) {
		// 스레드 오류발생 위치 알아보기 
		// 스택 트레이스 확인하기 

		ThreadDemo td = new ThreadDemo();	
		td.start(); // 추가 스레드의 스택트레이스	
		td.runMethod1(); // 메인 스레드의 스택 트레이스 

	}

}
