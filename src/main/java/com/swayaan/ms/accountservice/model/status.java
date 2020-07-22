package com.swayaan.ms.accountservice.model;

import java.io.Serializable;

import javax.persistence.Entity;

public class status implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2282923532100646315L;
	String code;
	String description;
	
	public status(String code, String description) {
		
		super();
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
