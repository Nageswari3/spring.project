package com.abc.mobile.wallet.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.entity.UserDetails;
import com.abc.mobile.wallet.exceptions.InsufficientFundException;
import com.abc.mobile.wallet.exceptions.InvalidWalletAccountNumberException;
import com.abc.mobile.wallet.exceptions.InvalidUserException;
import com.abc.mobile.wallet.repository.WalletAccountRepository;

@Service
public class WalletAccountServiceImpl implements WalletAccountService {


	
	@Autowired
	WalletAccountRepository accountRepository;
	
	@Override
	public String login(String username, String password)throws InvalidUserException
	{
		
		String role = accountRepository.verifyUser(username, password);
		return role;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserDetails(String username, UserDetails newUserDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getBalance(int accountNumber) throws InvalidWalletAccountNumberException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int depositAmount(int accountNumber, int balance) throws InvalidWalletAccountNumberException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doFundTransfer(int accountNumber, int transferTo, int amount)
			throws InvalidWalletAccountNumberException, InsufficientFundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WalletTransaction> getTransactionBasedOnAccountNumber(int accountNumber)
			throws InvalidWalletAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WalletTransaction> getTransactionBasedOnAccountNumber(int accountNumber, LocalDate d1, LocalDate d2)
			throws InvalidWalletAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WalletAccount> getAllAccounts() {
		
		return accountRepository.findAll();
	}

	@Override
	public boolean insertAccount(WalletAccount a) {
		WalletAccount savedObject = accountRepository.save(a);
		
		return savedObject!=null?true:false;
	}

	@Override
	public WalletAccount getAccount(int accountNumber)throws InvalidWalletAccountNumberException 
	{
		try {
			System.out.println(" ------->> 1 before findById call");
			WalletAccount returnedAccount =  accountRepository.findById(accountNumber).get();
			System.out.println("----->> 2 Inside ServiceIMPL class getAccountById returned Account is "+returnedAccount);
			return returnedAccount;
		} 
		catch (java.util.NoSuchElementException e) {
			System.out.println("---->>2 inside CATCH block of ServiceImpl class ");
			throw new InvalidWalletAccountNumberException(accountNumber, e.getMessage());
		}
		
	}

	@Override
	public List<WalletAccount> getAllAccountsByTransactionDatewise() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
























