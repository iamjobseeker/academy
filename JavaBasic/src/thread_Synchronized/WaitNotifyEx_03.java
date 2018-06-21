package thread_Synchronized;

class SyncData  {
	int total;

	boolean available = false; // total에 값이 저장되었는지 확인 
	// false - 연산이 완료되지 않은 상태
	// true - 연산이 완료된 상태 
}

class Input extends Thread { 

	SyncData data;
	public Input(SyncData data) {this.data = data;} 

	@Override
	public void run() {
		System.out.println("--- Input Start ---");

		synchronized ( data ) {
			for(int i=1; i<=100; i++)
				data.total += i;

			data.available = true; // 연산 완료 상태
			data.notifyAll(); // 임계영역 작업완료 통지 
		}

		System.out.println("--- Input End ---");
	}
}

class Output extends Thread {
	SyncData data;
	public Output(SyncData data) {this.data = data; }
	
	@Override
	public void run() {
		
		System.out.println("--- Output Start ---");
		
		synchronized (data) { // 임계영역 진입
			
			try {
				while(data.available==false) {
				data.wait();
				}
			} catch (InterruptedException e) {  } 
			
			System.out.println("total: " + data.total);
		}
		
		System.out.println("--- Output End ---"); 
	}

}

public class WaitNotifyEx_03 {
	public static void main(String[] args) {
		
		SyncData data = new SyncData();
		
//		Output o = new Output(data);
//		Input i = new Input(data);
//		o.start();
//		i.start(); 
		
		// 간략화
		new Output(data).start();
		new Input(data).start(); 

	}
}
