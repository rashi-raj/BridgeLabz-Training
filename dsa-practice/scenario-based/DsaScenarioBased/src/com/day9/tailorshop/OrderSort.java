package com.day9.tailorshop;

import java.util.List;

public class OrderSort {
	public void insertionSort(List<Order> list) {
		for(int i=1 ; i<list.size() ; i++) {
			int j = i-1;
			Order o = list.get(i);
			while(j>=0 && list.get(j).date.isAfter(o.date)) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, o);
		}
		
		System.out.println(list);
	}
}
