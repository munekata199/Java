package practice03;

//プログラムの実行開始クラス
public class Main {
	// メインメゾットは全部のクラス含めて一つだけ
	public static void main(String[] args) {
		// Gameクラスのstaticメソッドを使ってゲームスタート
		Game.startGame();
		
		// Characterクラスのstaticメソッドを使って世界名を表示
		Character.showWorld();
		
		// Characterインスタンスを作成（newで2人のキャラを作る）
		Character c1 = new Character("アリス", 100);
		Character c2 = new Character("ボブ", 80);
		
		// キャラクターの状態を表示
		System.out.println("--- キャラクター情報 ---");
		c1.showStatus();
		System.out.println(); // 改行用
		c2.showStatus();
		
		// Gameクラスのstaticメソッドでゲーム終了
		Game.endGame();
	}
}

