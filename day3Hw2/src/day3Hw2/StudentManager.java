package day3Hw2;

public class StudentManager {

	public void addJava(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Java e�itimine kat�ld�..");
	}
	
	public void deleteJava(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Java e�itiminden kayd� silindi..");
	}
	
	public void addC(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " React e�itimine kat�ld�.");
	}
	
}
