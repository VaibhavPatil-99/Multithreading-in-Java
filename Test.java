package multiThreading;

class T1 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T1 t1 =new T1();
		t1.setName("child Thread");
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
