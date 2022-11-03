package com.wallet.app.service;

import com.wallet.app.dao.WalletDao;
import com.wallet.app.dao.WalletDaoImpl;
import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;

public class WalletServiceImpl implements WalletService {

	private WalletDao walletRepository = new WalletDaoImpl();
	
	
	public Wallet registerWallet(Wallet newWallet) throws WalletException {
		
		return this.walletRepository.addWallet(newWallet);
		
	}

	public Boolean login(Integer walletId, String password) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Double addFundsToWallet(Integer walletId, Double amount) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Double showWalletBalance(Integer walletId) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean fundTransfer(Integer fromId, Integer toId, Double amount) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Wallet unRegisterWallet(Integer walletId, String password) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

}
