
public class StudentController {
	private StudentView studentView;
	private Student student;
	
	public StudentController(StudentView studentview, Student newStudent) {
		studentView = studentview;
		student =  newStudent;
	}
	public void printStudentDetails() {
		studentView.printStudentDetails(student);
	}
}
