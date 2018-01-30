import java.util.ArrayList;

public class MyMvcDemo {

	public static void main(String[] args) {
		Professor garettChang = new Professor("Garett","Chang","changar@shu.edu","973-393-5834");
		Professor marcoMorazan = new Professor("Marco","Morazan","mmorazan@shu.edu","973-245-7362");
		Course softwareEngineering = new Course("Software Engineering II", garettChang, 3, 3001);
		Course programmingLanguages = new Course("Programming Languages", marcoMorazan, 3, 3002);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(softwareEngineering);
		courses.add(programmingLanguages);
		
		Student student = new Student("Marc", "Good", 23434533,"marcgood96@gmail.com", courses);
		StudentView studentView = new StudentView();
		 
		StudentController studentcontroller = new StudentController(studentView,student);
		studentView.printCourses(student);
		studentcontroller.printStudentDetails();

	}

}
