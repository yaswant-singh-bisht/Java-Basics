package javaTopics;
//Inheriting Thread class
class SingleThreadClass extends Thread { 
	public void run() {
		System.out.println("run method is called internally on calling start method of Thread class...");
	}
}

//Using runnable interface
class SingleThreadInterface implements Runnable{
	public void run() {
		System.out.println("run method is called internally on calling start method of Runnable interface...");
	}
}


public class ThreadClass {

	public static void main(String[] args) {
		SingleThreadClass stc = new SingleThreadClass();
		stc.start();
		System.out.println(stc.isAlive());
		//stc.run(); // No need to call this, its implicitly called from start class
		//Thread.sleep(20000); // suspends the thread for given time in miliseconds; static method - can be called directly without creating object; used within try catch block
		//stc.join(); // waits for thread to complete process; used in multithreading only; used within try catch block
		System.out.println(stc.getId()); // returns thread id
		System.out.println(stc.getName()); // returns thread name
		stc.setName("Thread-X0X");
		System.out.println(stc.getName());
		System.out.println(stc.getPriority()); // ranges from 1 to 10; default is 5
		stc.setPriority(10);
		System.out.println(stc.getPriority());
		
		SingleThreadInterface sti = new SingleThreadInterface();
		Thread th = new Thread(sti);
		th.start();
	}

}
