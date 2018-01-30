
public class StudentView {
	
	private Student student;
	
	public StudentView(Student s) {
		student = s;
	}
	public StudentView() {
		
	}
	public void setStudentDetails(Student newStudent) {
		student = newStudent;
	}
	public void printStudentDetails() {
		if(this.student != null) {
			System.out.println("First Name: "+ student.getFirstName());
			System.out.println("Last Name: "+ student.getLastName());
			System.out.println("ID Number: "+ student.getIDNumber());
		}
	}
	public void printStudentDetails(Student s) {
		if(s != null) {
			System.out.println("First Name: "+ s.getFirstName());
			System.out.println("Last Name: "+ s.getLastName());
			System.out.println("ID Number: "+ s.getIDNumber());
		}
	}
	public void printCourses(Student s) {
		if(s != null) {
			//System.out.println(s.getCourses());
			for(Course course : s.getCourses()){
				System.out.println("Course Name: "+ course.getCourseName());
				System.out.println("Course Number: "+ course.getCourseNumber());
				System.out.println("Course Credit: "+ course.getCredit());
				System.out.println("Course Professor: "+ course.getProfessor());
			}
		}
	}
}
