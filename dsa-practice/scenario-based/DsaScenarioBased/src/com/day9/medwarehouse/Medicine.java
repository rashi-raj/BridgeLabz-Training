package com.day9.medwarehouse;

import java.time.LocalDate;

public class Medicine {
	String name;
	LocalDate expiryDate;
	Boolean isExpiry;
	Medicine(String name, LocalDate expiryDate, Boolean isExpiry){
		this.name = name;
		this.expiryDate = expiryDate;
		this.isExpiry = isExpiry;
	}
	@Override
	public String toString() {
		return "name=" + name + ", expiryDate=" + expiryDate + "";
	}
}
