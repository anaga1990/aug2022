package com.test;

public class ExOfLocal {
	
	//local variable declared with in the method
	public static void main(String[] args) {
		int a = 10; // local variable
		a+=20;//a = a +20 => 10+20 = 30
		System.out.println(a);
	}
	
	public void test() {
		//System.out.println(a); // a is unknown variable to test() method
	}
}
