package practice01;

// ArrayList(可変式のリスト)の例
import java.util.ArrayList; //インポートは勝手に作られる


public class ArrayListExample {
	public static void main(String[] args) {
	 
		// ArrayList：サイズが変わる配列のようなもの
		ArrayList<String> fruits = new ArrayList<>();

		// ArrayListに値を追加するにはaddを使う
		 fruits.add("りんご");
		 fruits.add("バナナ");
		 fruits.add("みかん");
		
		 // 要素の取り出し（for文）
		 // .lengthではなくて.sizeで配列の要素数を所得
		 for (int i = 0; i < fruits.size(); i++) {
			 // get(i)でi番目の要素を取得
		     System.out.println("フルーツ: " + fruits.get(i));
		 }
	}
}
