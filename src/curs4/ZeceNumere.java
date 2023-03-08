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

		System.out.println("Please enter number 3 :");
		int num3 = scan.nextInt();
		
		System.out.println("Please enter number 4 :");
		int num4 =  scan.nextInt();
		
		System.out.println("Please enter number 5 :");
		int num5 = scan.nextInt();
		
		System.out.println("Please enter number 6 :");
		int num6 =  scan.nextInt();

		System.out.println("Please enter number 7 :");
		int num7 = scan.nextInt();
		
		System.out.println("Please enter number 8 :");
		int num8 =  scan.nextInt();
		
		System.out.println("Please enter number 9 :");
		int num9 = scan.nextInt();
		
		System.out.println("Please enter number 10 :");
		int num10 =  scan.nextInt();
		
		System.out.println("The sum of the numbers is:" +( num1+num2+num3+num4+num5+num6+num7+num8+num9+num10));
	
	}	
	
	}
}
	
