package com.swayaan.ms.accountservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swayaan.ms.accountservice.model.Account;
import com.swayaan.ms.accountservice.model.Accounts;
import com.swayaan.ms.accountservice.model.AccountRequest;
import com.swayaan.ms.accountservice.model.AccountResponse;
import com.swayaan.ms.accountservice.model.bancassurances;
import com.swayaan.ms.accountservice.model.creditCards;
import com.swayaan.ms.accountservice.model.deposits;
import com.swayaan.ms.accountservice.model.investments;
import com.swayaan.ms.accountservice.model.loans;
import com.swayaan.ms.accountservice.model.status;
import com.swayaan.ms.accountservice.repository.AccountRepository;

@RestController
@RequestMapping("/AccountServices")
public class AccountController {

	
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping(value = "/account/{accountId}")
	public Account findByAccountId(@PathVariable Integer accountId) {
		logger.info("Find by Account ID :"+accountId);
		return accountRepository.findAccountByAccountId(accountId);
	}

	@GetMapping(value = "/account/account-type/{type}")
	public List<Account> findByAccountType(@PathVariable String type) {
		logger.info("Find by Account Type :"+type);
		return accountRepository.findAllByAccountType(type);
	}

	@GetMapping(value = "/account/bank/{bank}")
	public List<Account> findByBank(@PathVariable String bank) {
		logger.info("Find by Bank :"+bank);
		return accountRepository.findByBank(bank);
	}

	@GetMapping(value = "/account/customer/{customer}")
	public List<Account> findByCustomer(@PathVariable Integer customer) {
		logger.info("Find by Customer :"+customer);
		return accountRepository.findAllByCustomerId(customer);
	}

	@PostMapping(value = "/account")
	public Account save(@RequestBody Account account) {
		return accountRepository.save(account);

	}

	@GetMapping(value = "/account")
	public Iterable<Account> all() {
		logger.info("Find all accounts information ");
		return accountRepository.findAll();
	}

	
	@PutMapping(value = "/account")
	public Account update(@RequestBody Account account) {
		logger.info("Find by Account :"+account);
		return accountRepository.save(account);
	}

	@DeleteMapping(value = "/account")
	public void delete(@RequestBody Account account) {
		logger.info("Find by Account :"+account);
		accountRepository.delete(account);
	}
	
	@PostMapping(value = "/account/getAccountDetils")
	@ResponseBody 
	public AccountResponse getAccountDetils(@RequestBody AccountRequest accountRequest) {
		logger.info("Find all accounts information ");
		status status = new status("0000", "Success"); 
		bancassurances [] bancassurances = {new bancassurances("NAME TEST", "00000012004000", "BA", null, "Active")};
		investments [] investments = {new investments("??? ??? ?????", "00013634936555", "MFA", null, "Active")};
		loans [] loans = {new loans("NAME TEST", "00015007651001", "LOC", "9999-12-31", "Active")};
		creditCards [] creditCards = {new creditCards("MIB.REDEMP1", "0011020216150008", "CCA", "2004-03-19", "BLCK B")};
		deposits [] deposits = {new deposits("NAME TEST", "00000012358388", "SDA", "2014-01-05", "Active | ???? (Active)"),
				new deposits("NAME TEST", "0011277829", "DDA", "2013-12-31", "Active | ???? (Active)"),
				new deposits("NAME TEST", "00013634936002", "CDA", "2013-11-03", "Active | ???? (Active)")};
		Accounts accounts = new Accounts(deposits,creditCards,loans,bancassurances,investments);
		AccountResponse accountResponse = new AccountResponse(status, accounts);
		//return accountRepository.findAll();
		return accountResponse;
	}

}
