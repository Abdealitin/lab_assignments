package com.yash.enumpractice;

public enum TrafficSignal {
	RED("STOP"),GREEN("GO"),YELLOW("WAIT");
	
	String action;
	
	TrafficSignal(String action) {
		// TODO Auto-generated constructor stub
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}
	
}
