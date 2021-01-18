package com.businessruleengine;

public class UpgradeMemerShipPayment implements BusinessProcess {

	@Override
	public void processPayment() {
		System.out.println("Its the payment for an upgrade to a membership, apply the upgrade, e-mail the owner and inform them of the upgrade");
	}

}
