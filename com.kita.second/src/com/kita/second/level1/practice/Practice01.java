package com.kita.second.level1.practice;

public class Practice01 {
	// 구구단 2단 찍기 메소드
	// 2 * 1 = 2
	// 2 * 2 = 4
	// ...
	// 2 * 9 = 18
	public static void main(String[] args) {
//		printGugudan();
//		System.out.println();
//		printGugudan2(5);
		
//		printStars(3, 5);
	}
	
	public static void printGugudan() {
		for(int i = 1; i < 10; i++) { 
			System.out.printf("2 * %d = %d\n", i, i * 2); 
				
		}
	}
	
	// 오버로딩(Overloading)
	// 매개변수의 1.개수  2.타입  3.위치
	public static void printGugudan2(int dan) {
		for(int i = 1; i < 10; i++) { 
			System.out.printf("%d * %d = %d\n", dan, i, i * dan); 
		}	
	}


//	public static void printGugudan2(int dan, int max) {
//		for(int i = 1; i < 10; i++) { 
//			System.out.printf("%d * %d = %d\n", dan, i, i * dan); 
//		}	
//	}
//}
	
//	public static void printGugudan2(String max, int max) {
//		for(int i = 1; i < 10; i++) { 
//			System.out.printf("%d * %d = %d\n", dan, i, i * dan); 
//		}	
//	}
//}

	// 별찍기 메소드
	// 내가 입력하는 값에 따라 line(줄)과 star(별 개수)가 달라지도록
	// line: 3, star: 5
	// *****
	// *****
	// *****

	public static void printStars(int line, int star) {
		for(int i = 0; i < line; i++) {
			for(int z = 0; z < star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
}








