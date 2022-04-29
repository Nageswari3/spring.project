package com.abc.mobile.wallet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class WalletAccount implements Comparable<WalletAccount>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int walletAccountNumber;
	private String username;
	private String password;
	private String role;
	private int balance;
	private final int MIN_BALANCE = 10000;
	
	
	@Embedded
	@Column(nullable = true)
	private UserDetails userDeatils;

	public WalletAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(WalletAccount acc) {
		
		return walletAccountNumber - acc.walletAccountNumber;
	}

	public int getAccountNumber() {
		return walletAccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.walletAccountNumber = accountNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public UserDetails getUserDeatils() {
		return userDeatils;
	}

	public void setUserDeatils(UserDetails userDeatils) {
		this.userDeatils = userDeatils;
	}

	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MIN_BALANCE;
		result = prime * result + walletAccountNumber;
		result = prime * result + balance;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((userDeatils == null) ? 0 : userDeatils.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletAccount other = (WalletAccount) obj;
		if (MIN_BALANCE != other.MIN_BALANCE)
			return false;
		if (walletAccountNumber != other.walletAccountNumber)
			return false;
		if (balance != other.balance)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userDeatils == null) {
			if (other.userDeatils != null)
				return false;
		} else if (!userDeatils.equals(other.userDeatils))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	
	
}