package ogrenciBilgiSistemi_Odev;
//mpno -> phoneNumber

public class Teacher {
	String name;
	String phoneNumber;
	String branch;
	
	
	public Teacher(String name, String branch, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.branch = branch;
	}
	
	public void print() {
		System.out.println("Adý : " + this.name);
		System.out.println("Telefonu : " + this.phoneNumber);
		System.out.println("Branþý : " + this.branch);
		
	}
}
