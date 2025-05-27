package practice01;

// Scanner（ユーザー入力）の例
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 入力用オブジェクト

		System.out.print("名前1を入力してください: ");
		String name = scanner.nextLine();  // 1行分の文字列を入力として受け取る

		System.out.println("こんにちは、" + name + "さん！");

		// 短縮の紹介
		System.out.print("名前2を入力してください: ");
		String name1 = (new Scanner(System.in)).nextLine();  // 1行分の文字列を入力として受け取る

		System.out.println("こんにちは、" + name1 + "さん！");
		
		scanner.close();  // 入力ストリームを閉じる（おまじない）
	}
}
