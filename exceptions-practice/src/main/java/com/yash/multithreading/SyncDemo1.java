package com.yash.multithreading;

class FirstThread1{
	synchronized public void display(String s) {
		System.out.print("["+s);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class SecondThread1 extends Thread{
	String s;
	FirstThread1 fobj;
	SecondThread1 (FirstThread1 fp,String str){
		fobj=fp;
		s=str;
		start();
	}
	public void run() {
		fobj.display(s);
	}
}

public class SyncDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstThread1 fnew = new FirstThread1();
		SecondThread1 ss = new SecondThread1(fnew,"welcome");
		ss.sleep(1000);
		//ss.join(1000);
		SecondThread1 ss1 = new SecondThread1(fnew,"Hello");
		ss1.sleep(3000);
		//ss1.join(2500);
		
		SecondThread1 ss2 = new SecondThread1(fnew,"Trainees");
		ss2.sleep(3500);
		//ss2.join(3500);
		
		Thread.sleep(5000);
		System.out.println(ss2.isAlive());
	}

}
