package fit.iuh.se.tuan3.bai2.entity;

public class User {
	private String firstName, lastName, email, confirmEmail, passWord;
	private String day;
	private String month;
	private String year;
	private String gender;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String confirmEmail, String passWord, String day,
			String month, String year, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.confirmEmail = confirmEmail;
		this.passWord = passWord;
		this.day = day;
		this.month = month;
		this.year = year;
		this.gender = gender;
	}
	
	public User(String firstName, String lastName, String email, String confirmEmail, String day,
			String month, String year, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.confirmEmail = confirmEmail;
//		this.passWord = passWord;
		this.day = day;
		this.month = month;
		this.year = year;
		this.gender = gender;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
