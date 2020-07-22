package com.swayaan.ms.accountservice.model;

import java.io.Serializable;


public class AccountRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4605609181583173288L;
	Query query;
	
	public AccountRequest(Query query) {
		super();
		this.query = query;
	}
	
	public AccountRequest() {
		super();
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}
	
	
}