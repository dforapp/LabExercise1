package com.amdcos;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SavingsAccountTest {

	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {
		account = new SavingsAccount();
		
		//Partial mocking or spying
		accountSpy = spy(account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	//@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		//Stubbing - hard coding the response of getBalance method
		doReturn(5000.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//Code under Test i.e we are testing withdraw method                     
		double updateBalance = accountSpy.withdraw(1000.00);
		double expectedBalance = 4000.00;
		
		assertEquals(expectedBalance, updateBalance, 0.0001);
		
		//Check if getBalance method was invoked exactly 1 time within withdraw method
		verify(accountSpy, times(1)).getBalance();
		
		//Check if updateBalance method was invoked exactly 1 time within withdraw method
		verify(accountSpy, times(1)).updateBalanceIntoDB(anyDouble());
	}

	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		//Stubbing - hard coding the response of getBalance method
		doReturn(500.00).when(accountSpy).getBalance();
		
		//Stubbing - hard coding the response of updateBalanceIntoDB method
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//Code under Test i.e we are testing withdraw method                     
		try{
			accountSpy.withdraw(10000.00);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		
		boolean expectedResponse = true;
		//We are expecting InsufficientBalanceException  thrown here if not
		//the test case result will be marked as failed
		assertEquals(expectedResponse, exceptionThrown);
		//Check if getBalance method was invoked exactly 1 time within withdraw method
		verify(accountSpy, times(1)).getBalance();
		
		//Check if updateBalance method was never invoked within withdraw method
		verify(accountSpy, times(0)).updateBalanceIntoDB(anyDouble());
	}
}
