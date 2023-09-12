package ducks;

import abstractions.ducks.Duck;
import actions.fly.NoFly;
import actions.quack.NoQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm just a toy duck!");
    }

}
