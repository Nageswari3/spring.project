package com.abc.mobile.wallet.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mobile.wallet.entity.WalletAccount;
import com.abc.mobile.wallet.entity.WalletTransaction;
import com.abc.mobile.wallet.exceptions.InvalidWalletAccountNumberException;
import com.abc.mobile.wallet.service.WalletTransactionService;

@RestController
@RequestMapping("tra")
public class WalletTransactionRestController {

	@Autowired
	WalletTransactionService transactionService;
	
	public WalletTransactionRestController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("------- Inside Transaction Constructor ----");
	}
	
	@GetMapping("/alltransactions")
	public List<WalletTransaction> getAllTransactions()
	{
		return transactionService.getAllTransactions();
	}
	
	/*@GetMapping("/admin/accounts/transactions?sort=Datewise")
	public List<WalletAccount> getAccountsBasedonTransactionDatewise(HttpServletRequest req)throws InvalidWalletAccountNumberException
	{
		HttpSession session = req.getSession(false);
		if(session != null)
		{
			 String role = (String)session.getAttribute("role");
		     if(role.equals("admin"))
		    		 {
		    	        return walletAccountService.getAllAccounts();
		    		 }
		     else {
		    	 String username = (String)session getAttribute("username");
		    	 throw new UnAuthorizedUserException(username);
		     }
		    		 
	}*/

}