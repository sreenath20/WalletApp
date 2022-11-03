package com.wallet.app.dao;

import java.util.HashMap;
import java.util.Map;

import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;

public class WalletDaoImpl implements WalletDao {

	// Create collection to store the Wallet information.
	Map<Integer, Wallet> wallets = new HashMap<>();

	public Wallet addWallet(Wallet newWallet) throws WalletException {

		 this.wallets.put(newWallet.getId(), newWallet);
		 return this.wallets.get(newWallet.getId());

	}

	public Wallet getWalletById(Integer walletId) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Wallet updateWallet(Wallet updateWallet) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	public Wallet deleteWalletById(Integer walletID) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

}
