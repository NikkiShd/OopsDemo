package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		
MyThread obj=new MyThread();
obj.create();
System.out.println("This is the main thread");
	}

	private void create() {
		Thread objt=new Thread(this);
		objt.start();
		
	}
	public void run() {
		while(true) {
			try {
				System.out.println("This is the child thread");
				Thread.sleep(500);
			}catch(InterruptedException e){
		}
	}

}
}