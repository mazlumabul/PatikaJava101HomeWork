package ogrenciBilgiSistemi_Odev;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "054261625369");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
		Teacher t3 = new Teacher("Kül Yutmaz", "BIO", "05718400");
		
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);

		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		
		Course bioloji = new Course("Bioloji", "103", "BIO");
		bioloji.addTeacher(t3);

		Student s1 = new Student("Ýnek Þaban", "123", "4 ", tarih, fizik, bioloji);
		s1.addBulkSozluNote(50, 100, 100);
		s1.addBulkExamNote(100, 100, 100);
		s1.isPass();
	
	}
}
