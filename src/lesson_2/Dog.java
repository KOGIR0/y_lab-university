package lesson_2;

public class Dog extends Animal{
    private String name;

    @Override
    public void voice() {
        if(!this.isSleeping && !this.isEating) {
            System.out.println("Woof");
        }
    }

    @Override
    public void sleep() {
        if(this.isEating) {
            System.out.println("Dog " + this.name + " stops eating");
        }
        if(!this.isSleeping) {
            System.out.println("Dog " + this.name + " goes sleeping...");
        }
    }

    @Override
    public void eat() {
        System.out.println("Dog " + this.name + " starts eating...");
        this.isEating = true;
    }

    @Override
    public void wakeUp() {
        if(this.isSleeping) {
            System.out.println("Dog " + this.name + " wakes up");
        }
    }
}
