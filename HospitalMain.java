package com.hospital;

import java.util.Scanner;

public class HospitalMain {
	public static void main(String[] args) {

		System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM!");
		Hospital h = new Hospital();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"Enter your choice  >>> 1)Patient 2)Doctor 3)Appointment 4)Bill 5)Medicine  6)Room  7)Exit ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println(
						"What operation you want to perform  1)Add patient  2)Display patient details 3)Search patient");
				int patientChoice = sc.nextInt();

				switch (patientChoice) {

				case 1:
					System.out.println("Enter patient id");
					int i = sc.nextInt();
					while (h.patientExists(i)) {
						System.out.println("Patient already exists enter another id");
						i = sc.nextInt();
					}
					sc.nextLine();
					System.out.println("Enter Patient name ");
					String s = sc.nextLine();
					while (s.trim().isEmpty()) {
						System.out.println("Enter correct name");
						s = sc.nextLine();
					}
					System.out.println("Enter age");
					int a = sc.nextInt();
					while (a <= 0) {
						System.out.println("Enter valid age");
						a = sc.nextInt();
					}
					sc.nextLine();
					System.out.println("Enter gender 1>Male 2>Female 3>Other ");
					String g = "";

					int cg = sc.nextInt();
					while (cg < 1 || cg > 3) {

						System.out.println("Enter valid choice");
						cg = sc.nextInt();

					}

					switch (cg) {
					case 1: {
						g = "Male";
						break;
					}
					case 2: {
						g = "Female";
						break;
					}
					case 3: {
						g = "Other";
						break;
					}

					}

					System.out.println("Enter disease");
					String d = sc.next();
					while (d.trim().isEmpty()) {
						System.out.println("Enter correct disease");
						d = sc.nextLine();
					}
					h.addPatient(new Patient(i, s, a, g, d));
					break;

				case 2:
					h.displayPatients();
					break;

				case 3:
					System.out.println("Enter patient id");
					int id = sc.nextInt();
					h.searchPatient(id);
					break;
				}
				break;
			}
			case 2: {
				System.out.println(
						"What operations you want to perform >> 1)Add doctor 2)Display doctor 3)Search doctor");
				int doctorChoice = sc.nextInt();

				switch (doctorChoice) {
				case 1: {
					System.out.println("Enter Doctor id");
					int i = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Doctor name ");
					String s = sc.nextLine();
					while (s.trim().isEmpty()) {
						System.out.println("Enter correct doctor name");
						s = sc.nextLine();
					}
					System.out.println("Enter specialization ");
					String specil = sc.nextLine();
					while (specil.trim().isEmpty()) {
						System.out.println("Enter correct specialization");
						specil = sc.nextLine();
					}
					System.out.println("Enter experience");
					float e = sc.nextFloat();
					while (e < 0) {
						System.out.println("Enter correct experience");
						e = sc.nextInt();
					}
					h.addDoctor(new Doctor(i, s, specil, e));
					break;
				}
				case 2: {
					h.displayDoctors();
					break;
				}
				case 3: {
					System.out.println("Enter doctor id");
					int id = sc.nextInt();
					h.searchDoctor(id);
					break;
				}

				}
				break;
			}

			case 3: {
				System.out.println(
						"What operation you want to  perform >> 1)Add appointment 2)Display appointment 3)Search appointment ");
				int appChoice = sc.nextInt();

				switch (appChoice) {
				case 1:
					System.out.println("Enter appointment id");
					int id = sc.nextInt();
					System.out.println("Enter patient id ");
					int pId = sc.nextInt();
					while (!h.patientExists(pId)) {
						System.out.println("Enter valid patient id");
						pId = sc.nextInt();
					}
					System.out.println("Enter doctor id ");
					int dId = sc.nextInt();
					while (!h.doctorExists(dId)) {
						System.out.println("Enter valid doctor id");
						dId = sc.nextInt();
					}
					sc.nextLine();
					System.out.println("Enter day ");
					String day = sc.nextLine();
					System.out.println("Enter year");
					int year = sc.nextInt();
					while (year < 2000) {
						System.out.println("Enter valid year");
						year = sc.nextInt();
					}
					System.out.println("Enter month");
					int month = sc.nextInt();

					while (month < 1 || month > 12) {
						System.out.println("Enter valid month");
						month = sc.nextInt();
					}
					int maxDays;

					if (month == 2) {
						if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
							maxDays = 29;
						} else {
							maxDays = 28;
						}
					} else if (month == 4 || month == 6 || month == 9 || month == 11) {
						maxDays = 30;
					} else {
						maxDays = 31;
					}
					System.out.println("Enter date ");
					int date = sc.nextInt();
					while (date < 1 || date > maxDays) {
						System.out.println("Enter valid date");
						date = sc.nextInt();
					}
					h.addAppointment(new Appointment(id, pId, dId, day, date, month, year));
					break;

				case 2:
					h.displayAppointments();
					break;

				case 3:
					System.out.println("Enter appointment id");
					int aid = sc.nextInt();
					h.searchAppointments(aid);
					break;
				}
				break;
			}

			case 4: {
				System.out.println("What operation you want to  perform >> 1)Add Bill   2)Display Bill 3)Search Bill");
				int billChoice = sc.nextInt();
				switch (billChoice) {
				case 1:
					System.out.println("Enter Bill id");
					int id = sc.nextInt();
					while (h.billExists(id)) {
						System.out.println("Bill ID already exists");
						id = sc.nextInt();
					}
					System.out.println("Enter patient id");
					int pid = sc.nextInt();
					while (!h.patientExists(pid)) {
						System.out.println("Enter correct patient id");
						pid = sc.nextInt();
					}
					System.out.println("Enter consultation fee");
					double cFee = sc.nextDouble();
					while (cFee < 0) {
						System.out.println("Enter correct amount");
						cFee = sc.nextDouble();
					}
					System.out.println("Enter medicine fee");
					double mFee = sc.nextDouble();
					while (mFee < 0) {
						System.out.println("Enter correct amount");
						mFee = sc.nextDouble();
					}
					System.out.println("Enter room fee");
					double rFee = sc.nextDouble();
					while (rFee < 0) {
						System.out.println("Enter correct amount");
						rFee = sc.nextDouble();
					}
					Bill b = new Bill(id, pid, cFee, mFee, rFee);
					b.totalBill();
					h.addBills(b);
					break;

				case 2:
					h.displayBill();
					break;
				case 3:
					System.out.println("Enter bill id ");
					int bid = sc.nextInt();
					h.searchBill(bid);
					break;

				}
				break;

			}

			case 5: {
				System.out.println(
						"What operations you want to perform 1)Add medicine 2)Display medicine 3)Search medicine");
				int mChoice = sc.nextInt();
				switch (mChoice) {
				case 1:
					System.out.println("Enter medicine id ");
					int mid = sc.nextInt();
					while (h.medicineExists(mid)) {
						System.out.println("Enter correct id");
						mid = sc.nextInt();
					}
					sc.nextLine();
					System.out.println("Enter name of medicine");
					String mName = sc.nextLine();
					while (mName.trim().isEmpty()) {
						System.out.println("Enter correct name");
						mName = sc.nextLine();
					}
					System.out.println("Enter price ");
					double p = sc.nextDouble();
					while (p <= 0) {
						System.out.println("Enter correct price");
						p = sc.nextDouble();
					}
					System.out.println("Enter quantity");
					int q = sc.nextInt();
					while (q <= 0) {
						System.out.println("Enter correct quantity");
						q = sc.nextInt();
					}
					Medicine m = new Medicine(mid, mName, p, q);
					h.addMedicines(m);
					m.tprice();
					System.out.println(m.getTprice());
					break;

				case 2:
					h.displayMedicines();
					break;
				case 3:
					System.out.println("Enter medicine id");
					int sid = sc.nextInt();
					h.searchMedicine(sid);
					break;
				}
				break;
			}

			case 6: {
				System.out.println("What operations you want to perform 1)Add room 2)Display room 3)Search room");
				int rChoice = sc.nextInt();
				switch (rChoice) {
				case 1:
					System.out.println("Enter room no");
					int rno = sc.nextInt();
					while (h.roomExists(rno)) {
						System.out.println("Enter valid room no");
						rno = sc.nextInt();
					}
					while (rno <= 0) {
						System.out.println("Enter valid room no");
						rno = sc.nextInt();
					}
					sc.nextLine();
					System.out.println("Enter room type 1) General 2). Semi-Private 3) Private");
					int rRoom = sc.nextInt();
					while (rRoom < 1 || rRoom > 3) {
						System.out.println("Enter correct choice");
						rRoom = sc.nextInt();
					}
					String rType = "";
					switch (rRoom) {
					case 1:
						rType = "General";
						break;
					case 2:
						rType = "Semi-Private";
						break;
					case 3:
						rType = "Private";
					}

					System.out.println("Price per day");
					double d = sc.nextDouble();
					while (d <= 0) {
						System.out.println("Enter correct price");
						d = sc.nextDouble();
					}
					System.out.println("Room status 1) Available 2) Occupied");

					int status = sc.nextInt();

					while (status < 1 || status > 2) {
						System.out.println("Enter correct choice");
						status = sc.nextInt();
					}

					boolean isOccupied = false;

					if (status == 2) {
						isOccupied = true;
					}
					Room r = new Room(rno, rType, d, isOccupied);
					h.addRooms(r);
					r.totalPrice(4);
					System.out.println(r.getTotalPrice());
					break;

				case 2:
					h.displayRooms();
					break;

				case 3:
					System.out.println("Enter room no");
					int roomNo = sc.nextInt();
					h.searchRoom(roomNo);
					break;

				}
				break;

			}
			case 7:
				System.out.println("Thank you");
				return;
			default: {
				System.out.println("Enter correct choice");
			}

			}
		}

	}
}