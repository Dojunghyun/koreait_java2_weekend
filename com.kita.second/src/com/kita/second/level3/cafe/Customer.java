package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	MenuItem order(Menu menu) {
		MenuItem mi = new MenuItem("아메리카노", 1500);
		return mi;
	}
	
	public void drinkCoffee(Coffee coffee) {
		String  name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");
	}
}
