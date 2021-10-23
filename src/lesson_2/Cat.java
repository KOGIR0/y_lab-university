package lesson_2;

import java.util.Timer;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

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
        if(this.isEating) return;
        System.out.println("Cat " + this.name + " is eating...");
        this.isEating = true;
    }

    @Override
    public void sleep() {
        if(this.isEating) {
            this.isEating = false;
            System.out.println("Cat " + this.name + " stops eating");
        }
        System.out.println("Cat " + this.name + " is sleeping...");
        this.isSleeping = true;
    }

    @Override
    public void wakeUp() {
        if(this.isSleeping) {
            System.out.println("Cat " + this.name + " woke up");
            this.isSleeping = false;
        }
    }
}
