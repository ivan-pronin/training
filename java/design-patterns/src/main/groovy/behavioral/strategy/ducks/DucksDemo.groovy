package behavioral.strategy.ducks

class DucksDemo {

    static void main(String ... args) {
        Duck d = new Duck()
        d.setFlyAction(new CanFlyAction())
        d.setQuackAction(new LoudQuackAction())
        d.performFly()
        d.performQuack()

        d.setFlyAction(new CannotFlyAction())
        d.performFly()
    }
}
