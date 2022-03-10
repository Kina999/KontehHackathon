package com.example.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class WorkingHours {
	
	private String opens;
	private String closes;
	
	public WorkingHours() {
		super();
	}

	public WorkingHours(String opens, String closes) {
		super();
		this.opens = opens;
		this.closes = closes;
	}
	
	public String getOpens() {
		return opens;
	}
	
	public String getCloses() {
		return closes;
	}
	
}
