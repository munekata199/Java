public class ExceptionExample {
    public static void main(String[] args) {

        // tryブロック：例外が発生するかもしれない処理を書く
        try {
            // 0で割ると例外（ArithmeticException）が発生する！
            int a = 10;
            int b = 0;
            int result = a / b; // ここでエラーが発生！

            // もしエラーが発生しなければ、この行も実行されるけど…
            System.out.println("計算結果: " + result);

        } catch (ArithmeticException e) {
            // catchブロック：特定の例外（ここではArithmeticException）を受け取る
            // 例外が起きたときに実行されるコード
            System.out.println("エラー発生！0で割ることはできません。");

            // エラー内容を詳しく知りたいときは以下を使える
            // System.out.println(e.getMessage());
        }

        // finallyブロックは省略可能。必要があれば使う
        // finally {
        //     System.out.println("この部分は例外があってもなくても必ず実行されます。");
        // }

        // プログラムは止まらず続行できる
        System.out.println("プログラム終了！");
    }
}
