package com.gmail.yuomelyanchuk;

import java.util.Arrays;

public class Network {
	private double[] numbersList = new double[0];

	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean registrationPhoneOnNetwork(double number){
		boolean successReg =false;
		for (double d : numbersList) {
			if(d==number){
				return(successReg);
			}
		}
		numbersList=Arrays.copyOf(numbersList, numbersList.length+1);
		numbersList[numbersList.length-1]=number;	
		successReg=true;
		return(successReg);
	}
	public boolean isPhoneExists(double number){
		for (double d : numbersList) {
			if(d==number){
				return(true);
			}
		}
		return(false);
	}


	

}
