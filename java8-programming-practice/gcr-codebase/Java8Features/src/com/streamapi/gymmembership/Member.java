package com.streamapi.gymmembership;

import java.time.LocalDate;

public class Member {
	String name;
	LocalDate expiryDate;
	
	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
}
