package Curs6;

public class TernaryExapmle1{ 
	public static void main(String[] args) { 
		int percentage=90; 
		if(percentage>100){ 
			System.out.println(percentage+ percentage/10);
		
				}else { 
					System.out.println(percentage+ percentage/20);
					}
		int x =(percentage>100)?(percentage+percentage/10):(percentage+percentage/20);
		System.out.println(x);
	}
	
	
}
