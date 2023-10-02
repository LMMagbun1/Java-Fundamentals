package com.kintegration.exception;

import java.util.Arrays;

public class Car extends Vehicle {
	
	String trans;
	static int x = 10;
	
	Car(String trans) {
		this.trans = trans;
	}
	
	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Manual");
		
		for (int x =0; x < 5; x++) {
			
		}
		System.out.println(x);
		
		int[] numbers = {3, 053, 56};
		System.out.println(Arrays.toString(numbers));
		
		int hex = 0x45EAD;
		System.out.println(hex);
		
		System.out.println(c1 instanceof Object);
		
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " "+ c2.trans);
		
		StringBuilder sb = new StringBuilder("Java");
		String s = "Java";
		
		if (sb.equals(c1)) {
			System.out.println("Match 1");
		} else if (sb.equals(s)) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
	}

}
