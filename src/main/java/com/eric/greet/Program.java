package com.eric.greet;

public class Program {
	public static void main(String[] args)
	{
		Greet greet = new Greet();
		System.out.println(greet.hello("Eric"));
		System.out.println(greet.bye("Eric"));
	}
}
