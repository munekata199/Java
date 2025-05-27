package practice01;

// staticとインスタンス

// 見やすいように一つのページでまとめただけでクラス分けはできている

// カウンタークラス
class Counter {
	static int count = 0;  // static：すべてのインスタンスで共通

	public void add() {
		count++;
	}
}

//本来ならここから下だけのページと上だけのページをつくる(一番上のパッケージは両方とも必要)
public class StaticExample {
	public static void main(String[] args) {
		Counter c1 = new Counter(); // インスタンス作成
		Counter c2 = new Counter(); // インスタンス作成

		c1.add();
		c2.add();  // 2回加算される

		// static変数は共通なので2と表示される
		System.out.println("カウント: " + Counter.count);
	}
}

