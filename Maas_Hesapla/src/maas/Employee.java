package maas;

public class Employee {
	public String name;             //  Çalýþanýn adý ve soyadý
	public double salary;           //  Çalýþanýn maaþý
	public int workHours;           //  Haftalýk çalýþma saati
	public int hireYear ;           //  Ýþe baþlangýç yýlý
	public int nowDate=2021;        //	þimdiki zamaný
	public int defaultWorkHours=40; // varsayýlan haftada çalýþma saati
	// not : nowDate ve defaultWorkHours tanýmlamamýn nedeni ileriki zamanlarda 
	// geliþecek olan deðiþiklikler içindir.
	public Employee(String name, double salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double taxAmount = 0; // vergi tutarý
		if(salary >1000) {
			taxAmount = this.salary*0.03;
			this.salary = this.salary - taxAmount;
		}
		return taxAmount;
	}
	
	public double bonus() {
		double bonusAmount=0;
		int workingHour=0;
		if(this.workHours > this.defaultWorkHours ) {
			workingHour = this.workHours - this.defaultWorkHours;
			bonusAmount = workingHour * 30;
			this.salary = this.salary + bonusAmount;
		}
		
		return bonusAmount;
	}
	public double raiseSalary() {	
		double raiseAmount = 0;
		if(nowDate - this.hireYear < 10) {
			raiseAmount = this.salary*0.05;
			this.salary += raiseAmount;
		} else if(nowDate - this.hireYear >= 10 &&  nowDate - this.hireYear < 20) {
			raiseAmount = this.salary*0.10;
			this.salary += raiseAmount;
		} else if(nowDate - this.hireYear >= 20) {
			raiseAmount = this.salary*0.15;
			this.salary = this.salary + raiseAmount;
		}
		return raiseAmount;
	}
	 

	
	
	public void toStringEmployee() {
		System.out.print(
				"Adý : "+this.name +"\n"+
				"Maaþ : "+this.salary+"\n"+
				"Haftalýk Çalýþma Saati : "+this.workHours+"\n"+
				"Ýþe Baþlangýç Yýlý : "+this.hireYear+"\n");
		
	}
	
}
