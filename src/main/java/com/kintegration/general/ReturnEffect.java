package com.kintegration.general;

public class ReturnEffect {

	public static void main(String[] args) {
	new ReturnEffect().checkFlow();;

	}
	
	public void checkFlow() {
		
		try {
			System.out.println("This flow reached the flow block");
			System.out.println("The second line in the try block");
			return;
		}
		catch(Exception e) {
			return;
		}
		finally {
			System.out.println("This flow reached the finally block");
		}
	}

}
