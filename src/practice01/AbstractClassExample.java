
package practice01;

//抽象クラス：インスタンス化できない。共通のメソッドを定義できる
abstract class Shape {
	// 抽象メソッド：中身を持たない（サブクラスで必ず実装する）
	abstract void draw();

	// 通常のメソッドも定義可能
	void showInfo() {
		System.out.println("これは図形です。");
	}
}

//サブクラス：抽象クラスを継承して、抽象メソッドを実装する
class Circle extends Shape {
	// drawをオーバーライドして具体的な処理を書く
	 @Override
	 void draw() {
		 System.out.println("○ を描く");
	 }
}

class Square extends Shape {
	 @Override
	 void draw() {
		 System.out.println("□ を描く");
	 }
}

public class AbstractClassExample {
	 public static void main(String[] args) {
		 // 抽象クラスはnewできないので、サブクラスを使う
		 Shape s1 = new Circle();
		 Shape s2 = new Square();
		
		 // オーバーライドされたメソッドが呼ばれる
		 s1.draw();  // ○ を描く
		 s1.showInfo();  // これは図形です。
		
		 s2.draw();  // □ を描く
		 s2.showInfo();  // これは図形です。
	 }
}
