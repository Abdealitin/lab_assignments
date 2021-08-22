package com.yash.multithreading;

class FirstThread{
	public void display(String s) {
		System.out.print("["+s);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class SecondThread extends Thread{
	String s;
	FirstThread fobj;
	SecondThread (FirstThread fp,String str){
		fobj=fp;
		s=str;
		start();
	}
	public void run() {
		fobj.display(s);
	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstThread fnew = new FirstThread();
		SecondThread ss = new SecondThread(fnew,"welcome");
		//ss.sleep(1000);
		ss.join(1000);
		SecondThread ss1 = new SecondThread(fnew,"Hello");
		//ss1.sleep(3000);
		ss1.join(2500);
		
		SecondThread ss2 = new SecondThread(fnew,"Trainees");
		//ss2.sleep(3500);
		ss2.join(3500);
		
		Thread.sleep(2000);
		System.out.println(ss2.isAlive());
	}

}
