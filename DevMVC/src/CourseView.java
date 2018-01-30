
public class CourseView {
	
	private Course course;
	
	public CourseView(Course s) {
		course = s;
	}
	public CourseView() {
		
	}
	public void setCourseDetails(Course newCourse) {
		course = newCourse;
	}
	public void printCourseDetails() {
		if(this.course != null) {
			System.out.println("Course Name: "+ course.getCourseName());
			System.out.println("Course Number: "+ course.getCourseNumber());
			System.out.println("Credit Number: "+ course.getCredit());
			System.out.println("Professor : "+ course.getProfessor());
		}
	}
	public void printCourseDetails(Course c) {
		if(c != null) {
			System.out.println("Course Name: "+ course.getCourseName());
			System.out.println("Course Number: "+ course.getCourseNumber());
			System.out.println("Credit Number: "+ course.getCredit());
			System.out.println("Professor : "+ course.getProfessor());
		}
	}

}
