package org.mma.training.java;

public class Student {


	//1-Declaring Variables

	private int id;
	private String firstName;
	private String lastName;
	private String major;
	private String year;


	//2-no-arg Constructor

	public Student() {


	}
	//3-Field constructor


	public Student(int id, String firstName, String lastName, String major, String year) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.year = year;
	}
	//4-Creating Getters and Setters


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}

	// 4-ToString
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", major=" + major
				+ ", year=" + year + "]";
	}


















}
