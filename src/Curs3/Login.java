package Curs3;

import java.util.Scanner;

public class Login {

	
	public void verificaLogin() {
		//ne ajuta sa citim de la tastatura
		Scanner scan = new Scanner(System.in);
		
	String username = "test";
	String password = "test123";
	
	System.out.println(" Te rog sa introduci username :");
	//variabila user ca stoca dupa executie ce am scris de la tastatura
	String user = scan.next();
	System.out.println(" Te rog sa introduci parola");
	String pass = scan.next();
	
	//&& ---and
	//||---or
	
		if(user.equals(username) && pass.equals(password) ) {
			
			System.out.println("Login succesfull");
			
		}else {
			
			System.out.println("Login failed");
		}
		
	}
	
}
