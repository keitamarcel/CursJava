package curs4;

import java.util.Scanner;

public class NrPrintTable {
	
	public static void main(String[] args) {

	System.out.println("Please enter a number :");
	Scanner scan = new Scanner(System.in);
	int numar = scan.nextInt();
	
	
	for(int i=1; i<11; i++) {
		
		
		System.out.println(numar +"*"+ i+ "="+ numar*i);
		
	
		
	}
	
}
}