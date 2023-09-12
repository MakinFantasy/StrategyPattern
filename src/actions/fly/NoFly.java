package actions.fly;

import interfaces.behaviors.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
