package thread_Basic;

	class ThreadTest02 implements Runnable {
		@Override
		public void run() { 
			
			for(int i=0; i<100; i++) { 
				System.out.println("ThreadTest: " + i);
				
				try {
					Thread.sleep(100); 
				} catch (InterruptedException e) { }
			} 
		}
	}

	public class ThreadEx_02_InterfaceRunnable {
		public static void main(String[] args) {

			ThreadTest02 tt = new ThreadTest02();
			
			Thread thread = new Thread(tt); // interface runnable을 
											// thread 클래스로 만들어준다
			thread.start();

			for(int i=0; i<100; i++) { 
				System.out.println("Main: " + i); 

				try {
					Thread.sleep(50); 
				} catch (InterruptedException e) { }
			} 

		}

}
