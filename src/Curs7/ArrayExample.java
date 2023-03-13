package Curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] textArray = new String[5];
//java in spate genereaza:
// String [] textArray ={ null,null,null.null.null}
		//index of array = 0,   1,   2,   3,    4
  System.out.println(textArray[0]); 
		textArray[0] ="This";
		System.out.println(textArray[0]);
		
		textArray[1] ="is";
		System.out.println(textArray[0]);
		
		textArray[2] ="an";
		
		textArray[3] ="array";
		
		textArray[4] ="!";
		
		for (int i=0; i<textArray.length; i++) {
		System.out.println(textArray[i] );
		}
		// doar sa il printam cursiv
		System.out.println(Arrays.toString(textArray));
		//for each - enhanced loop
		
		
		for (String element :textArray) {
		
		System.out.println(element);
		}
	}
	}

