package com.kintegration.inheritance;

public class Programmer extends Writer {
	
	public static void write() {
		System.out.println("Writing Code...");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Writer w = new Programmer();
		w.write();
	}

}
