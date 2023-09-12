package actions.quack;

import interfaces.behaviors.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack  :(");
    }
}
