package com.northrapids.demo;

import static com.northrapids.demo.Col.*;

public class Main {
    public static void main(String[] args) {

        Cat kasper = new Cat();
        Dog bjork = new Dog();

        kasper.makeSound();
        kasper.eat();
        kasper.sleep();
        kasper.excrete();

        bjork.makeSound();
        bjork.eat();
        bjork.sleep();
        bjork.excrete();

        String name = "Benny";

        System.out.println(RED + " Hello " + RESET + " World! ");
        System.out.println(BLUE + "Red " + RESET + "Blue");

        System.out.printf("I'm %s Blue %s and I'm %s Green %s %s", BLUE, RESET, GREEN, RESET, name );

    }
}
