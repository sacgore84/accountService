package com.swayaan.ms.accountservice.model;

import java.io.Serializable;


public class Query implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6542402566892100746L;
	/**
	 * 
	 */
	
	String customerId;
	String filterBy;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFilterBy() {
		return filterBy;
	}

	public void setFilterBy(String filterBy) {
		this.filterBy = filterBy;
	}

	public Query() {
		super();
	}
	
	public Query(String customerId, String filterBy) {
		super();
		this.customerId = customerId;
		this.filterBy = filterBy;
	}

}