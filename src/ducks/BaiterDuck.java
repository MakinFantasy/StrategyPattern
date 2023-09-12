package ducks;

import abstractions.ducks.Duck;
import actions.fly.RocketFly;
import actions.quack.LoudQuack;

public class BaiterDuck extends Duck {
    public BaiterDuck() {
        flyBehavior = new RocketFly();
        quackBehavior = new LoudQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a toy duck for baiting!");
    }
}
