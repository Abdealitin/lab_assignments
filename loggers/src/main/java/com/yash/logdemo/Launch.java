package com.yash.logdemo;

import com.yash.demo.Demo;

public class Launch {

//	public void method(Object obj, String obj2) {
//		System.out.println("Objet,String");
//	}
//	
//	public void method(Arrays obj, String obj2) {
//		System.out.println("Array,String");
//	}
//	public void method(Arrays obj1,Object obj) {
//		System.out.println("Arrays,Objet");
//	}
	public void method(byte x, short y) {
		System.out.println("Byte,Short"+x+y);
	}
	
	public void method(short obj, int obj2) {
		System.out.println("Short,Int"+obj+obj2);
	}
	public void method(int obj1,long obj) {
		System.out.println("Int, Long"+obj1+obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Launch a = new Launch();
//		byte p =65;
//		char q = (char)p;
//		a.method(p, q);
//		Mul b= new Mul(2,2,3);
		Demo d = new Demo();
		System.out.print(d.a+" "+d.b);
	}

}
final class Mul{
	private int vol;
	Mul(int l, int h, int w){
		this.vol = l*h*w;
	}
	public int getVol() {
		return vol;
	}
}
