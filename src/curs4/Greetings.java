package curs4;

import java.util.Scanner;


public class Greetings {

	public static void main(String[] args) {

		System.out.println("Te rog introdu calificativul:");
		
		Scanner obj = new Scanner(System.in);
		String calificativ= obj.next();
		
	/*	if(calificativ.equals("A")) {
			System.out.println("Good job!");
			
		}else if(calificativ.equals("B") {
			System.out.println("Not that good job!");
		}*/
		
		switch(calificativ.toUpperCase()) {
		case "A":
			System.out.println("Good job");
			break;
		case "B":
			System.out.println("Not so good");
			break;
		case "C":
			System.out.println("Kind of bad");
			break;
		default:
			System.out.println("Please insert only A, B, C");
		}
		
	}

}
