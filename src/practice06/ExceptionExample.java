package practice05;
// 自作例外クラスを作成（Exceptionを継承）
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // 親のコンストラクタにメッセージを渡す
    }
}

public class ExceptionExample {

    // 年齢をチェックするメソッド（throws付きで例外を呼び出し元に渡す）
    public static void checkAge(int age) throws InvalidAgeException {
        // 例外をスロー（throw）する条件を記述
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("年齢が不正です。0〜150の間で入力してください。");
        }
        System.out.println("年齢は妥当です: " + age + "歳");
    }

    public static void main(String[] args) {
        try {
            checkAge(25); // 妥当な年齢
            checkAge(-5); // 例外が発生する（負の数）
        } catch (InvalidAgeException e) {
            // catchで自作例外を受け取ってエラーメッセージを表示
            System.out.println("エラー: " + e.getMessage());
        }

        System.out.println("プログラム終了");
    }
}
