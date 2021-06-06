package ogrenciBilgiSistemi_Odev;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix; // Teacher da tanýmladýðým branch ile ayný olmasýný kontrol ediyoruz..
	double note;
	double sozluNote;

	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		double note = 0;
		double sozluNote = 0;
	}

	public void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(prefix)) {
			this.teacher = teacher;

		} else {
			System.out.println("Öðretmen ve Ders  Bölümler uyuþmuyor");
		}

	}

	public void printTeacher() {
		this.teacher.print();
	}

}
