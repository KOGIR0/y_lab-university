import lesson_2.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sleep();
        animal.out();
        animal.eat();
        animal.out();

        animal = new Dog();
        animal.eat();
        animal.sleep();
        animal.out();
        animal.eat();
        animal.out();
    }
}
