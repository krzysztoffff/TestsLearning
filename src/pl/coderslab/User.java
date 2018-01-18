package pl.coderslab;

public class User {

	private String userName;
	private String password;
	private String email;
	int id;
	static private int nextId = 0;
	
	public User() {
		this.id = ++nextId;
	}
	
	




	public User(String userName, String password, String email) throws Exception {
		this();
		this.userName = userName;
		setPassword(password); 
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws Exception {
		if (password.length() < 6) {
			throw new Exception("Password is to short. It must be at least 6 characters");
		}
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}






	public int getId() {
		return id;
	}






	protected void setId(int id) {
		this.id = id;
	}
	
	public void delete() {
		
	}
	
}
