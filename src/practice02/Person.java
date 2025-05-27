package practice02;

//Personクラスの定義
public class Person {
	
	// メンバ変数（フィールド） name を定義
	public String name;
	
	// コンストラクタ（クラスが作られたときに呼ばれる特別なメソッド）
	public Person(String name) {
		// このクラスのnameに、引数のnameを代入する
		this.name = name;
	}

	// static変数（すべてのPersonクラスで共通のデータ）
	public static int age = 20;


	//mainメゾットはなし
	
	// 非staticメソッド greet（あいさつ用）を定義
	public void greet() {
		// 名前とあいさつを表示する
		System.out.println("\nこんにちは、私は " + name + " です！");
		// 非staticメゾットはstatic変数も非static変数も両方使える
		System.out.println("年齢は " + age + " 歳です!");
	}

	// staticメソッド showAge（年齢を表示）を定義
	public static void showAge() {
		// staticメソッド内ではstatic変数のみ使える
		System.out.println("\nstatic)年齢は " + age + " 歳です");
	}
}
