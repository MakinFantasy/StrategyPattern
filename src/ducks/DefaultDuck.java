package ducks;

import abstractions.ducks.Duck;
import actions.fly.WingsFly;
import actions.quack.LoudQuack;

public class DefaultDuck extends Duck {
    public DefaultDuck () {
        flyBehavior = new WingsFly();
        quackBehavior = new LoudQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm just a default duck!");
    }
}
