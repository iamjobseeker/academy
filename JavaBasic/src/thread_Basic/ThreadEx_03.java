package thread_Basic;

import java.util.Random;

public class ThreadEx_03 extends Thread {
	
	private int idx; // ������ �ε���
	
	public ThreadEx_03(int i) {idx = i;} // ������ 
	
	@Override
	public void run() {
		System.out.println(idx + "������ ����");
		
		Random ran = new Random();
		
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {
		}
		
		System.out.println(idx + "������ ����");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main ������ ����");
		
		for(int i=0; i<10; i++) { // ���ο� �����尡 ���ܳ��� 
			new ThreadEx_03(i).start();
		}
		
		System.out.println("������ ����");
	}
}
