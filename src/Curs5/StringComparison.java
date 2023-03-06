package Curs5;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s1 = "masina";
		   String s2 = "masina";
   String s3 = new String("masina");
   
		
	System.out.println(s1 ==s2 ); // va afisa TRue
	System.out.println(s1 ==s3 ); // va afisa false
	
	System.out.println(s1.equals(s3) ); // va afisa TRue
	}

}
