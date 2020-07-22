package com.swayaan.ms.accountservice.model;

import java.io.Serializable;

import javax.persistence.Entity;

public class Accounts implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7348695558518340627L;
	deposits [] deposits;
	creditCards [] creditCards;
	loans [] loans;
	bancassurances [] bancassurances;
	investments [] investments;
	
	public Accounts() {
		super();
	}
	
	public Accounts(deposits [] deposits,creditCards []  creditCards, loans [] loans
			, bancassurances [] bancassurances, 
			 investments [] investments) {
		super();
		this.deposits = deposits;
		this.creditCards = creditCards;
		this.loans = loans;
		this.bancassurances = bancassurances;
		this.investments = investments;
	}

	public deposits[] getDeposits() {
		return deposits;
	}

	public void setDeposits(deposits[] deposits) {
		this.deposits = deposits;
	}

	public creditCards[] getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(creditCards[] creditCards) {
		this.creditCards = creditCards;
	}

	public loans[] getLoans() {
		return loans;
	}

	public void setLoans(loans[] loans) {
		this.loans = loans;
	}

	public bancassurances[] getBancassurances() {
		return bancassurances;
	}

	public void setBancassurances(bancassurances[] bancassurances) {
		this.bancassurances = bancassurances;
	}

	public investments[] getInvestments() {
		return investments;
	}

	public void setInvestments(investments[] investments) {
		this.investments = investments;
	}

}