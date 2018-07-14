package thread_Synchronized;

class SyncTest02 extends Thread {

	// �Ӱ迵���� �� ������
	int total = 0;

	@Override
	public void run() { // ������ ���� 
		synchronized (this) { 
			for(int i=1; i<=100; i++) {
				System.out.println(i + "�� ���� ���ϱ�");
				total += i; 
			}
			
			notify(); // main lock ���� 
		}

	} 
}

public class WaitNotifyEx_02 {

	public static void main(String[] args) {
		// ����ȭ�� �ʿ��� ��Ȳ

		SyncTest01 st = new SyncTest01();

		st.start(); 

		// �Ӱ迵�� ���� 
		synchronized ( st ) {

			try {
				st.wait(); // main�� �Ӱ迵���� ���� lock���� �ݳ� 
					// join�� ���� main�� start���������� ��� ��ٷ����� 
			} catch (InterruptedException e) {}

			// main �κ� 
			System.out.println("1~100�� ��: " + st.total); 
		}

	}
}
