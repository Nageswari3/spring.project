package com.abc.mobile.wallet.dto;

public class WalletAccountResponseDTOClient {
	
	
	private int accountNumber;
	private String username;
	private int balance;
	private String Name;
	private long phoneNumber;
	public WalletAccountResponseDTOClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WalletAccountResponseDTOClient(int accountNumber, String username, int balance, String firstName, String lastName,
			String panCard, long phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.balance = balance;
		this.Name = Name;
	
		this.phoneNumber = phoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + balance;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
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
		WalletAccountResponseDTOClient other = (WalletAccountResponseDTOClient) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (balance != other.balance)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	

}