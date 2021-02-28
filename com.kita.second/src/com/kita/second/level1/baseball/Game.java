package com.kita.second.level1.baseball;

public class Game {
	// 실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myball = new MyBall(gameCnt);
		
		
//		do { 실행코드 } while(boolean값);
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myball));
		
		System.out.println("야구게임  종료!");
	}
}
