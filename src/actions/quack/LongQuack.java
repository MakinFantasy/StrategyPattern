package actions.quack;

import interfaces.behaviors.QuackBehavior;

public class LongQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack very long");
    }
}
