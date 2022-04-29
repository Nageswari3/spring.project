package com.abc.mobile.wallet.service;



import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.exceptions.InvalidWalletAccountNumberException;

@Service
public interface WalletTransactionService {

	public List<WalletTransaction> getAllTransactions();

	List<WalletTransaction> getAllWalletTransactions();

	public List<WalletAccount> getAllAccountsByTransactionDatewise();
		
		
}
