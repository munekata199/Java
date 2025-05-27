package practice01;

// クラスとオブジェクトの関係の例

//見やすいように一つのページでまとめただけでクラス分けはできている

//　Animalクラス
class Animal {
	String name;

	// メソッド：動作を定義
	void speak() {
		System.out.println(name + " が鳴いています");
	}
}

//本来ならここから下だけのページと上だけのページをつくる(一番上のパッケージは両方とも必要)
public class ClassObjectExample {
	public static void main(String[] args) {
	    // オブジェクト（インスタンス）を作る
	    Animal dog = new Animal();
	    dog.name = "犬";
	    dog.speak();  // → 犬 が鳴いています
	
	    Animal cat = new Animal();
	    cat.name = "猫";
	    cat.speak();  // → 猫 が鳴いています
	}
}
