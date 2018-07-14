package thread_Basic;

class DaemonThreadTest2 implements Runnable { // ���� ������
	int i=1;
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
			}
			
			// �ֱ������� �ݺ��� �ڵ� 
			System.out.println(i+"sec Auto Save"); // �ڵ� ���� 
			i++;
		}
	}
}

public class ThreadEx_08_Daemon {
	public static void main(String[] args) {
		System.out.println(" --- Main Start ---");
		
		Thread th = new Thread(new DaemonThreadTest2()); // �ѹ��� ȣ��
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(10000);  // ���θ޼ҵ��� �۾� �ð� 10�� ���� 
					// ���θ޼ҵ尡 ������ ������ ������ ��� Ȱ��ȭ�ȴ� 
		} catch (InterruptedException e) {
		}
		
		System.out.println(" --- Main End --- ");
	}

}
