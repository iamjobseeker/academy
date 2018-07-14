package thread_Basic;

import java.util.Random;

public class ThreadEx_03 extends Thread {
	
	private int idx; // 스레드 인덱스
	
	public ThreadEx_03(int i) {idx = i;} // 생성자 
	
	@Override
	public void run() {
		System.out.println(idx + "스레드 시작");
		
		Random ran = new Random();
		
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {
		}
		
		System.out.println(idx + "스레드 종료");
	}
	
	public static void main(String[] args) { 
		System.out.println("Main 스레드 시작"); // 메인 스레드(1개)
		
		// 기타 스레드(10개)
		// 메인 스레드가 종료돼도 계속 실행된다 
		for(int i=0; i<10; i++) { 
			new ThreadEx_03(i).start();
		}
		
		System.out.println("스레드 종료");
	}
}
