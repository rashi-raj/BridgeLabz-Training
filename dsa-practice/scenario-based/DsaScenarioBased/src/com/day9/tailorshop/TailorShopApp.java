package com.day9.tailorshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TailorShopApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of orders: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Order> list = new ArrayList<>();
		OrderSort sort = new OrderSort();
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter Customer name: ");
			String name = sc.nextLine();
			System.out.println("Enter delivery date: ");
			String date = sc.nextLine();
			LocalDate deliveryDate = LocalDate.parse(date);
			list.add(new Order(name, deliveryDate));
			sort.insertionSort(list);
		}
		sc.close();
	}
}
