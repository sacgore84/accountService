package com.swayaan.ms.accountservice.model;

import java.io.Serializable;


public class AccountResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128749874517276263L;
	status status ;
	Accounts accounts;
	
	public AccountResponse(status status,Accounts accounts) {
		super();
		this.status = status;
		this.accounts = accounts;
	}

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	
	

}