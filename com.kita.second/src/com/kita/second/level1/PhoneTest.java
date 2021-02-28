package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone myPhone = new Phone();
//		myPhone.call("엄마");
//		myPhone.color = "파랑";
//		myPhone.phoneName = "아이폰 12";
//		myPhone.owner = "도정현";
//		myPhone.memory = 512;
		myPhone.call("엄마");	
		Phone yourPhone = new Phone();
		
		Phone p1 = new Phone("갤럭시 s20", "빨강", 256);
		p1.setOwner("도정현");
		String p1Owner = p1.getOwner();
		System.out.println("p1의 주인은 " + p1Owner);
		int p1Memory = p1.getMemory();
		System.out.println("p1의 메모리는 " + p1Memory);
		p1.setMemory(512);
		p1Memory = p1.getMemory();
		System.out.println("p1의 메모리는 " + p1Memory);
	}
}
