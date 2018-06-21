package thread_Basic;

public class ThreadEx_05_Priority extends Thread {

	private int idx; // ������ �ε���

	public ThreadEx_05_Priority(int i) {idx = i;} // ������ 

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print(idx); 
		}
	}

	public static void main(String[] args) { 
		// ������ �۾��Ҵ� �켱����(Priority)�� �˾ƺ��� 

		System.out.println("Main ������ ����"); 

		ThreadEx_05_Priority t1 = new ThreadEx_05_Priority(1);
		ThreadEx_05_Priority t2 = new ThreadEx_05_Priority(2);
		ThreadEx_05_Priority t3 = new ThreadEx_05_Priority(3); 

		// �켱���� ����, thread�� ��� ���,  ���� ����=���� �켱����
		t1.setPriority(1); // thread.MIN_PRIORITY
		t2.setPriority(5); // thread.NORM_PRIORITY
		t3.setPriority(10); // thread. MAX_PRIORITY

		/**
		 * The minimum priority that a thread can have.
		 *  public final static int MIN_PRIORITY = 1;
		 *  
		 *  The default priority that is assigned to a thread.
		 *  public final static int NORM_PRIORITY = 5;
		 *  
		 *  The maximum priority that a thread can have.
		 *  public final static int MAX_PRIORITY = 10;
		 *     
		 **/

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join(); 
			t2.join(); 
			t3.join(); 
		} catch (InterruptedException e) {}

		System.out.println("\nMain ������ ����"); 
	}
}
