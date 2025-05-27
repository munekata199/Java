package practice03;

//キャラクターを表すクラス
//Main.javaにmainメゾットあるからmainメゾットはいらない
public class Character {
	
	// static変数（すべてのキャラクターに共通の情報）
	public static String worldName = "ファンタジーランド";
	
	// インスタンス変数（キャラクターごとに異なる情報）
	public String name;  // 名前
	public int hp;       // 体力
	
	// コンストラクタ（Characterインスタンスを作成するときに名前とHPを渡す）
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	
	// インスタンスメソッド（キャラの情報を表示)
	// <インスタンス名>.showStatus(); のインスタンスのnameとHPが使われる
	public void showStatus() {
		System.out.println("名前：" + name);
		System.out.println("HP：" + hp);
	}

	// staticメソッド（全キャラクター共通の世界名を表示）
	public static void showWorld() {
		System.out.println("この世界の名前は：" + worldName + " です");
	}
}
