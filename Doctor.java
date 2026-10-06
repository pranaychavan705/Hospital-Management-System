package com.hospital;

public class Doctor {
	private int doctorId;
	private String name;
	private String specialization;
	private float experience;

	public Doctor() {
		
	}

	public Doctor(int doctorId, String name, String specialization, float experience) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
		this.experience = experience;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public void display() {
		System.out.println("Doctor Profile");
		System.out.println("Doctor id " + doctorId);
		System.out.println("Doctor name " + name);
		System.out.println("Specialization " + specialization);
		System.out.println("Experience " + experience);

	}
}
