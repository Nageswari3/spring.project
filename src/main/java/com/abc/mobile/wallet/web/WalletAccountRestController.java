package com.abc.mobile.wallet.web;


import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.catalina.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mobile.wallet.dto.WalletAccountResponseDTOAdmin;
import com.abc.mobile.wallet.dto.WalletAccountResponseDTOClient;
import com.abc.mobile.wallet.dto.LoginDTO;
import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.exceptions.InvalidWalletAccountNumberException;
import com.abc.mobile.wallet.exceptions.InvalidUserException;
import com.abc.mobile.wallet.service.WalletAccountService;
import com.abc.mobile.wallet.util.WalletAccountToWalletAccountDTOConvertion;
import com.abc.mobile.wallet.validation.WalletValidateEntry;

@RestController
@RequestMapping("/mobile")
public class WalletAccountRestController {

	@Autowired
	WalletAccountService accountService;
	
	
	@PostMapping("/login")
	public boolean doLogin(@RequestBody LoginDTO loginObj)throws InvalidUserException
	{
		String username = loginObj.getUsername();
		String password = loginObj.getPassword();
		
		if(WalletValidateEntry.validateNull(username) && WalletValidateEntry.validateNull(password))
		{
			String role = accountService.login(username, password);
			// some code for session handling 
			
			return true;
			
		}
		else
		{
			throw new InvalidUserException("","");
		}
	
	}
	
	@GetMapping("/admin/accounts")
	public List<WalletAccount> doThis()
	{
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/client/account/{accountNumber}")
	public ResponseEntity<WalletAccountResponseDTOClient> getAcountForClientbasedOnId(@PathVariable int accountNumber)
	 throws InvalidWalletAccountNumberException
	{
		WalletAccountResponseDTOClient dtoObj = new WalletAccountResponseDTOClient();//empty object
		
		WalletAccount fetchedAccount = accountService.getAccount(accountNumber);
			
		if(fetchedAccount != null)
		{
		  dtoObj = WalletAccountToWalletAccountDTOConvertion.doDTOCLientConvertion(fetchedAccount);
		}
		return new ResponseEntity<WalletAccountResponseDTOClient>(dtoObj,HttpStatus.OK);
		
		
	}
	
	
	@GetMapping("/admin/account/{accountNumber}")
	public ResponseEntity<WalletAccountResponseDTOAdmin> getAcountForAdminbasedOnId(@PathVariable int accountNumber)
		throws InvalidWalletAccountNumberException
	{
		WalletAccount fetchedAccount = accountService.getAccount(accountNumber);
		System.out.println("2 ------>> inside Rest Controller feched Account "+fetchedAccount);
		WalletAccountResponseDTOAdmin dtoObj = new WalletAccountResponseDTOAdmin();//empty object
		if(fetchedAccount != null)
		{
		  dtoObj = WalletAccountToWalletAccountDTOConvertion.doDTOAdminConvertion(fetchedAccount);
		}
		return new ResponseEntity<WalletAccountResponseDTOAdmin>(dtoObj,HttpStatus.OK);
	}
	
	
	@PostMapping("/admin/account") //post :-  localhost:8080/bank/account
	public String savedAccountFromWeb(@RequestBody WalletAccount a)
	{
		boolean status = accountService.insertAccount(a);
	
		return status == true?"Account Saved ":"Contact to customer Care";
	}
	
	 
	
}