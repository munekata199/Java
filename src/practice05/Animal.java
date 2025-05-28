package practice04;

//親クラス（スーパークラス）
class Animal {
	String name; // 動物の名前

	 // コンストラクタ（新しく作る時に名前を設定）
	 public Animal(String name) {
		 this.name = name;
	 }

	 // このメソッドは子クラスでオーバーライドされる
	 public void speak() {
		 System.out.println("動物が何かを話します（親クラスのメソッド）");
	 }
}
