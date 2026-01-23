package com.day9.tailorshop;

import java.time.LocalDate;

public class Order {
	String custName;
	LocalDate date;
	Order(String custName, LocalDate date){
		this.custName = custName;
		this.date = date;
	}
	@Override
	public String toString() {
		return "custName = " + custName + ", date = " + date + "";
	}
}
