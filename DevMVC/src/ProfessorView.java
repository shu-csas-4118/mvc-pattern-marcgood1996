
public class ProfessorView {
	
	private Professor professor;
	
	public ProfessorView(Professor s) {
		professor = s;
	}
	public ProfessorView() {
		
	}
	public void setProfessorDetails(Professor newProfessor) {
		professor = newProfessor;
	}
	public void printProfessorDetails() {
		if(this.professor != null) {
			System.out.println("First Name: "+ professor.getFirstName());
			System.out.println("Last Name: "+ professor.getLastName());
			System.out.println("Email: "+ professor.getEmail());
			System.out.println("Phone Number: "+ professor.getPhoneNumber());
		}
	}
	public void printProfessorDetails(Professor s) {
		if(s != null) {
			System.out.println("First Name: "+ professor.getFirstName());
			System.out.println("Last Name: "+ professor.getLastName());
			System.out.println("Email: "+ professor.getEmail());
			System.out.println("Phone Number: "+ professor.getPhoneNumber());
		}
	}
}
