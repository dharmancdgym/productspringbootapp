package com.microservice.model;

public class Microservice {
	private Integer userId;
	private String name;

	public java.lang.String getEmailId() {
		return emailId;
	}

	public void setEmailId(java.lang.String emailId) {
		this.emailId = emailId;
	}

	public java.lang.Integer getUserId() {
		return userId;
	}

	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(java.lang.String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public java.lang.String getAddres() {
		return addres;
	}

	public void setAddres(java.lang.String addres) {
		this.addres = addres;
	}

	public java.lang.String getNationality() {
		return nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public java.lang.String getGender() {
		return gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public java.lang.String getAge() {
		return age;
	}

	public void setAge(java.lang.String age) {
		this.age = age;
	}

	private String emailId;
	private String phoneNumber;
	private String addres;
	private String nationality;
	private String gender;
	private String age;

	@java.lang.Override
	public java.lang.String toString() {
		return "Microservice{" +
				"name='" + name + '\'' +
				", userId=" + userId +
				", name='" + name + '\'' +
				", emailId='" + emailId + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", addres='" + addres + '\'' +
				", nationality='" + nationality + '\'' +
				", gender='" + gender + '\'' +
				", age='" + age + '\'' +
				'}';
	}





}
