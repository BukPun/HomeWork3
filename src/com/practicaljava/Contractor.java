package com.practicaljava;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
	
	}

	@Override
	public boolean increasePay(int percent) {
		if (percent <= Payable.INCREASE_CAP){
			System.out.println("Increasing salary by " + percent + "%. "+ getName());
			
		}else {
			System.out.println("Sorry, can’t increase hourly rate by more than " + percent + "%. "+ getName());
		}
		return true;
	}

}
