package com.hospital;

public class Appointment {

	private int appointmentId;
	private int patientId;
	private int doctorId;
	private String day;
	private int date;
	private int month;
	private int year;

	public Appointment() {
	}

	public Appointment(int appointmentId, int patientId, int doctorId, String day, int date, int month, int year) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.day = day;
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void display() {
		System.out.println("Appointment Details ");
		System.out.println("Appointment id " + appointmentId);
		System.out.println("Patient id " + patientId);
		System.out.println("Doctor id " + doctorId);
		System.out.println("Date " + date);
		System.out.println("Day " + day);
	}

}
