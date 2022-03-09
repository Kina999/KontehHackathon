package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Desk {
	 
	@Id
	private String id;
	private Integer tableNumber;
	
	public Desk() {
		super();
	}
	
	public Desk(String id, Integer order) {
		super();
		this.id = id;
		this.tableNumber = order;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getOrder() {
		return tableNumber;
	}
	public void setOrder(Integer order) {
		this.tableNumber = order;
	}
	
	
	
}
