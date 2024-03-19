package com.java.telugu.userinput;

public class StaticNonstatic {
	static{
		System.out.println("static block");
		System.out.println("static block");

	}
	{
		System.out.println("non-static block");
	}
	public StaticNonstatic() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		StaticNonstatic obj = new StaticNonstatic();
		StaticNonstatic obj1 = new StaticNonstatic();
		StaticNonstatic obj2 = new StaticNonstatic();
		
	}

}
