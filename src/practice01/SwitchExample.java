package practice01;

// switch文：変数の値に応じて処理を分ける

public class SwitchExample {
	public static void main(String[] args) {
		int number = 2;  //<--ここ書き換えて確認してみて

		// numberが何かで結果が変わる
		switch (number) {
			case 1: System.out.println("1が選ばれました");
				break;
			case 2: System.out.println("2が選ばれました");
					break;
			case 3: System.out.println("3が選ばれました");
					break;
			default:System.out.println("その他の数字です");
		}
    }
}
