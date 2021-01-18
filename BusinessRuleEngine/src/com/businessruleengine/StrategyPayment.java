package com.businessruleengine;

public class StrategyPayment {
	
	private BusinessProcess businessProcess;

	public StrategyPayment(BusinessProcess businessProcess) {
		super();
		this.businessProcess = businessProcess;
	}
	
	public void strategyPaymentProcess() {
		this.businessProcess.processPayment();
	}

}
