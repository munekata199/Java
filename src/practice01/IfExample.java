package practice01;

// if文
public class IfExample {
	public static void main(String[] args) {
		int score = 75;  // 点数を変えて実験してみよう！
	
		// 条件に応じて処理を分ける
		if (score >= 90) {
			System.out.println("とてもよくできました！");
		} else if (score >= 60) {
			System.out.println("合格です！");
		} else {
			System.out.println("もっとがんばろう！");
		}
    }
}

