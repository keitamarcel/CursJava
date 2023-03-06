package curs4;

import java.util.Scanner;

public class ZeceNumere {

	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	int num10;
	
	int result;
	 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int num =1; num<11; num++); {
			
		System.out.println("Please enter number 1 :");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter number 2 :");
		int num2 =  scan.nextInt();

		System.out.println("The sum of the numbers is:" +( num1+num2));
	
	}	
	
	}
}
	
