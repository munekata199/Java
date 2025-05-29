// 動物クラス（親クラス）
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + "：何かの動物の鳴き声");
    }
}

// 犬クラス（子クラス）
class Dog extends Animal {
    public Dog(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    // オーバーライド：speakメソッドを犬用に変更
    @Override
    public void speak() {
        System.out.println(name + "：ワンワン！");
    }
}

// 猫クラス（子クラス）
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + "：ニャーニャー！");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Animal型でDogインスタンスを生成 → ポリモーフィズム
        Animal a = new Dog("ポチ");
        a.speak(); // Dogのspeakが呼ばれる（オーバーライド）

        // 通常のインスタンス生成
        Dog d = new Dog("シバ");
        d.speak();

        Cat c = new Cat("ミケ");
        c.speak();
    }
}
