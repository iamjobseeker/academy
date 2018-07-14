package thread_Synchronized;

class SyncTest01 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + "의 값을 더하기");
			total += i; 
		}
	}
}

public class WaitNotifyEx_01 {

	public static void main(String[] args) {
		// 동기화가 필요한 상황
		
		SyncTest01 st = new SyncTest01();
		st.start();
		
		try {
			st.join(); // run실행->main실행
		} catch (InterruptedException e) {
		}
		
		// main 부분
		System.out.println("1~100의 합: " + st.total); 
		
	}
}
