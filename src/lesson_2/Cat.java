package lesson_2;

public class Cat extends Animal{
    private String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        if(!this.isEating && !this.isSleeping) {
            System.out.println("Meow");
        }
    }

    @Override
    public void eat() {
        if(this.isSleeping) {
            this.wakeUp();
        }
        if(this.isEating) return;
        System.out.println("Cat " + this.name + " is eating...");
        this.isEating = true;
    }

    @Override
    public void sleep() {
        if(this.isEating) {
            System.out.println("Cat " + this.name + " stoped eating");
        }
        System.out.println("Cat " + this.name + " is sleeping...");
        this.isSleeping = true;
    }

    @Override
    public void wakeUp() {
        System.out.println("Cat " + this.name + " woke up");
    }
}
