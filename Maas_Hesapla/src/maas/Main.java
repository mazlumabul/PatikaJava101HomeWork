package maas;

public class Main {
	public static void main(String[] args) {
		/*
		Employee employee = new Employee("mazlum", 2000, 45, 1985);
		employee.tax();
		employee.raiseSalary();
		employee.bonus() ;
		employee.toStringEmployee();
		*/
	
		Employee employee = new Employee("mazlum", 2000, 45, 1985);
		employee.toStringEmployee();
		System.out.println("Vergi : "+employee.tax());
		System.out.println("Bonus : "+employee.bonus());
		System.out.println("�al��t��� Y�la G�re Maa� Art��� : "+employee.raiseSalary());
		
		System.out.println("Toplam maa� : " + employee.salary);
		
	
	} 
}
