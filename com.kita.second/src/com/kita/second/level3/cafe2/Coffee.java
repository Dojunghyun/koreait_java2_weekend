package com.kita.second.level3.cafe2;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		// Coffee의 필드 name 안에 MenuItem의 name값 넣기
		// Coffee의 필드 price 안에 MenuItem의 price값 넣기
		name = mi.getName();
		price = mi.getPrice();
	}
		
		public String getName() {
			return name;
		}
		
		public int getPrice() {
			return price;
	}
}
