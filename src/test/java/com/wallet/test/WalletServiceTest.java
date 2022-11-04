package com.wallet.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;
import com.wallet.app.service.WalletService;
import com.wallet.app.service.WalletServiceImpl;

public class WalletServiceTest {

	WalletService walletService = new WalletServiceImpl();
	
	@BeforeAll
	public static void setupTestData() {
		System.out.println("Create all test data");
	}
	@Test
	public void registerWalletTest() {
		
		
		try {
			Wallet wallet =walletService.registerWallet(new Wallet(100, "test name1", 1000.0, "123"));
			assertNotNull(wallet);
			assertEquals(100, wallet.getId());
			
		} catch (WalletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void showWalletBalanceTest() {
		
		try {
			Wallet wallet =walletService.registerWallet(new Wallet(100, "test name1", 1000.0, "123"));
			
			assertEquals(1000.0, walletService.showWalletBalance(100));
		} catch (WalletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void showWalletBalanceExceptionTest() {
		try {
			Wallet wallet =walletService.registerWallet(new Wallet(100, "test name1", 1000.0, "123"));
			assertThrows(WalletException.class,()-> walletService.showWalletBalance(200));
		} catch (WalletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	
	@AfterAll
	public static void destroyTestData() {
		System.out.println("Clear all test data");
	}
}
