package com.swayaan.ms.accountservice.model;

import java.io.Serializable;

import javax.persistence.Entity;

public class loans implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2282923532100646315L;
	String accountTitle;
	String accountNumber;
	String accountType;
	String openDate;
	String accountStatus;
	
	public loans(String accountTitle, String accountNumber,String accountType, String openDate
			,String accountStatus) {
		
		super();
		this.accountTitle = accountTitle;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.openDate = openDate;
		this.accountStatus = accountStatus;
	}

	public String getAccountTitle() {
		return accountTitle;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

}
