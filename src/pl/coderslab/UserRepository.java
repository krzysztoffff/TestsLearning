package pl.coderslab;

public class UserRepository extends User{

	public UserRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRepository(String userName, String password, String email) throws Exception {
		super(userName, password, email);
		// TODO Auto-generated constructor stub
	}
	

	public void edit(String userName, String email) {
		this.setUserName(userName);
		this.setEmail(email);
		
	}
}
