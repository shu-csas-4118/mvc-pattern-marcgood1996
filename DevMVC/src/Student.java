import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private int idNumber ;
	private ArrayList<Course> courses;
	public Student(String firstname, String lastname,int id, String email, ArrayList<Course> courses) {
		firstName = firstname;
		lastName = lastname;
		idNumber = id;
		this.courses= courses;
	}
	public void addClass(Course c) {
		courses.add(c);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getIDNumber() {
		return idNumber;
	}
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		 lastName = newLastName;
	}
	public void setIDNumber(int newIDNum) {
		 idNumber = newIDNum;
	}
	public ArrayList<Course> getCourses(){
		return this.courses;
	}
	
	
}
