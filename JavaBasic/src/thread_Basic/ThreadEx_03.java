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
		
		System.out.println("Main 스레드 시작");
		
		for(int i=0; i<10; i++) { // 새로운 스레드가 생겨난다 
			new ThreadEx_03(i).start();
		}
		
		System.out.println("스레드 종료");
	}
}
