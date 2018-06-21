package thread_Basic;

class ThreadTest01 extends Thread {
	@Override
	public void run() { // run�� �����ε� �����ν� thd�� �νĵȴ� 
		
		for(int i=0; i<10; i++) { 
			System.out.println("ThreadTest: " + i);
			
			try {
				Thread.sleep(100); // ��Ƽ Ŭ������ ���� Ŭ���� 
				// sleep: ���� �������� ������ 100ms���� ���߰��Ѵ� 
			} catch (InterruptedException e) { }
		} 
	}
}

public class ThreadEx_01_ClassThread {
	public static void main(String[] args) {

		// ���α׷�, ���μ���, ������
		
		ThreadTest01 tt = new ThreadTest01();
		
		tt.start(); // ������ Ȱ��ȭ 
					// cpu�� new thd(tt)-new thd(main)������ ����
		
		// tt.run(); //start�� ȣ������ ������ �Ϲ� �޼ҵ� ȣ���� �Ǿ� 
					// run�� ���� �����ϰ� main�� �����Ѵ� 
		
		
		ThreadTest01 tt2 = new ThreadTest01();
		tt2.start(); // 3��° ������ 

		for(int i=0; i<10; i++) { 
			System.out.println("Main: " + i); 

			try {
				Thread.sleep(50); // ��Ƽ Ŭ������ ���� Ŭ���� 
				// sleep: ���� �������� ������ 100ms���� ���߰��Ѵ� 
			} catch (InterruptedException e) { }
		} 

	}

}
