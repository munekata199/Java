package practice01;

// メゾット分け
public class MethodExample {

	// メソッド：特定の処理をまとめたもの
	// mainメゾットが実行される
	public static void main(String[] args) {
		
		// sayHelloメソッドを呼び出す
		sayHello();  // 挨拶する

		// addNumbersメソッドを使う
		int result = addNumbers(5, 3);  // 5 + 3 を計算
        System.out.println("5 + 3 = " + result);
    }
    
	// sayHello は「こんにちは！」と表示する処理
	// voidなので戻り値はなし。表示して終わり 
	public static void sayHello() {
		System.out.println("こんにちは！");
    }

	// addNumbers は2つの整数を受け取って足し算する
	// 戻り値はint型，returnで返す
	public static int addNumbers(int a, int b) {
		int x = a + b;
		return x;  // 合計をint型で返す
    }
}

