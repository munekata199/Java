package practice01;

// for文
public class ForExample {
	public static void main(String[] args) {
		
		// 同じ処理を繰り返すときに使う
		// ここでは 0〜4 までの数字を順番に表示する
		// for (初期値設定; 制御式; 後始末)で書く
		for (int i = 0; i < 5; i++) {
			// i はループのカウンター（0,1,2,3,4）
			System.out.println("i の値は：" + i);
        }
    }
}

