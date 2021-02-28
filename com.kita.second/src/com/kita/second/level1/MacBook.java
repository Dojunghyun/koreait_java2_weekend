package com.kita.second.level1;

public class MacBook {
	// 메모리, 가격, 색상
	
	// 메모리만
	// 메모리, 가격
	// 메모리, 색상
	// 메모리, 가격, 색상
	
	// 웹서핑을 한다, 코딩을 한다
	// ㅇㅇ에게 이메일을 보낸다
	
	int memory;
	String color;
	int cost;
	
	public MacBook() {}
	public MacBook(int memory, String color, int cost) {
		this.memory = memory;
		this.color =  color;
		this.cost = cost;
	}
	void websurf() {
		System.out.println("웹서핑을 한다.");
	}
	void coding() {
		System.out.println("코딩을 한다.");
	}
	void email(String person) {
		System.out.println(person + "에게 이메일을 보낸다.");
	}
}
