package thread_Basic;

class ThreadTest01 extends Thread {
	@Override
	public void run() { // run을 오버로드 함으로써 thd로 인식된다 
		
		for(int i=0; i<10; i++) { 
			System.out.println("ThreadTest: " + i);
			
			try {
				Thread.sleep(100); // 멀티 클래스를 위한 클래스 
				// sleep: 메인 스레드의 동작을 100ms동안 멈추게한다 
			} catch (InterruptedException e) { }
		} 
	}
}

public class ThreadEx_01_ClassThread {
	public static void main(String[] args) {

		// 프로그램, 프로세스, 스레드
		
		ThreadTest01 tt = new ThreadTest01();
		
		tt.start(); // 스레드 활성화 
					// cpu는 new thd(tt)-new thd(main)번갈아 수행
		
		// tt.run(); //start로 호출하지 않으면 일반 메소드 호출이 되어 
					// run을 먼저 수행하고 main을 수행한다 
		
		
		ThreadTest01 tt2 = new ThreadTest01();
		tt2.start(); // 3번째 스레드 

		for(int i=0; i<10; i++) { 
			System.out.println("Main: " + i); 

			try {
				Thread.sleep(50); // 멀티 클래스를 위한 클래스 
				// sleep: 메인 스레드의 동작을 100ms동안 멈추게한다 
			} catch (InterruptedException e) { }
		} 

	}

}
