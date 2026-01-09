package com.day7.pharmacyinventorysystem;

public interface ISellable {
	void sell(int quantity);
	boolean checkExpiry();
}
