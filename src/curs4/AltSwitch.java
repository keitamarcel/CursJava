package curs4;

import java.util.Scanner;

public class AltSwitch {

	
	int num;
	int result;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un numar:");
		
		
		int num = scan.nextInt();

			switch (num) {
			case 1:
				num=1;
			
				System.out.println("Luni");
				break;
			case 2:
				num=2;
				System.out.println("Marti");
				break;
			case 3:
				num=3;
				System.out.println("Miercuri");
				break;
			case 4:
				num=4;
				System.out.println("Joi");
				break;
			case 5:
				num=5;
				System.out.println("Vineri");
			case 6:
				num=6;
				System.out.println("Sambata");
				break;
			case 7:
				num=7;
				System.out.println("Duminica");
				default:
					System.out.println("Te rog introduce un numar de la 1 la 7");
					
			}
	
			//System.out.println("Ziua saptamanii este"+" "+ num);
		}	
}


