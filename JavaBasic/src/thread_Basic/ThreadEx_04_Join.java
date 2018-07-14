package thread_Basic;

import java.util.Random;

public class ThreadEx_04_Join extends Thread {
	
	private int idx; // 스레드 인덱스
	
	public ThreadEx_04_Join(int i) {idx = i;} // 생성자 
	
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
		
		// 기타 스레드(3개) 
		ThreadEx_04_Join t1 = new ThreadEx_04_Join(1);
		ThreadEx_04_Join t2 = new ThreadEx_04_Join(2);
		ThreadEx_04_Join t3 = new ThreadEx_04_Join(3); 
		
		// 메인이 종료돼도 계속 실행된다 
		t1.start();
		t2.start();
		t3.start();
		
		try { // 메인 스레드와 동기화
			t1.join(); // 메인 스레드(호출한 대상)가 t1을 기다린다 
			t2.join(); // 메인 스레드가 t2를 기다린다 
			t3.join(); // 메인 스레드가 t3를 기다린다 
		} catch (InterruptedException e) {}
		
		System.out.println("Main 스레드 종료"); 
	}
}
