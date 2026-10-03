package com.hospital;

public class Bill {
	private int billId;
	private int patientId;
	private double consultationFee;
	private double medicineFee;
	private double roomFee;
	private double totalBill;

	public Bill(int billId, int patientId, double consultationFee, double medicineFee, double roomFee) {
		this.billId = billId;
		this.patientId = patientId;
		this.consultationFee = consultationFee;
		this.medicineFee = medicineFee;
		this.roomFee = roomFee;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public double getMedicineFee() {
		return medicineFee;
	}

	public void setMedicineFee(double medicineFee) {
		this.medicineFee = medicineFee;
	}

	public double getRoomFee() {
		return roomFee;
	}

	public void setRoomFee(double roomFee) {
		this.roomFee = roomFee;
	}

	public void totalBill() {
		totalBill = consultationFee + medicineFee + roomFee;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void display() {
		System.out.println("Bill Details");
		System.out.println("Bill id " + billId);
		System.out.println("Patient id " + patientId);
		System.out.println("Total Bill " + totalBill);
	}

}
