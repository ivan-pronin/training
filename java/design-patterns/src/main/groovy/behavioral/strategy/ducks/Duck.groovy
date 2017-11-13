package behavioral.strategy.ducks

class Duck {

    IFlyable flyAction
    IQuackable quackAction

    void performQuack() {
        quackAction.quack()
    }

    void performFly() {
        flyAction.fly()
    }
}
