package OOP;

class Book implements Runnable{
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("updating db");
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Num extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(1200);} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
}

//go through the repositary once , there's another example u should see


public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable b=new Book();			//in runnable interface there is no run method.so we have to deal it in another way
		Num n=new Num();
		
		Thread t1 = new Thread(b);			//here we're creating new thread object and making some relation with runnable object we already created, 
		t1.start();							//so that we can access the b by t1 using start(); .that's how it works
		n.start();
		if(n.isAlive()) {
			System.out.println("Still executing");
		}
		n.join();
		if(n.isAlive()) {
			System.out.println("Still executing");
		}
		System.out.println("fucku");

	}

}
