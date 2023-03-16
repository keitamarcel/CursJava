package Curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> list =new ArrayList<>();//array list
//List<integer>  sau List<character>
String[] array =new String[3];//array

System.out.println(list.size());
System.out.println(list.isEmpty());

list.add("ioana");
list.add("ionela");
list.add("maria");

System.out.println(list.get(2));   //maria (0,1,2)

list.add(1,"george"); //il adauga pe george inlocul lui ion

	}

}
