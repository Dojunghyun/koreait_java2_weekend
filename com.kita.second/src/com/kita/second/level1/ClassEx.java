package com.kita.second.level1;

public class ClassEx extends Object {
	// 필드
	int field1;
	String field2;
	int[] field3;
	
	// 생성자
	public ClassEx() {
		super();
	}
	
	public ClassEx(int field1) {
		this.field1 = field1 + 1;
	}
	
	public ClassEx(int field1, String field2) {
		this(field1); // ClassEx(field1);
//		this.field1 = field1;
		this.field2 = field2;
	}
	
	public ClassEx(int field1, String field2, int[] field3) {
//		this.field1 = field1;
//		this.field2 = field2;
		this(field1, field2);
		this.field3 = field3;
	}
	
	
	// 메소드
	int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	int sum(int n1, int n2, int n3) {
		int result = sum(sum(n1, n2),n3);
//		int result = sum(n1, n2) + n3;
//		int result = n1 + n2 + n3;
		return result;
	}
	
	int sum(int... arr) {
		// 실행코드
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		return total;
	}
	
	// 매개변수의 1.타입 2.개수 3.위치
}














