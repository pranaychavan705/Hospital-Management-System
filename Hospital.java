package com.hospital;

public class Hospital {
	/*
	 * addPatient() displayPatients() searchPatient() addDoctor() displayDoctors()
	 */

	private Patient[] patients;
	private Doctor[] doctors;
	private Appointment[] appointments;
	private Bill[] bills;
	private Medicine[] medicines;
	private Room[] rooms;

	public Hospital() {

		patients = new Patient[100];
		doctors = new Doctor[50];
		appointments = new Appointment[100];
		bills = new Bill[100];
		medicines = new Medicine[100];
		rooms = new Room[20];

	}

	public void addPatient(Patient patient) {

		for (int i = 0; i < patients.length; i++) {
			if (patients[i] == null) {
				patients[i] = patient;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayPatients() {
		for (Patient p : patients) {
			if (p != null)
				p.display();
		}

	}

	public void searchPatient(int id) {
		boolean found = false;
		for (Patient p : patients) {
			if (p != null && p.getPatientId() == id) {
				found = true;
				p.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Patient not found");
		}
	}

	public void addDoctor(Doctor doctor) {
		for (int i = 0; i < doctors.length; i++) {
			if (doctors[i] == null) {
				doctors[i] = doctor;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayDoctors() {
		for (Doctor d : doctors) {
			if (d != null)
				d.display();
		}
	}

	public void searchDoctor(int id) {
		boolean found = false;
		for (Doctor d : doctors) {
			if (d != null && d.getDoctorId() == id) {
				found = true;
				d.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Doctor not found");
		}
	}

	public void addBills(Bill bill) {
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == null) {
				bills[i] = bill;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayBill() {
		for (Bill b : bills) {
			if (b != null)
				b.display();
		}
	}

	public void searchBill(int id) {
		boolean found = false;
		for (Bill b : bills) {
			if (b != null && b.getBillId() == id) {
				found = true;
				b.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Bills not found");
		}
	}
	
	

	public void addMedicines(Medicine medicine) {
		for (int i = 0; i < medicines.length; i++) {
			if (medicines[i] == null) {
				medicines[i] = medicine;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayMedicines() {
		for (Medicine m : medicines) {
			if (m != null)
				m.display();
		}
	}

	public void searchMedicine(int id) {
		boolean found = false;
		for (Medicine m : medicines) {
			if (m != null && m.getMedicineId() == id) {
				found = true;
				m.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Medicines not found");
		}
	}

	public void addRooms(Room room) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				rooms[i] = room;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayRooms() {
		for (Room r : rooms) {
			if (r != null)
				r.display();
		}
	}

	public void searchRoom(int id) {
		boolean found = false;
		for (Room r : rooms) {
			if (r != null && r.getRoomNo() == id) {
				found = true;
				r.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Room not found");
		}
	}

	public void addAppointment(Appointment appointment) {
		for (int i = 0; i < appointments.length; i++) {
			if (appointments[i] == null) {
				appointments[i] = appointment;
				System.out.println("Entry done");
				break;
			}
		}
	}

	public void displayAppointments() {
		for (Appointment a : appointments) {
			if (a != null)
				a.display();
		}
	}

	public void searchAppointments(int id) {
		boolean found = false;
		for (Appointment a : appointments) {
			if (a != null && a.getAppointmentId() == id) {
				found = true;
				a.display();
				break;
			}
		}
		if (!found) {
			System.out.println("Appointments not found");
		}
	}

}
