package com.businessruleengine;

public class BookPaymant implements BusinessProcess{

	@Override
	public void processPayment() {
		System.out.println("Its the payment for a book, create a duplicate packing slip for the royalty department, generate a commission payment to the agent");
	}

	
	
}
