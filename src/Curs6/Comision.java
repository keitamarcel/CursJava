package Curs6;

public class Comision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int comision;
	int vanzari =4500;
	comision =(vanzari>2500)?vanzari*5/100:0;
	
	if(vanzari>2500){ 
		System.out.println("Comisionul tau este: " + vanzari*5/100);
	
			}else { 
				System.out.println("Comisionul tau este: 0");
				}	
		
	}

}

