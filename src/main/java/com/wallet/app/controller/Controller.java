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
		} catch (WalletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
