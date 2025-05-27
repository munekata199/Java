package practice01;

// while文：条件がtrueの間、繰り返す

public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		// while(条件)と書く．この条件がtrueの間繰り返す
		while (count < 5) {
			System.out.println("カウント: " + count);
			count++;  // カウントを1増やす
		}
		
		// 条件がfalseになったらWhileが終って進む
		System.out.println("countが" + count + "になったので終了");
	}
}
