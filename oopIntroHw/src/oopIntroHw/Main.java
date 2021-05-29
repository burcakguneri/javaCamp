package oopIntroHw;


public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giriş Kampı", "Engin Demirog", "Ücretsiz");
		Course course2 = new Course(2, "Web Programlama Kampı", "Engin Demirog",
				"Ücretsiz");
		Course course3 = new Course(2, "Yazılım Geliştirici Kampı (JAVA + REACT)", "Engin Demirog",
				"Ücretsiz");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName);
		}

		Category category1 = new Category(1, "Programlama");

		Category[] categories = { category1 };

		for (Category category : categories) {
			System.out.println(category.name);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.joinTheProgram(course1);

		courseManager.joinTheProgram(course2);

		courseManager.joinTheProgram(course3);

		courseManager.searchTheCourse(course3);

	}
	
}