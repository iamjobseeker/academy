package thread_Basic;

import java.util.Random;

public class ThreadEx_04_Join extends Thread {
	
	private int idx; // ������ �ε���
	
	public ThreadEx_04_Join(int i) {idx = i;} // ������ 
	
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
		System.out.println("Main ������ ����"); // ���� ������(1��)
		
		// ��Ÿ ������(3��) 
		ThreadEx_04_Join t1 = new ThreadEx_04_Join(1);
		ThreadEx_04_Join t2 = new ThreadEx_04_Join(2);
		ThreadEx_04_Join t3 = new ThreadEx_04_Join(3); 
		
		// ������ ����ŵ� ��� ����ȴ� 
		t1.start();
		t2.start();
		t3.start();
		
		try { // ���� ������� ����ȭ
			t1.join(); // ���� ������(ȣ���� ���)�� t1�� ��ٸ��� 
			t2.join(); // ���� �����尡 t2�� ��ٸ��� 
			t3.join(); // ���� �����尡 t3�� ��ٸ��� 
		} catch (InterruptedException e) {}
		
		System.out.println("Main ������ ����"); 
	}
}
