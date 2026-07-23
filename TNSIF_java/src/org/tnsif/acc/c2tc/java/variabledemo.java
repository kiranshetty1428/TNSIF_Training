package org.tnsif.acc.c2tc.java;

public class variabledemo {
	int price=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message="hello student";
	
	

	public static void main(String[] args) {
		variabledemo obj = new variabledemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		// TODO Auto-generated method stub

	}

}

