package test;

public class Dog implements Animal {

    @Override
    public void talk() {
        System.out.println("I am a dog! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("I eat dog food!");
    }

    public int getResult() {
        return 1;
    }
}
