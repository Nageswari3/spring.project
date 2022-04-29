package com.abc.mobile.wallet.util;


import com.abc.mobile.wallet.dto.WalletAccountResponseDTOAdmin;
import com.abc.mobile.wallet.dto.WalletAccountResponseDTOClient;
import com.abc.mobile.wallet.entity.WalletAccount;

// create all static method
public class WalletAccountToWalletAccountDTOConvertion {

	public static WalletAccountResponseDTOClient doDTOCLientConvertion(WalletAccount a)
	{
		WalletAccountResponseDTOClient dtoForClient = new WalletAccountResponseDTOClient();
		
		dtoForClient.setAccountNumber(a.getAccountNumber());
		dtoForClient.setBalance(a.getBalance());
		
		dtoForClient.setUsername(a.getUsername());
		dtoForClient.setPhoneNumber(a.getUserDeatils().getMobileNumber());
		
		return dtoForClient;
	}
	
	public static WalletAccountResponseDTOAdmin doDTOAdminConvertion(WalletAccount a)
	{
		WalletAccountResponseDTOAdmin dtoForAdmin = new WalletAccountResponseDTOAdmin();
		
		dtoForAdmin.setAccountNumber(a.getAccountNumber());
		dtoForAdmin.setBalance(a.getBalance());
      	dtoForAdmin.setPhoneNumber(a.getUserDeatils().getMobileNumber());
		
		return dtoForAdmin;
	}
	
	
	
}