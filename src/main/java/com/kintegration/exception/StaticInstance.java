package com.kintegration.exception;

import java.util.ArrayList;
import java.util.List;

public class StaticInstance {
	
	static int i;
	int j;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
		
		List elements = new ArrayList<>();
		elements.add(10);
		int firstElement = (int) elements.get(1);
		System.out.println(firstElement);
		
		
	}

}
