package ogrenciBilgiSistemi_Odev;

public class Student {
	Course c1;
	Course c2;
	Course c3;
	String name;
	String studentNumber;
	String classes;
	double avarage;
	boolean isPass;

	public Student(String name, String studentNumber, String classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0;
		this.isPass = false;
	}

	public void addBulkSozluNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100)
			this.c1.sozluNote = note1;
		if (note2 >= 0 && note2 <= 100)
			this.c2.sozluNote = note2;
		if (note3 >= 0 && note3 <= 100)
			this.c3.sozluNote = note3;
	}

	public void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100)
			this.c1.note = note1;
		if (note2 >= 0 && note2 <= 100)
			this.c2.note = note2;
		if (note3 >= 0 && note3 <= 100)
			this.c3.note = note3;
	}
	public void calcAvarage() {
		this.c1.note = (c1.sozluNote*0.20 + c1.note*0.80);
		this.c2.note = (c2.sozluNote*0.20 + c2.note*0.80);
		this.c3.note = (c3.sozluNote*0.20 + c3.note*0.80);
		
		this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
	}
	public void isPass() {
		System.out.println("**********************");
		calcAvarage();
		if (this.avarage >= 0) {
			System.out.println("Sýnýfý geçtiniz");
			this.isPass = true;
		} else {
			System.out.println("Sýnýfta kaldýnýz");
			this.isPass = true;
		}
		printNote();
	}

	public void printNote() {

		System.out.println(this.c1.name + " Notu Ortalamasý\t:" + this.c1.note);
		System.out.println(this.c2.name + " Notu Ortalamasý\t:" + this.c2.note);
		System.out.println(this.c3.name + " Notu Ortalamasý\t:" + this.c3.note);
		System.out.println("Ortalamanýz : " + this.avarage);
	}
}
