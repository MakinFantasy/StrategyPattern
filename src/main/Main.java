package main;

import abstractions.ducks.Duck;
import ducks.BaiterDuck;
import ducks.DefaultDuck;
import ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        BaiterDuck baiterDuck = new BaiterDuck();
        DefaultDuck defaultDuck = new DefaultDuck();
        RubberDuck rubberDuck = new RubberDuck();

        Duck[] ducks = {baiterDuck, defaultDuck, rubberDuck};

        for (Duck duck : ducks) {
            duck.display();
            duck.quack();
            duck.fly();
            System.out.println("||| ------------------ |||");
        }
    }
}
