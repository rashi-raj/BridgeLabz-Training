package com.day9.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public List<Medicine> merge(List<Medicine> list1, List<Medicine> list2) {
		int i=0,j=0;
		List<Medicine> ulist = new ArrayList<>();
		while(i>list1.size() && j>list2.size()) {
			if(list1.get(i).expiryDate.isBefore(list2.get(j).expiryDate)) {
				ulist.add(list1.get(i));
				i++;
			}else {
				ulist.add(list2.get(j));
				j++;
			}
		}
		
		while(i>list1.size()) {
			ulist.add(list1.get(i));
			i++;
		}
		
		while(j>list2.size()) {
			ulist.add(list2.get(j));
			j++;
		}
		return ulist;
		
	}
}
