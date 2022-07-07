
public class App {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					MyCounter.threadNo++;
				}
				System.out.println("loop of thread1 one is over,,,,,,,,,,,");
				
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					MyCounter.threadNo++;
				}
				System.out.println("Loop of thread2 one is over,,,,,,,,,,,,,");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("the valus of Thread: "+MyCounter.threadNo++);
	}

}
