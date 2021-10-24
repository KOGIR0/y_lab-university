package lesson_2;

public class Cat extends Animal{

    @Override
    public void voice() {
        if(!this.isSleeping) {
            System.out.println("Meow");
        }
    }

    @Override
    public void eat() {
        if(this.isSleeping) {
            this.wakeUp();
        }
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
        this.isSleeping = true;
    }

    @Override
    public void wakeUp() {
        if(this.isSleeping) {
            System.out.println("Cat woke up");
            this.isSleeping = false;
        }
    }
}
