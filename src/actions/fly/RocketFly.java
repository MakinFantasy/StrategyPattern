package actions.fly;

import interfaces.behaviors.FlyBehavior;

public class RocketFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I fly with rocket engine!");
    }
}
