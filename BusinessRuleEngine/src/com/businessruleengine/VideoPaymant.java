package com.businessruleengine;

public class VideoPaymant implements BusinessProcess{

	@Override
	public void processPayment() {
		System.out.println("Its the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip");
	}

}
