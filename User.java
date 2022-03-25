package BussinessLogic;

import java.sql.SQLException;
import database.UserLogIn;
import database.UserSignUp;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public void logIn(String name, String pass) throws SQLException, UserLogIn {
		UserLogIn user = new UserLogIn(name,pass,null);
		user.logIn();
	}
	
	public void signUp(String name, String pass, int phone, String address, String email) {
		UserSignUp user = new UserSignUp(name,pass,phone,address,email);
		user.SignUp();
	}
}
