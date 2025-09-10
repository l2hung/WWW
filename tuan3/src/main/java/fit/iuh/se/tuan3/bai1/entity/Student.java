package fit.iuh.se.tuan3.bai1.entity;

public class Student {
	private String firstName;
	private String lastName;
	private String birthDay;
//	private String dobDay;
//	private String dobMonth;
//	private String dobYear;
	private String email;
	private String mobileNumber;
	private String gender;
	private String address;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	private String[] hobbies;
	private String[] qualifications;
	private String[] boards;
	private String[] percentages;
	private String[] passingYears;
	private String course;

	// Constructor
	public Student() {
	}

	// Getters and Setters for each field

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

//	public String getDobDay() {
//		return dobDay;
//	}
//
//	public void setDobDay(String dobDay) {
//		this.dobDay = dobDay;
//	}
//
//	public String getDobMonth() {
//		return dobMonth;
//	}
//
//	public void setDobMonth(String dobMonth) {
//		this.dobMonth = dobMonth;
//	}
//
//	public String getDobYear() {
//		return dobYear;
//	}
//
//	public void setDobYear(String dobYear) {
//		this.dobYear = dobYear;
//	}

	public String getEmail() {
		return email;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getQualifications() {
		return qualifications;
	}

	public void setQualifications(String[] qualifications) {
		this.qualifications = qualifications;
	}

	public String[] getBoards() {
		return boards;
	}

	public void setBoards(String[] boards) {
		this.boards = boards;
	}

	public String[] getPercentages() {
		return percentages;
	}

	public void setPercentages(String[] percentages) {
		this.percentages = percentages;
	}

	public String[] getPassingYears() {
		return passingYears;
	}

	public void setPassingYears(String[] passingYears) {
		this.passingYears = passingYears;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
