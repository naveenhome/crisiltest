package crisil.main;

public class RegistrationBAL {

	public String Register(Patient patient) {
		// TODO Auto-generated method stub
		if(patient.email.equals("naveen@gmail.com"))
		{
			return "Email already exist.";
		}
		else
		{
			return "Sucess";
		}
	}

}
