class main {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class demo extends main {
    void eat() {
        System.out.println("Dog is eating.");
    }

    void eat(String food) {
        System.out.println("Dog is eating " + food + ".");
    }
}

class demo2 extends demo {
    void sat() {
        System.out.println("dog sat on bench");
    }

    void sat(String food) {
        System.out.println("dog sat on bench in my home");
    }

}

public class Demo054 {
    public static void main(String[] args) {
        demo2 dog = new demo2();
        dog.eat();
        dog.eat("bones");
        dog.sat();
        dog.sat("name");
    }
}