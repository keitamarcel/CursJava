package Curs2;

public class SalaryCalculator {
	
	int hoursWorked = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Tester tester1 =new Tester();
	tester1.setName("Oana");
	tester1.setRatePerHour(30);
	tester1.setAge(25);
	Tester tester2 =new Tester();
	tester2.setName("Maria");
	tester2.setRatePerHour(25);
	tester2.setAge(27);
	Tester tester3 =new Tester();
	tester3.setName("Ana");
	tester3.setAge(25);
	tester3.setRatePerHour(27);
	
	
	
	System.out.println(tester1.getName());
	System.out.println(tester2.getName());
	
	SalaryCalculator calc = new SalaryCalculator();
	
	System.out.println("Salariul lui " +tester1.getName() + " este " + calc.calculateSalary(tester1.getRatePerHour()));
	System.out.println(tester1.getName() + " are : " + tester1.getAge() +" ani! ");
	System.out.println(tester2.getName() + " are : " + tester2.getAge() +" ani! ");
	System.out.println(tester3.getName() + " are : " + tester3.getAge() +" ani! ");			
	}

	public int calculateSalary(int plataPeOra) {
	 int salary = plataPeOra * hoursWorked;
	  return salary;
	}
	
}
