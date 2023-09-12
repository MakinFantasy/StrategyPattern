package actions.quack;

import interfaces.behaviors.QuackBehavior;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack loudly!");
    }
}
