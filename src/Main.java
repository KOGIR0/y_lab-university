import lesson_2.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sleep();
        animal.voice();
        animal.eat();
        animal.wakeUp();
        animal.eat();
        animal.voice();

        animal = new Dog();
        animal.eat();
        animal.sleep();
        animal.voice();
        animal.eat();
        animal.voice();
    }
}
