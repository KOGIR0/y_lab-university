package lesson_2;

public abstract class Animal {
    public Boolean isSleeping = false;

    public abstract String voice();

    public void eat() {
        if(isSleeping) this.isSleeping = false;
    }

    public void sleep() {
        isSleeping = true;
    }

    public void out() {
        if(!isSleeping) {
            System.out.println(this.voice());
        }
    }
}
