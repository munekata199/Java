// このクラスでは throw と throws の違いを説明するよ！
public class ThrowAndThrowsExample {
    public static void main(String[] args) {
        try {
            // メソッドを呼び出すときに例外が発生するかもしれないので try-catch
            checkAge(15); // 18歳未満なので例外が発生する
        } catch (Exception e) {
            // catchブロックでエラーメッセージを表示
            System.out.println("エラー発生: " + e.getMessage());
        }

        System.out.println("プログラム終了");
    }

    // throws を使うことで「このメソッドは例外を投げる可能性があるよ」と宣言する
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            // throw を使って、自分で例外を発生させる！
            throw new Exception("18歳未満はアクセスできません！");
        }

        // 18歳以上ならこの行が実行される
        System.out.println("ようこそ！アクセスが許可されました。");
    }
}
