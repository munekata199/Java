package practice02;

//メインクラス（Javaアプリケーションの実行開始点）
public class Main {
	// mainメソッド（プログラムの実行が始まる場所）
	 public static void main(String[] args) {
		// Personクラスのインスタンス（実体）を作成し、"たろう"という名前を渡す
		Person p = new Person("たろう");
		
		// 他のクラス（Personクラス）のメンバ変数（name）にアクセスして表示
		System.out.println("名前は " + p.name + " です");
		 
	    // static変数はインスタンスを作らなくてもクラス名を通してアクセスできる
	    System.out.println("年齢は " + Person.age + " 歳です");
	    
        // greet()メソッドを呼び出してあいさつを表示
        p.greet(); // インスタンスメソッドはインスタンス（p）を使って呼び出す

        // staticメソッドはクラス名を使って呼び出せる
        Person.showAge(); // staticメソッドはインスタンスがなくても使える
	}
}
