package com.hospital;

public class Room {
	private int roomNo;
	private String roomType;
	private double pricePerDay;
	private boolean isOccupied;
	private double totalPrice;

	public Room(int roomNo, String roomType, double pricePerDay, boolean isOccupied) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.pricePerDay = pricePerDay;
		this.isOccupied = isOccupied;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setIsOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public boolean getIsOccupied() {
		return isOccupied;
	}

	public void totalPrice(int days) {
		if (isOccupied) {
			System.out.println("Room not avilable");
		} else {
			totalPrice = days * pricePerDay;
		}
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void display() {

		System.out.println("Room details ");
		System.out.println("Room no " + roomNo);
		System.out.println("Total Rent " + totalPrice);
	}
}
