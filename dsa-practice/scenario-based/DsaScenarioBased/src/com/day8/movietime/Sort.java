package com.day8.movietime;

import java.time.LocalTime;
import java.util.List;

public class Sort {
	public static void sort(List<Movie> list) {
		for(int i=1 ; i<list.size() ; i++) {
			Movie temp = list.get(i);
			int j=i-1;
			LocalTime time = temp.time;
			
			while(j>=0 && list.get(j).time.compareTo(time) > 0) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, temp);
		}
		System.out.println(list);
	}
}
