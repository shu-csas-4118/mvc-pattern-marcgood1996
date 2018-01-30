
public class Professor {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	public Professor (String firstname, String lastname, String email, String phonenumber)
	{
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setEmail(email);
		this.setPhoneNumber(phonenumber);
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email2) {
		this.email = email2;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return this.firstName+ " " + this.lastName;
		
	}
	
	
	
}
