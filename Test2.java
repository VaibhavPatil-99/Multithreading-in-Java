package multiThreading;

class T2 implements Runnable{
 
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
			T2 t2 = new T2();
			Thread thread1 = new Thread(t2);
			thread1.setName("thread1");
			thread1.start();
		
	}

}

