
public class ProfessorController {
	private ProfessorView professorView;
	private Professor professor;
	
	public ProfessorController(ProfessorView professorview, Professor newProfessor) {
		professorView = professorview;
		professor =  newProfessor;
	}
	public void printProfessorDetails() {
		professorView.printProfessorDetails(professor);
	}
}
