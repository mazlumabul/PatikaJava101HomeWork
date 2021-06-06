package ogrenciBilgiSistemi_Odev;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix; // Teacher da tan�mlad���m branch ile ayn� olmas�n� kontrol ediyoruz..
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
			System.out.println("��retmen ve Ders  B�l�mler uyu�muyor");
		}

	}

	public void printTeacher() {
		this.teacher.print();
	}

}
