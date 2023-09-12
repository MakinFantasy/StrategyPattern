package actions.fly;

import interfaces.behaviors.FlyBehavior;

public class WingsFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with wings!");
    }
}
