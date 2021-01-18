package com.test.businessruleengine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.businessruleengine.BookPaymant;
import com.businessruleengine.BusinessProcess;
import com.businessruleengine.MembershipPayment;
import com.businessruleengine.PhysicalProductPayment;
import com.businessruleengine.StrategyPayment;
import com.businessruleengine.UpgradeMemerShipPayment;
import com.businessruleengine.VideoPaymant;

public class BusinessRulesEngineTest {
	
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void initialize() {
        originalSystemOut = System.out;
        // given
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }
	
	@Test
	public void testBookProcessPayment() {
		

		BusinessProcess bookPaymant=new BookPaymant(); 
		StrategyPayment strategyPayment = new StrategyPayment(bookPaymant);		
		strategyPayment.strategyPaymentProcess();
		
		assertEquals(systemOutContent.toString(),
				"Its the payment for a book, create a duplicate packing slip for the royalty department, generate a commission payment to the agent\r\n" + 
				"");
		
	}
	
	@Test
	public void testPhysicalProcessPayment() {
		

		BusinessProcess bookPaymant=new PhysicalProductPayment(); 
		StrategyPayment strategyPayment = new StrategyPayment(bookPaymant);		
		strategyPayment.strategyPaymentProcess();
		
		assertEquals(systemOutContent.toString(),
				"Its Physical Product Payment generate a packing slip for shipping, generate a commission payment to the agent\r\n" + 
				"");
		
	}
	
	@Test
	public void testMembershipProcessPayment() {
		

		BusinessProcess bookPaymant=new MembershipPayment(); 
		StrategyPayment strategyPayment = new StrategyPayment(bookPaymant);		
		strategyPayment.strategyPaymentProcess();
		
		assertEquals(systemOutContent.toString(),"Its the payment for a membership, activate that membership, e-mail the owner and inform them of the activation\r\n" + "");
		
	}

	@Test
	public void testVideoProcessPayment() {
		

		BusinessProcess bookPaymant=new VideoPaymant(); 
		StrategyPayment strategyPayment = new StrategyPayment(bookPaymant);		
		strategyPayment.strategyPaymentProcess();
		
		assertEquals(systemOutContent.toString(),"Its the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip\r\n" + 
				"");
		
	}
	

	@Test
	public void testUpgradeMemebrShipProcessPayment() {
		

		BusinessProcess bookPaymant=new UpgradeMemerShipPayment(); 
		StrategyPayment strategyPayment = new StrategyPayment(bookPaymant);		
		strategyPayment.strategyPaymentProcess();
		
		assertEquals(systemOutContent.toString(),"Its the payment for an upgrade to a membership, apply the upgrade, e-mail the owner and inform them of the upgrade\r\n" + 
				"");
		
	}	
	
}
