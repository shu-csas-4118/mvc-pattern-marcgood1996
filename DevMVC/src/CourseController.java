
public class CourseController {
	private CourseView courseView;
	private Course course;
	
	public CourseController(CourseView courseview, Course newCourse) {
		courseView = courseview;
		course =  newCourse;
	}
	public void printCourseDetails() {
		courseView.printCourseDetails(course);
	}
}
