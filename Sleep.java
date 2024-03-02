package multiThreading;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("Exception handled....");
			}
			System.out.println(Thread.currentThread().getName()+ "my thread1...");
		}
	}
}
public class Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread th1 = new MyThread();
		th1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+ "main method");

		}
		
	}

}
