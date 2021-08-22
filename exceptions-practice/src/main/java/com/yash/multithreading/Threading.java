package com.yash.multithreading;

public class Threading implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Threading t = new Threading();
		Thread th = new Thread(t,"t1");
		Thread th1 = new Thread(t,"t2");
		Thread th2 = new Thread(t,"t3");
		th.start();
		th1.start();
		th2.start();
		th1.sleep(1000);
		th2.sleep(1500);
//		th.setPriority(1);
//		th1.setPriority(2);
//		th2.setPriority(3);
//		th1.join(2000);
//		th2.join(3000);
		//th.interrupt();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//System.out.println("Hello there");
		System.out.println("Thread "+Thread.currentThread().getName()+" Running");
		System.out.println("Thread "+Thread.currentThread().getState()+" State");
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
//		System.out.println("Thread ID :"+Thread.currentThread().getId());
//		System.out.println("Thread name : "+Thread.currentThread().getName()
//				+", Thread Priority: "+Thread.currentThread().getPriority()
//				+", Thread Tostring : "+Thread.currentThread().toString());
	}

}
