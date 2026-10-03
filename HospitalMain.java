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
					sc.nextLine();
					System.out.println("Enter Patient name ");
					String s = sc.nextLine();
					System.out.println("Enter age");
					int a = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter gender");
					String g = sc.nextLine();
					System.out.println("Enter disease");
					String d = sc.nextLine();
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
					System.out.println("Enter specialization ");
					String specil = sc.nextLine();
					System.out.println("Enter experience");
					int e = sc.nextInt();
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
					System.out.println("Enter doctor id ");
					int dId = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter day ");
					String day = sc.nextLine();
					System.out.println("Enter date ");
					int date = sc.nextInt();
					h.addAppointment(new Appointment(id, pId, dId, day, date));
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
					System.out.println("Enter patient id");
					int pid = sc.nextInt();
					System.out.println("Enter consultation fee");
					double cFee = sc.nextDouble();
					System.out.println("Enter medicine fee");
					double mFee = sc.nextDouble();
					System.out.println("Enter room fee");
					double rFee = sc.nextDouble();
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
					sc.nextLine();
					System.out.println("Enter name of medicine");
					String mName = sc.nextLine();
					System.out.println("Enter price ");
					double p = sc.nextDouble();
					System.out.println("Enter quantity");
					int q = sc.nextInt();
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
					sc.nextLine();
					System.out.println("Enter room type");
					String rType = sc.nextLine();
					System.out.println("Price per day");
					double d = sc.nextDouble();
					System.out.println("Is occupied ??");
					boolean isOccupied = sc.nextBoolean();
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