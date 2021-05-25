package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.ncu.Validation.Password;

//import java.sql.Date;

//import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	@NotNull(message="can't be empty!")
	private String username;
	
	@NotNull(message="can't be empty!")
	private String useremail;
	
	@Password
	private String pswd;
	
	@NotNull(message="can't be empty!")
	private String gender;
	
	@Size(min=10, message="enter 10-digit phone number!")
	private String phno;
	
	@NotNull(message="can't be empty!")
	private String country;
	
	@NotNull(message="can't be empty!")
	private String state;
	
	@NotNull(message="can't be empty!")
	private String add;
	
	@NotNull(message="can't be empty!")
	private String institution;
	
	@NotNull(message="can't be empty!")
	private String [] skills;
	
	@NotNull(message="can't be empty!")
	private String  course;
	
	@NotNull(message="can't be empty!")
	private String dob;
	
	@NotNull(message="can't be empty!")
	private int age;
	
	
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
