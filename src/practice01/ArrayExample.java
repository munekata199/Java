package practice01;

// 配列
public class ArrayExample {
	public static void main(String[] args) {
		// 配列：同じ型のデータをまとめて管理する
		String[] fruits = {"りんご", "バナナ", "みかん"};

		// 配列の要素を for 文で表示
		for (int i = 0; i < fruits.length; i++) {
		    System.out.println("フルーツ[" + i + "]：" + fruits[i]);
		}
		
		// 拡張for文（for-each）でも書ける
		for (String fruit : fruits) {
		    System.out.println("好きなフルーツ：" + fruit);
		}
	}
}

