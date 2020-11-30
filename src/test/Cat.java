package test;

import java.util.Random;

public class Cat implements Animal {

    @Override
    public void talk() {
        System.out.println("I'm a cat! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("I eat fish!");
    }

    public int getRandomNumber() {
        Random random = new Random();

        return random.nextInt(10);
    }

}
