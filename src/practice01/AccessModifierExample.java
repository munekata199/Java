package practice01;

// アクセス修飾子（カプセル化）

// 見やすいように一つのページでまとめただけでクラス分けはできている

// personクラス
class Person {
	private String name;  // private：外からは直接アクセスできない

	// publicなメソッドでアクセスする（getter/setter）
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}

// 本来ならここから下だけのページと上だけのページをつくる(一番上のパッケージは両方とも必要)
public class AccessModifierExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("山田さん");  // 外からsetNameで値を設定
		System.out.println("名前: " + p.getName());  // getNameで取り出す
	}
}
