package com.kita.second.level3.cafe2;

public class Menu {
	private MenuItem[] arr = new MenuItem[4];
	
	public Menu() {
		arr[0] = new MenuItem("아메리카노", 1500);
		arr[1] = new MenuItem("카페라떼", 2500);
		arr[2] = new MenuItem("카페모카", 3000);
		arr[3] = new MenuItem("카라멜마끼아또", 3500);
	}
	
	public void showMenus() {
		System.out.println("-Menu-");
		for(int i = 0; i < arr.length; i++) {
			MenuItem mi = arr[i];
			System.out.println((i+1)+". "+mi);
		}
			
		}
		public MenuItem choose(int idx) {
			return arr[idx];
	}
}
