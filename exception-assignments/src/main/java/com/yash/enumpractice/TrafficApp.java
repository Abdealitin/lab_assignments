package com.yash.enumpractice;

public class TrafficApp {
	public static void main(String []args) {
		TrafficSignal[] tf = TrafficSignal.values();
		for (TrafficSignal tf1:tf)
			System.out.println("Signal:"+tf1+" Action:"+tf1.getAction());
	}
}
