
public class Course {
	private String courseName;
	private Professor professor;
	private int credit;
	private int courseNumber;
	public Course(String courseName, Professor professor, int credit, int courseNumber) {
		this.setCourseName(courseName);
		this.setProfessor(professor);
		this.setCredit(credit);
		this.setCourseNumber(courseNumber);
		
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
