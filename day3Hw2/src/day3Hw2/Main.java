package day3Hw2;

public class Main {

	public static void main(String[] args) {

		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Burçak");
		student1.setLastName("Güneri");
		student1.setEmail("burcakguneri@outlook.com");
		student1.setNickName("brck");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Engin ");
		student2.setLastName("Demiroğ");
		student2.setEmail("engindemirog@gmail.com");
		student2.setNickName("eng");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Elon ");
		student3.setLastName("Musk");
		student3.setEmail("elon.musk@gmail.com");
		student3.setNickName("eln");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(4);
		instructor1.setFirstName("Bill");
		instructor1.setLastName("Gates");
		instructor1.setEmail("billgates@gmail.com");
		instructor1.setTitle("blg");
		
		
		UserManager userManager = new UserManager();
		
		User[] users = {student1, student2, student3, instructor1};
		
		userManager.addMultiple(users);
		
		System.out.println("-------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addJava(student1);
		studentManager.addC(student2);
		studentManager.deleteJava(student3);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
	}
}