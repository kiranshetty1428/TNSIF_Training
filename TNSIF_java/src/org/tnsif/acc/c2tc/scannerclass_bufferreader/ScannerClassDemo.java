package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Name");
		char c=scan.next().charAt(2);
		System.out.println("The Third Number of string : "+ c);
		scan.close();
	} 

}