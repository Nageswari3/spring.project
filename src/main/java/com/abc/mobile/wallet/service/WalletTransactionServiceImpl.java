package com.abc.mobile.wallet.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abc.mobile.wallet.entity.AddBalanceDetails;
import com.abc.mobile.wallet.entity.Wallet;
import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.repository.WalletTransactionRepository;

@Service
public class WalletTransactionServiceImpl implements WalletTransactionService{

	@Autowired
	WalletTransactionRepository transactionRepository;
	
	
	@Override
	public List<WalletTransaction> getAllWalletTransactions() {
			return transactionRepository.findAll();
	}


	@Override
	public List<WalletTransaction> getAllTransactions() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*@Override
	@Transactional
	public List<WalletAccount> getAllAccountsByTransactionDatewise(){
		
		List<WalletAccount> accounts = getAllAccounts();
		Collections.sort(accounts, new AccountTransactionDatewise());
		return accounts;
		
	}*/


	private List<WalletAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<WalletAccount> getAllAccountsByTransactionDatewise() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}