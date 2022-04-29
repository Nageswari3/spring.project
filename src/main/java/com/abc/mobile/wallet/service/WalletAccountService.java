package com.abc.mobile.wallet.service;



import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.entity.UserDetails;
import com.abc.mobile.wallet.exceptions.InsufficientFundException;
import com.abc.mobile.wallet.exceptions.InvalidWalletAccountNumberException;
import com.abc.mobile.wallet.exceptions.InvalidUserException;

@Service
public interface WalletAccountService {
	
	
	public String login(String username,String password) throws InvalidUserException;

	public boolean logout(String username);
	
	
	public boolean updateUserDetails(String username,UserDetails newUserDetails);
	
	
	public int getBalance(int accountNumber)throws InvalidWalletAccountNumberException;
	
	
	public int depositAmount(int accountNumber,int balance)throws InvalidWalletAccountNumberException;


	
	public int doFundTransfer(int accountNumber,int transferTo,int amount)throws InvalidWalletAccountNumberException,InsufficientFundException;

	
	public List<WalletTransaction> getTransactionBasedOnAccountNumber(int accountNumber)throws InvalidWalletAccountNumberException;
	public List<WalletTransaction> getTransactionBasedOnAccountNumber(int accountNumber,LocalDate d1,LocalDate d2)throws InvalidWalletAccountNumberException;
	public List<WalletAccount> getAllAccountsByTransactionDatewise();
		
		
	public List<WalletAccount> getAllAccounts();
	public boolean insertAccount(WalletAccount a);
	public WalletAccount getAccount(int accountNumber)throws InvalidWalletAccountNumberException;
	
	
	
}