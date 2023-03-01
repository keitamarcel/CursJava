package Curs3;

import java.util.Scanner;

public class PicatSauTrecut {

	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Ce punctaj ai obtinut ?");
		int punctaj = scan.nextInt();
		
		
	if(punctaj <= 65)	{
		System.out.println("Ai picat. Mai incearca!");
	}
	else {
		System.out.println("Felicitari, Ai trecut!");
		
	}
		
	
	}
	
	
	
	
}