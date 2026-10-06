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

		if (patientExists((patient.getPatientId()))) {
			System.out.println("Patient already exist");
		} else {
			boolean pAdded = false;
			for (int i = 0; i < patients.length; i++) {

				if (patients[i] == null) {
					patients[i] = patient;
					System.out.println("Entry done");
					pAdded = true;
					break;
				}

			}
			if (!pAdded) {
				System.out.println("Patients are full");
			}
		}

	}

	public void displayPatients() {
		for (Patient p : patients) {
			if (p != null)
				p.display();

		}

	}

	public boolean patientExists(int id) {
		for (Patient p : patients) {
			if (p != null && p.getPatientId() == id) {
				return true;
			}
		}
		return false;
	}

	public void searchPatient(int id) {
		boolean found = false;
		for (Patient p : patients) {
			if (p != null && p.getPatientId() == id) {
				p.display();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Patient not found");
		}

	}

	public void addDoctor(Doctor doctor) {
		if (doctorExists((doctor.getDoctorId()))) {

			System.out.println("Doctor already exist");
		} else {
			boolean dAdded = false;
			for (int i = 0; i < doctors.length; i++) {
				if (doctors[i] == null) {
					doctors[i] = doctor;
					System.out.println("Entry done");
					dAdded = true;
					break;
				}

			}
			if (!dAdded) {
				System.out.println("Doctors are full");
			}
		}

	}

	public void displayDoctors() {
		for (Doctor d : doctors) {
			if (d != null)
				d.display();
		}
	}

	public boolean doctorExists(int id) {
		for (Doctor d : doctors) {
			if (d != null && d.getDoctorId() == id) {
				return true;
			}
		}
		return false;
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
		if (billExists((bill.getBillId()))) {

			System.out.println("Bill already exist");
		} else {
			boolean bAdded = false;
			for (int i = 0; i < bills.length; i++) {
				if (bills[i] == null) {
					bills[i] = bill;
					System.out.println("Entry done");
					bAdded = true;
					break;
				}
			}
			if (!bAdded) {
				System.out.println("Bills are full");
			}
		}
	}

	public void displayBill() {
		for (Bill b : bills) {
			if (b != null)
				b.display();
		}
	}

	public boolean billExists(int id) {
		for (Bill b : bills) {
			if (b != null && b.getBillId() == id) {
				return true;
			}
		}
		return false;
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

	public boolean medicineExists(int id) {

		for (Medicine m : medicines) {

			if (m != null && m.getMedicineId() == id) {
				return true;
			}
		}

		return false;
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

	public boolean roomExists(int rno) {

		for (Room r : rooms) {
			if (r != null && r.getRoomNo() == rno) {
				return true;
			}
		}
		return false;
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
		if (appointmentExists((appointment.getAppointmentId()))) {
			System.out.println("Appointment already exist");
		} else {
			boolean aAdded = false;
			for (int i = 0; i < appointments.length; i++) {
				if (appointments[i] == null) {
					appointments[i] = appointment;
					System.out.println("Entry done");
					aAdded = true;
					break;
				}
			}

			if (!aAdded) {
				System.out.println("Patients are full");
			}
		}
	}

	public void displayAppointments() {
		for (Appointment a : appointments) {
			if (a != null)
				a.display();
		}
	}

	public boolean appointmentExists(int id) {
		for (Appointment a : appointments) {
			if (a != null && a.getAppointmentId() == id) {
				return true;
			}
		}
		return false;
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
