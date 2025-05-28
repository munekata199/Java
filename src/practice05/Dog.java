package practice04;

//子クラス（サブクラス）Dog は Animal2 を継承する
class Dog extends Animal {

	 // 子クラスのコンストラクタ。親クラスのコンストラクタを呼び出す
	 public Dog(String name) {
		 super(name); // 親クラスのnameを設定する
	 }

	 // speak メソッドをオーバーライドする（上書きする）
	 @Override
	 public void speak() {
		 // オーバーライドされたメソッドの中で親のname変数を使っている
		 System.out.println(name + "：ワンワン！（Dogクラスのspeak）");
	 }
}
