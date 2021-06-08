package maas;

public class Employee {
	public String name;             //  �al��an�n ad� ve soyad�
	public double salary;           //  �al��an�n maa��
	public int workHours;           //  Haftal�k �al��ma saati
	public int hireYear ;           //  ��e ba�lang�� y�l�
	public int nowDate=2021;        //	�imdiki zaman�
	public int defaultWorkHours=40; // varsay�lan haftada �al��ma saati
	// not : nowDate ve defaultWorkHours tan�mlamam�n nedeni ileriki zamanlarda 
	// geli�ecek olan de�i�iklikler i�indir.
	public Employee(String name, double salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double taxAmount = 0; // vergi tutar�
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
				"Ad� : "+this.name +"\n"+
				"Maa� : "+this.salary+"\n"+
				"Haftal�k �al��ma Saati : "+this.workHours+"\n"+
				"��e Ba�lang�� Y�l� : "+this.hireYear+"\n");
		
	}
	
}
