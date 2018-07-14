package thread_Basic;

class DaemonThreadTest2 implements Runnable { // 데몬 스레드
	int i=1;
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
			}
			
			// 주기적으로 반복할 코드 
			System.out.println(i+"sec Auto Save"); // 자동 저장 
			i++;
		}
	}
}

public class ThreadEx_08_Daemon {
	public static void main(String[] args) {
		System.out.println(" --- Main Start ---");
		
		Thread th = new Thread(new DaemonThreadTest2()); // 한번에 호출
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(10000);  // 메인메소드의 작업 시간 10초 설정 
					// 메인메소드가 끝나기 전까지 데몬은 계속 활성화된다 
		} catch (InterruptedException e) {
		}
		
		System.out.println(" --- Main End --- ");
	}

}
