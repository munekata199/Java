
package practice01;

// 継承の例
class Animal2 {
	String name = "ポチ";
    void speak() {
        System.out.println("動物が鳴いています");
    }
}

class Dog extends Animal2 {
	String name = "クロ";
    // オーバーライド（親クラスのメソッドを上書き）
    @Override
    void speak() {
        System.out.println("ワンワン！（犬が鳴いています）");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
    	//親クラスの型で、子クラスのインスタンスを扱う
    	//ことをポリモーフィズムというが、
    	//今回はポリモーフィズムしない
        Animal2 a = new Animal2();
        a.speak();  // 動物が鳴いています
        System.out.println(a.name);

        Dog d = new Dog();
        d.speak();  // ワンワン！（犬が鳴いています）
        System.out.println(d.name);
        
        
    }
}