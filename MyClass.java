package multiThreading;


class TestObject{
	synchronized static void showMessage() {
		System.out.println("****");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + "says Good noon...");
		}
	}
	
}

class MyThread11 extends Thread{
	
	public void run() {
	
		TestObject.showMessage();
	}
}

class MyThread22 extends Thread{
	
	public void run() {
		TestObject.showMessage();
	}
	
}

class MyThread33 extends Thread{
	
	public void run() {
	
		TestObject.showMessage();
	}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread11 thread1 = new MyThread11();
		MyThread22 thread2 = new MyThread22();
		MyThread33 thread3 = new MyThread33();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
