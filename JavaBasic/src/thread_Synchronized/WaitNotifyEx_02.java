package thread_Synchronized;

class SyncTest02 extends Thread {

	// 임계영역에 들어갈 데이터
	int total = 0;

	@Override
	public void run() { // 스레드 생성 
		synchronized (this) { 
			for(int i=1; i<=100; i++) {
				System.out.println(i + "의 값을 더하기");
				total += i; 
			}
			
			notify(); // main lock 해제 
		}

	} 
}

public class WaitNotifyEx_02 {

	public static void main(String[] args) {
		// 동기화가 필요한 상황

		SyncTest01 st = new SyncTest01();

		st.start(); 

		// 임계영역 지정 
		synchronized ( st ) {

			try {
				st.wait(); // main이 임계영역에 대한 lock권한 반납 
					// join을 쓰면 main은 start끝날때까지 계속 기다려야함 
			} catch (InterruptedException e) {}

			// main 부분 
			System.out.println("1~100의 합: " + st.total); 
		}

	}
}
