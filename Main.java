package multiThreading;

class A extends Thread {
	public void start() {
		System.out.println("hello"+Thread.currentThread().getName());
	
		
	}
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread());
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
				System.out.println(Thread.currentThread());
			}
		
		A thread1 = new A();
		thread1.start();
		
	}

}
