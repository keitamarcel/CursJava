package Curs3;

import java.util.Scanner;

public class Varsta {

	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Ce varsta ai ?");
		int varsta = scan.nextInt();
	
		if(varsta <= 17)	{
			System.out.println("Esti minor !");
		}
		else if(varsta >= 18 && varsta <= 65) {
			System.out.println("Esti adult !");
			
		}
		else {
			System.out.println("Esti batran !");
			
		}
	}
}
	
	
	
	
	
	
	
	

