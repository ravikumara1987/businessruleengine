package com.businessruleengine;

public class BusinessRuleEngineDemo {

	public static void main(String[] args) {
		
		
		BusinessProcess businessProcess=new PhysicalProductPayment();
		StrategyPayment strategyPayment=new StrategyPayment(businessProcess); 		
		strategyPayment.strategyPaymentProcess();
		
		businessProcess=new BookPaymant();		
		strategyPayment=new StrategyPayment(businessProcess); 
		strategyPayment.strategyPaymentProcess();
		
		businessProcess=new MembershipPayment();		
		strategyPayment=new StrategyPayment(businessProcess); 
		strategyPayment.strategyPaymentProcess();

		businessProcess=new UpgradeMemerShipPayment();		
		strategyPayment=new StrategyPayment(businessProcess); 
		strategyPayment.strategyPaymentProcess();
		
		businessProcess=new VideoPaymant();		
		strategyPayment=new StrategyPayment(businessProcess); 
		strategyPayment.strategyPaymentProcess();
		
	}

}
