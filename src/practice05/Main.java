package practice04;

//メインクラス
public class Main {
	 public static void main(String[] args) {
		 // Animal型の変数で Dog型のオブジェクトを作成（ポリモーフィズム）
		 Animal myAnimal = new Dog("ポチ");
		
		 // speakメソッドを呼び出すと、Dogクラスのオーバーライドされたメソッドが実行される！
		 myAnimal.speak();
		
		 // ちなみにnameにもアクセスできる（ただし通常はgetterなどを使うのが安全）
		 System.out.println("名前は：" + myAnimal.name);
	 }
}

/*
 概念				説明
Animal				動物の「親クラス」
Dog					Animal を継承した「子クラス」
@Override			親クラスの speak() を上書きしている
super(name)			親クラスの name を設定する
Animal 				myAnimal = new Dog("ポチ");	ポリモーフィズム（親型で子を扱う）
myAnimal.speak();	子クラスの speak() が呼ばれる（オーバーライド成功）
 */

/*
ポリモーフィズムのまとめ
ポイント							説明
✅ 親クラス型で子クラスを扱える		Animal animal = new Dog(); など
✅ メソッドがオーバーライド
	されていれば子のが呼ばれる		animal.speak() は Dog.speak()
✅ 複数の子をまとめて扱える			Animal[] animals = {new Dog(), new Cat()}
❌ 子クラス固有のメソッドは
	親型では直接呼べない			キャストが必要
*/
