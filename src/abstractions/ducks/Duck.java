package abstractions.ducks;

import interfaces.behaviors.FlyBehavior;
import interfaces.behaviors.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck () {
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public static void swim () {
        // Не хватает данных для реализации метода. Какие должны быть поля и зачем он вообще нужен?
    }

    public void display() {
        // Метод будет переопределен для каждой утки отдельно
    }
}
