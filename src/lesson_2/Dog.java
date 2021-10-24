package lesson_2;

public class Dog extends Animal{

    @Override
    public void voice() {
        if(!this.isSleeping) {
            System.out.println("Woof");
        }
    }

    @Override
    public void sleep() {
        if(!this.isSleeping) {
            System.out.println("Dog goes sleeping...");
            this.isSleeping = true;
        }
    }

    @Override
    public void eat() {
        if(this.isSleeping) {
            this.wakeUp();
        }
    }

    @Override
    public void wakeUp() {
        if(this.isSleeping) {
            this.isSleeping = false;
            System.out.println("Dog wakes up");
        }
    }
}
