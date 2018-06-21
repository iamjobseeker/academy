package thread_Basic;

class DaemonThreadTest implements Runnable { // 데몬 스레드
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + "HI");
		}
	}
}

public class ThreadEx_07_Daemon {
	public static void main(String[] args) {
		
		System.out.println("--- Main Start ---");
		 
		// --- 데몬모드 스레드 실행 코드 ---  
		// 특징: 메인스레드에 종속되어 메인이 종료되면 함께 종료된다 
		DaemonThreadTest dt = new DaemonThreadTest(); 
		Thread th = new Thread(dt);
		th.setDaemon(true); 
		th.start(); 
		// -------------------------
		
		System.out.println(" --- Main End --- ");
		
	}

}
