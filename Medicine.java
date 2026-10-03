package com.hospital;

public class Medicine {
	private int medicineId;
	private String name;
	private double price;
	private int quantity;
	private double tprice;

	public Medicine(int medicineId, String name, double price, int quantity) {
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void tprice() {
		tprice = price * quantity;
	}

	public double getTprice() {
		return tprice;
	}

	public void display() {
		System.out.println("Medicine Details ");
		System.out.println("Medicine id " + medicineId);
		System.out.println("Medicine  name " + name);
		System.out.println("Total price " + tprice);
	}

}
