public class MultiArrayExample {
    public static void main(String[] args) {

        // これは2行3列の二次元配列（int型）を作っています
        // [行][列] → つまり2つの配列の中に、それぞれ3つの数値が入る
        int[][] numbers = {
            {1, 2, 3},    // 0行目（最初の配列）
            {4, 5, 6}     // 1行目（次の配列）
        };

        // 配列の中身を表示してみよう！
        // 二重のfor文を使うよ！外側が「行」、内側が「列」
        for (int i = 0; i < numbers.length; i++) {
            // numbers.length は 行の数（＝2）
            for (int j = 0; j < numbers[i].length; j++) {
                // numbers[i].length は 各行の列の数（＝3）
                System.out.print(numbers[i][j] + " "); // 配列の値を出力（改行なし）
            }
            System.out.println(); // 行が終わったら改行
        }

        // 特定の値にアクセスするには numbers[行番号][列番号] を使う
        System.out.println("2行1列目の値は: " + numbers[1][0]); // 結果：4
    }
}
