package com.hospital;

public class Patient {
	private int patientId;
	private String patientName;
	private int age;
	private String gender;
	private String disease;

	public Patient() {
		
	}

	public Patient(int patientId, String patientName, int age, String gender, String disease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.disease = disease;

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void display() {
		System.out.println("-------Patient Details-------");
		System.out.println("Patient id " + patientId);
		System.out.println("Patient name " + patientName);
		System.out.println("Age " + age);
		System.out.println("Gender " + gender);
		System.out.println("Disease details " + disease);
	}

}
