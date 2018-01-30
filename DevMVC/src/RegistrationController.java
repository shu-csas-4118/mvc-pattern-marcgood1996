
public class RegistrationController {
	private ProfessorView professorView;
	private Professor professor;
	
	public RegistrationController(ProfessorView professorview, Professor newProfessor) {
		professorView = professorview;
		professor =  newProfessor;
	}
	public void printProfessorDetails() {
		professorView.printProfessorDetails(professor);
	}
}
