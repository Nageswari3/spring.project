package com.abc.mobile.wallet.repository;


import com.abc.mobile.wallet.exceptions.InvalidUserException;

public interface CustomAccountRepository {
	
	public String verifyUser(String username,String password)throws InvalidUserException;

}
