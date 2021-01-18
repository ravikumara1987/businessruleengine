package com.businessruleengine;

public class PhysicalProductPayment implements BusinessProcess{

	@Override
	public void processPayment() {
		System.out.println("Its Physical Product Payment generate a packing slip for shipping");
	}
	
}
