package com.businessruleengine;

public class MembershipPayment implements BusinessProcess{

	@Override
	public void processPayment() {
		System.out.println("Its the payment for a membership, activate that membership, e-mail the owner and inform them of the activation");
	}
		

}
