package com.abc.mobile.wallet.dto;

public class WalletAccountResponseDTOAdmin {
	
	private int accountNumber;
	private int balance;
	private String Name;
	private long phoneNumber;
	/*private boolean kycStatus;*/
	public WalletAccountResponseDTOAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WalletAccountResponseDTOAdmin(int accountNumber, int balance, String firstName, String lastName, long phoneNumber,
			boolean kycStatus) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		this.phoneNumber = phoneNumber;
		/*this.kycStatus = kycStatus;*/
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/*public boolean isKycStatus() {
		return kycStatus;
	}
	public void setKycStatus(boolean kycStatus) {
		this.kycStatus = kycStatus;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + balance;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		/*result = prime * result + (kycStatus ? 1231 : 1237);*/
		
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
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
		WalletAccountResponseDTOAdmin other = (WalletAccountResponseDTOAdmin) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (balance != other.balance)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		/*if (kycStatus != other.kycStatus)
			return false;*/

		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	
	

}