package practice03;

// ゲーム全体を管理するクラス
// Main.javaにmainメゾットあるからmainメゾットはいらない
public class Game {

	// staticメソッド：voidなので戻り値なし，ゲーム開始のメッセージを表示して終り
	public static void startGame() {
		System.out.println("=== ゲームスタート！ ===");
	}

	// staticメソッド：voidなので戻り値なし，ゲーム終了のメッセージを表示して終り
	public static void endGame() {
		System.out.println("=== ゲーム終了！おつかれさまでした ===");
	}
}
