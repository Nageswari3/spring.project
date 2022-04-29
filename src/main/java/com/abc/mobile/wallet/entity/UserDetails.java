package com.abc.mobile.wallet.entity;

import javax.persistence.Embeddable;

@Embeddable
public class UserDetails {
	private String Name;
	private long mobileNumber;
	/*private Boolean is_kyc_done;*/
	private String email;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String houseAddress, String city, long mobileNumber, String email) {
		super();
		this.Name = name;
		/*this.is_kyc_done=is_kyc_done;*/
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	/*public Boolean getIs_kyc_done() {
        return is_kyc_done;
    }

    public void setIs_kyc_done(Boolean is_kyc_done) {
        this.is_kyc_done = is_kyc_done;
    }*/
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}