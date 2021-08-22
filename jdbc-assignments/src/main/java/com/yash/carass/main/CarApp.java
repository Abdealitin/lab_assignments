package com.yash.carass.main;

import java.util.Scanner;

import com.yash.carass.service.CarService;

public class CarApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Enter regNo:");
//		Scanner sc = new Scanner(System.in);
//		int reg= sc.nextInt();
//		System.out.println("Enter owner Name:");
//		String owner= sc.next();
//		System.out.println("Enter Car Type:");
//		String type = sc.next();
//		System.out.println("Enter Engine:");
//		String eng = sc.next();
		CarService cs = new CarService();
		//cs.CarEntry(reg, owner, type, eng);
		cs.deleteById(104);
		cs.getCarList();
		
		
//		System.out.println("Enter a choice:");
//		System.out.println("1. Add ar details\n2. List of Cars.");
//		int x = sc.nextInt();
		
//		switch(x) {
//		case 1:
//			System.out.println("Enter regNo:");
//			int reg= sc.nextInt();
//			System.out.println("Enter owner Name:");
//			String owner= sc.next();
//			System.out.println("Enter Car Type:");
//			String type = sc.next();
//			System.out.println("Enter Engine:");
//			String eng = sc.next();
//		}
//		CarService cs = new CarService();
//		//cs.CarEntry(reg, owner, type, eng);
//		cs.getCarList();
	}
//
}
