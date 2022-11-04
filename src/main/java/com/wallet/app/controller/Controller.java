package com.wallet.app.controller;

import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;
import com.wallet.app.service.WalletService;
import com.wallet.app.service.WalletServiceImpl;

public class Controller {

	public static void main(String[] args) {

		WalletService walletService = new WalletServiceImpl();

		try {
			Wallet wallet = walletService.registerWallet(new Wallet(1, "Ford", 1000.0, "123"));
			System.out.println(wallet);

			System.out.println("Wallet id 1, balance=" + walletService.showWalletBalance(1));
			// System.out.println("Wallet id 2,
			// balance="+walletService.showWalletBalance(2));
			Wallet wallet2 = walletService.registerWallet(new Wallet(2, "Ford 2", 2000.0, "123"));
			System.out.println("Wallet 2:" + wallet2);
			if (walletService.fundTransfer(1, 2, 250.0) == true)
				System.out.println("Fund transfer successful.");
			System.out.println("W1:" + wallet);
			System.out.println("W2:" + wallet2);
			walletService.fundTransfer(1, 2, 750.0);
			System.out.println("W1:" + wallet);
			System.out.println("W2:" + wallet2);
			
			Wallet deletedWallet = walletService.unRegisterWallet(1, "123");
			System.out.println("Succefully unregistered your wallet:" + deletedWallet);
			System.out.println("Wallet id 1, balance=" + walletService.showWalletBalance(1));

		} catch (WalletException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
