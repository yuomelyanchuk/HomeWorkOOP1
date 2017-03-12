package com.gmail.yuomelyanchuk;


public class Phone {
	private String model;
	private double number;
	private boolean isRegisteredOnNetwork = false;
	private Network workingNetwork;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String model, double number) {
		super();
		this.model = model;
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public void registerInNetwork(Network net) {
		isRegisteredOnNetwork = net.registrationPhoneOnNetwork(this.number);
		if (isRegisteredOnNetwork) {
			System.out.println("registration completed successfully");
			workingNetwork=net;
		} else {
			System.out.println("not registered");
		}
	}

	
	public void makeCall(double number) {
		boolean otherPhone = false;
		if (isRegisteredOnNetwork) {
			otherPhone = workingNetwork.isPhoneExists(number);
		}
		if (otherPhone) {
			System.out.println("bla bla bla");
		} else {
			System.out.println("number not exists or Phone not registered in network");
		}

	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", number=" + number + ", isRegisteredOnNetwork=" + isRegisteredOnNetwork
				+ ", workingNetwork=" + workingNetwork + "]";
	}

}
